package DiscordClasses;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;

import java.awt.*;

public class BARTBotErrorMessage {

    private final GuildMessageReceivedEvent event;
    private final String errorType;
    private final String message;

    public BARTBotErrorMessage(GuildMessageReceivedEvent event, String errorType, String message) {
        this.event = event;
        this.errorType = errorType;
        this.message = message;
    }

    //Creates an EmbedBuilder class to format error messages to be sent to Discord servers
    public void sendErrorMessage() {
        EmbedBuilder eb = new EmbedBuilder();
        eb.setColor(Color.RED);
        eb.setTitle(":warning: Error :warning:");
        eb.addField(errorType, message, true);
        event.getChannel().sendMessage(eb.build()).queue();
    }
}