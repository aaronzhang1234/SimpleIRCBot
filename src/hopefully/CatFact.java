package hopefully;

import java.io.IOException;
import java.util.ArrayList;

import org.jibble.pircbot.*;
public class CatFact extends PircBot {
	
	
	ArrayList<String> cats;
	ArrayList<String> triviaAnswers;
	ArrayList<String> triviaQuestions;
	
	public CatFact(String name)
	{
		setName(name);
	}
	
	
	public void onMessage(String channel, String sender,String login, String hostname, String message) 
	{
		ReadTxtDocuments reader = new ReadTxtDocuments();
		if (message.equalsIgnoreCase("@catfact"))  
		{
			
			
			try 
			{
				cats = reader.getCatFact();
			} 
			catch (IOException e) 
			{
				e.printStackTrace();
			}

			sendMessage(channel, cats.get((int)(Math.random()*cats.size())));
			
		}
		if(message.equalsIgnoreCase("@botcommands"))
		{
			sendMessage(channel, "@catfact - for a catfact");
			sendMessage(channel, "@trivia   - for fun trivia");		
			
		}
		if(message.equalsIgnoreCase("@trvia"))
		{
			try {
				triviaAnswers = reader.getTriviaAnswers();
				triviaQuestions = reader.getTriviaQuestions();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			for(int i = 0;i<triviaAnswers.size();i++)
			{

				System.out.println(triviaAnswers.get(i));
			}
		}
		
	}
	protected void onConnect()
	{
		sendMessage("#nimbyesttest","HELLO I AM ALIVE");
	}
	
	

	
}
