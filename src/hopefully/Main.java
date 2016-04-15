package hopefully;

import java.io.IOException;
import java.util.ArrayList;

import org.jibble.pircbot.IrcException;
import org.jibble.pircbot.NickAlreadyInUseException;

public class Main {

	static ArrayList<String>test;
	
	public static void main(String[] args) throws NickAlreadyInUseException, IOException, IrcException {
		  BotBot bot = new BotBot("botter");

			bot.setVerbose(true);
			bot.connect("irc.freenode.net");
			bot.joinChannel("#nimbyesttest");
			bot.sendMessage("#nimbyesttest", "HELLO I AM A BOT!! but I am a helpful bot.");
			bot.sendMessage("#nimbyesttest", "please say @botcommands in order to see what I can do");	

	}
}