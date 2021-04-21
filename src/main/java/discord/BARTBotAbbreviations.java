package discord;

import computation.StationAbbreviationsMap;
import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;

import java.awt.*;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class BARTBotAbbreviations {

    public void getAbbreviations(GuildMessageReceivedEvent event) {
        EmbedBuilder eb = new EmbedBuilder();
        EmbedBuilder eb2 = new EmbedBuilder();
        eb.setColor(Color.GREEN);
        eb2.setColor(Color.GREEN);
        eb.setTitle(":train2: Station Abbreviations");

        //HashMap that contains the station names and abbreviations
        final LinkedHashMap<String,String> stnAbbrMap = new StationAbbreviationsMap().getStnAbbrMap();

        //Lambda expression that loops through and separates the station names into two embed fields
        AtomicInteger count = new AtomicInteger();
        stnAbbrMap.forEach((abbreviation, fullName) -> {
            if (count.get() < 25) {
                eb.addField(abbreviation.toUpperCase(), fullName, true);
                count.getAndIncrement();
            } else {
                eb2.addField(abbreviation.toUpperCase(), fullName, true);
            }
        });

        event.getChannel().sendMessage(eb.build()).queue();
        event.getChannel().sendMessage(eb2.build()).queue();
    }
}