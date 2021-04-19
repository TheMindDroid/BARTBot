package DiscordClasses;

import ComputationalClasses.AddDatedFooter;
import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.awt.*;

public class BARTBotHelp extends ListenerAdapter {

    public void onGuildMessageReceived(GuildMessageReceivedEvent event) {

        String messageSent = event.getMessage().getContentRaw();

        if (!messageSent.equalsIgnoreCase("!help")) {
            return;
        }

        //Creates an EmbedBuilder class to format list of commands to be sent to Discord servers
        EmbedBuilder eb = new EmbedBuilder();
        eb.setColor(Color.RED);
        eb.setTitle(":question: Help :question:");
        eb.setAuthor("Command Usage: !bart <command>");
        eb.addField("!help", "Displays this help message.", true);
        eb.addField("Map", "Displays image of the system map.", true);
        eb.addField("Advisories", "Displays current system advisories.", true);
        eb.addField("Trains", "Displays current number of trains in service.", true);
        eb.addField("Elevators", "Displays current status of system elevators.", true);
        eb.addField("Abbreviations", "Displays list of station names and their abbreviations", true);
        eb.addField("Departures <station name>", "Displays schedule of departing trains from a given station.", true);
        eb.addField("Fare <origin> <destination>", "Calculates fare cost of a trip given origin and destination stations.", true);
        eb.setFooter(new AddDatedFooter().addDatedFooter());
        event.getChannel().sendMessage(eb.build()).queue();
    }
}