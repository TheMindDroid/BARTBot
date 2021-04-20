package discord;

import computation.StationAbbreviationsMap;
import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;

import java.awt.*;
import java.util.HashMap;

public class BARTBotAbbreviations {

    public void getAbbreviations(GuildMessageReceivedEvent event) {
        EmbedBuilder eb = new EmbedBuilder();
        eb.setColor(Color.GREEN);
        eb.setTitle(":train2: Station Abbreviations");

        //Loop through HashMap to get the abbreviation and station name for each station
        final HashMap<String,String> stnAbbrMap = new StationAbbreviationsMap().getStnAbbrMap();
        stnAbbrMap.forEach((abbreviation, fullName) -> eb.addField(abbreviation.toUpperCase(), fullName, true));

        event.getChannel().sendMessage(eb.build()).queue();
    }
}