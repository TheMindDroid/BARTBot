package DiscordClasses;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;

import javax.security.auth.login.LoginException;

public class BARTBot {
    //Main class that initiates classes required for program execution
    public static void main(String[] args) throws LoginException {
        JDA jda = JDABuilder.createDefault(args[0]).build();
        jda.addEventListener(new BARTBotListener());
        jda.addEventListener(new BARTBotHelp());
    }
}