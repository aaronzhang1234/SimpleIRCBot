package hopefully;

import java.io.IOException;

import org.jibble.pircbot.IrcException;
import org.jibble.pircbot.NickAlreadyInUseException;

public class Main {

	public static void main(String[] args) throws NickAlreadyInUseException, IOException, IrcException {
		CatFact cat = new CatFact("botter");
		
	
			cat.setVerbose(true);
			cat.connect("irc.freenode.net");
			cat.joinChannel("#nimbyesttest");
			cat.sendMessage("#nimbyesttest", "HELLO I AM A BOT \n I am a helpful bot. \n please say @botcommands in order to see what I can do");
			
			

	

	}
}