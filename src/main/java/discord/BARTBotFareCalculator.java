package discord;

import computation.AddDatedFooter;
import computation.DecimalFormatter;
import computation.StationAbbreviationsMap;
import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import wrapper.APIFareCalculator;

import java.awt.*;

public class BARTBotFareCalculator {

    private final String origin;
    private final String destination;

    BARTBotFareCalculator(String origin, String destination) {
        this.origin = origin;
        this.destination = destination;
    }

    public void getFare(GuildMessageReceivedEvent event) {

        StationAbbreviationsMap map = new StationAbbreviationsMap();

        //Checks to see if user entered abbreviations match the HashMap
        if (!map.containsAbbreviation(origin) || !map.containsAbbreviation(destination)) {
            new BARTBotErrorMessage(event, "Invalid Abbreviations.",
                    "Incorrect station abbreviation entered. Type '!BART Abbreviations' " +
                            "for a list of station abbreviations.").sendErrorMessage();
            return;
        }

        APIFareCalculator fare = new APIFareCalculator(origin, destination);
        EmbedBuilder eb = new EmbedBuilder();

        eb.setColor(Color.GREEN);
        eb.setTitle(":moneybag: Fare");
        eb.setAuthor("Fare from " + map.getStationName(origin) + " to " + map.getStationName(destination) + ":");
        eb.addField("\nClipper Card/Ticket:",
                    "Fare: **$" + fare.getClipper() + "**\nRound Trip: **$"
                            + new DecimalFormatter(Float.parseFloat(fare.getClipper()) * 2).format() + "**", true);
        eb.addField("\nYouth Clipper:",
                    "Fare: **$" + fare.getYouthClipper() + "**\nRound Trip: **$"
                            + new DecimalFormatter(Float.parseFloat(fare.getYouthClipper()) * 2).format() + "**", true);
        eb.addField("\nSenior Clipper:",
                    "Fare: **$" + fare.getSeniorClipper() + "**\nRound Trip: **$"
                            + new DecimalFormatter(Float.parseFloat(fare.getSeniorClipper()) * 2).format() + "**", true);

        eb.setFooter(new AddDatedFooter().addDatedFooter());
        event.getChannel().sendMessage(eb.build()).queue();
    }
}