package discord;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import computation.AddDatedFooter;
import computation.StationAbbreviationsMap;
import computation.StationThumbnailMap;
import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import wrapper.APIDepartures;

import java.awt.*;

public class BARTBotDepartures {

    final private String origin;

    BARTBotDepartures(String origin) {
        this.origin = origin;
    }

    public void getDepartures(GuildMessageReceivedEvent event) {

        StationAbbreviationsMap map = new StationAbbreviationsMap();

        if (!map.containsAbbreviation(origin)) {
            new BARTBotErrorMessage(event, "Invalid Abbreviations.",
                    "Incorrect station abbreviation entered. Type '!BART Abbreviations' " +
                            "for a list of station abbreviations.").sendErrorMessage();
            return;
        }

        APIDepartures apiDepartures = new APIDepartures(origin);
        JsonArray stationArray = apiDepartures.getDeparturesArray();

        String thumbnail = new StationThumbnailMap().getStationThumbnail(origin);

        EmbedBuilder eb = new EmbedBuilder();
        eb.setTitle(":arrow_left: Departures From " + map.getStationName(origin));
        eb.setThumbnail(thumbnail);
        eb.setColor(Color.GREEN);

        for (JsonElement stations : stationArray) {

            JsonArray etdArray = stations.getAsJsonObject().getAsJsonArray("etd");

            for (JsonElement etd : etdArray) {

                String fieldTitle = ":station: Destination: " + etd.getAsJsonObject().get("destination").getAsString();
                StringBuilder sb = new StringBuilder();
                JsonArray estimates = etd.getAsJsonObject().getAsJsonArray("estimate");

                for (JsonElement estimate : estimates) {
                    sb.append("Minutes: **").append(estimate.getAsJsonObject().get("minutes").getAsString()).append("**").append("\n");
                }

                eb.addField(fieldTitle, sb.toString(), true);
            }
        }
        eb.setFooter(new AddDatedFooter().addDatedFooter());
        event.getChannel().sendMessage(eb.build()).queue();
    }
}