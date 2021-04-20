package DiscordClasses;

import APIClasses.APIAdvisories;
import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;

import java.awt.*;

public class BARTBotAdvisories {

    public void getAdvisories(GuildMessageReceivedEvent event) {
        EmbedBuilder eb = new EmbedBuilder();
        eb.setColor(Color.GREEN);
        eb.setTitle(":information_source: Advisories");
        eb.addField("Current system advisories:", new APIAdvisories().getAdvisories(), true);
        event.getChannel().sendMessage(eb.build()).queue();
    }
}