package discord;

import computation.AddDatedFooter;
import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import wrapper.APITrainCount;

import java.awt.*;

public class BARTBotTrainCount {

    //Builds the Discord embed for the train count API
    public void getTrainCount(GuildMessageReceivedEvent event) {
        EmbedBuilder eb = new EmbedBuilder();
        eb.setColor(Color.GREEN);
        eb.setTitle(":train2: Train Count");
        eb.addField("Current number of trains in service:", new APITrainCount().getTrainCount() + " trains.", true);
        eb.setFooter(new AddDatedFooter().addDatedFooter());
        event.getChannel().sendMessage(eb.build()).queue();
    }
}