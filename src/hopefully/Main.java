package hopefully;

import java.io.IOException;
import java.util.ArrayList;

import org.jibble.pircbot.IrcException;
import org.jibble.pircbot.NickAlreadyInUseException;

import commandsToDo.Jokes;
import commandsToDo.RSSFeed;
import commandsToDo.Trivia;

public class Main {

	static ArrayList<String>test;
	
	public static void main(String[] args) throws NickAlreadyInUseException, IOException, IrcException {
		  BotBot bot = new BotBot("bot123");
		 
		  
		 
		  
			bot.setVerbose(true);
			bot.connect("irc.freenode.net");
			bot.joinChannel("#nimby");
			bot.sendMessage("#nimby", "HELLO I AM A BOT!! but I am a helpful bot.");
			bot.sendMessage("#nimby", "please say @botcommands in order to see what I can do");	

	}
}