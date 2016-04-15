package hopefully;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import org.jibble.pircbot.*;

import commandsToDo.CatFact;
import commandsToDo.Jokes;
import commandsToDo.Trivia;
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
		Trivia triv = new Trivia();
		Calendar cal = new GregorianCalendar();
		Calendar up = new GregorianCalendar();
		Jokes joke = new Jokes();
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
		if(message.equalsIgnoreCase("@joke"))
		{
			if(Math.random()*2<1)
			{
				sendMessage(channel,joke.getOneLineJoke());
			}
			else
			{
				ArrayList <String> poke = joke.getMultiLinedJoke();
				sendMessage(channel,poke.get(0));
				try {
					Thread.sleep(10000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				sendMessage(channel,poke.get(1));
				
			}
		}
		if(message.equalsIgnoreCase("@trivia"))
		{
			sendMessage(channel, "TRIVIA STARTU");
			
			sendMessage(channel,triv.getQuestion());
		}
		
	}
	protected void onConnect()
	{
		sendMessage("#nimbyesttest","HELLO I AM ALIVE");
	}
	
	

	
}
