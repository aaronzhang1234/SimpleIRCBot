package hopefully;

import java.io.IOException;
import java.util.ArrayList;

import org.jibble.pircbot.*;
public class CatFact extends PircBot {
	
	ArrayList<String> cats;
	
	public CatFact(String name)
	{
		setName(name);
	}
	
	public void onMessage(String channel, String sender,String login, String hostname, String message) {
		if (message.equalsIgnoreCase("@catfact")) 
		{
			ReadTxtDocuments reader = new ReadTxtDocuments();
			try 
			{
				cats = reader.getCatFact();
			} 
			catch (IOException e) 
			{
				e.printStackTrace();
			}
			int random =(int) Math.random()*cats.size();
			
			sendMessage(channel, cats.get(random));
			
		}
		if(message.equalsIgnoreCase("@botcommands"))
		{
			sendMessage(channel, "@catfact - for a catfact");
			sendMessage(channel, "@trvia for fun trivia");		
			
		}
		if(message.equalsIgnoreCase("@trvia"))
		{
			sendMessage(channel, "@trvia does not work now");
		}
		
	}
	protected void onConnect()
	{
		sendMessage("#nimbyesttest","HELLO I AM ALIVE");
	}
	
	

	
}
