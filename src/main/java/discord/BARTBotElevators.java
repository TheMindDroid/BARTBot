package discord;

import wrapper.APIAdvisories;
import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;

import java.awt.*;

public class BARTBotElevators {

    public void getElevators(GuildMessageReceivedEvent event) {
        EmbedBuilder eb = new EmbedBuilder();
        eb.setColor(Color.GREEN);
        eb.setTitle(":elevator: Elevators");
        eb.addField("Current system elevator status:", new APIAdvisories().getElevatorStatus(), true);
        event.getChannel().sendMessage(eb.build()).queue();
    }
}