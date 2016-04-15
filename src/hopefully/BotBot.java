package hopefully;

import java.io.IOException;
import java.util.ArrayList;

import org.jibble.pircbot.*;

import commandsToDo.CatFact;
public class BotBot extends PircBot {
	
	
	ArrayList<String> cats;
	ArrayList<String> triviaAnswers;
	ArrayList<String> triviaQuestions;
	
	public BotBot(String name)
	{
		setName(name);
	}
	
	
	public void onMessage(String channel, String sender,String login, String hostname, String message) 
	{
		CatFact cat = new CatFact();
		if (message.equalsIgnoreCase("@catfact"))  
		{
			try {
				sendMessage(channel, cat.getCatFact() + "MeWow");
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		if(message.equalsIgnoreCase("@botcommands"))
		{
			sendMessage(channel, "@catfact - for a catfact");
			sendMessage(channel, "@trivia   - for fun trivia");		
			
		}
//		if(message.equalsIgnoreCase("@trvia"))
//		{
//			sendMessage(channel, "TRIVIA STARTU");
//			
//			for(int i =0; i<10;i++)
//			{
//				send Message(channel,)
//			}
//		}
//		
	}
	protected void onConnect()
	{
		sendMessage("#nimbyesttest","HELLO I AM ALIVE");
	}
	
	

	
}
