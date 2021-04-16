package DiscordClasses;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;

import java.awt.*;

public class BARTBotSystemMap {

    public void getStationMap (GuildMessageReceivedEvent event) {
        //Builds an embed containing the system map to be sent to Discord servers
        EmbedBuilder eb = new EmbedBuilder();
        eb.setColor(Color.GREEN);
        eb.setTitle(":tram: BART System Map");
        eb.setImage("https://www.bart.gov/sites/default/files/images/basic_page/system-map-weekday.png");
        event.getChannel().sendMessage(eb.build()).queue();
    }
}
