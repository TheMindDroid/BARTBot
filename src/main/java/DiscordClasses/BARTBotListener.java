package DiscordClasses;

import APIClasses.APIAdvisories;
import APIClasses.APIFareCalculator;
import APIClasses.APITrainCount;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public class BARTBotListener extends ListenerAdapter {

    public void onGuildMessageReceived(@NotNull GuildMessageReceivedEvent event) {

        String[] messageSentArray = event.getMessage().getContentRaw().split(" ");

        if (Objects.requireNonNull(event.getMember()).getUser().isBot()) {
            return;
        }

        if (!messageSentArray[0].equalsIgnoreCase("!bart")) {
            return;
        }

        if (messageSentArray.length == 1) {

            //TESTING IN PROGRESS!!!

            /*APIFareCalculator fareCalculator = new APIFareCalculator("civc","lafy");
            event.getChannel().sendMessage("Standard Fare (Clipper or Ticket): $" + fareCalculator.getClipper()
                    + "\nYouth Clipper: $" + fareCalculator.getYouthClipper()
                    + "\nSenior Clipper: $" + fareCalculator.getSeniorClipper()).queue();

            event.getChannel().sendMessage(new APIAdvisories().getAdvisories()).queue();
            event.getChannel().sendMessage(new APIAdvisories().getElevatorStatus()).queue();*/
            event.getChannel().sendMessage( "There are currently "
                                            + new APITrainCount().getTrainCount()
                                            + " trains in service.").queue();
        }
    }
}