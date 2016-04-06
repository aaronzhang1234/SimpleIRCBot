package hopefully;

import org.jibble.pircbot.*;
public class CatFact extends PircBot {
	
	public CatFact(String name)
	{
		setName(name);
	}
	public void onMessage(String channel, String sender,String login, String hostname, String message) {
		if (message.equalsIgnoreCase("@catfacts")) 
		{
			sendMessage(channel, "CATS CANNOT BREATHE");
		}
		if(message.equalsIgnoreCase("!John Madden Fact"))
		{
			sendMessage(channel, "John Madden doesn't sleep");
		}
		if(message.equalsIgnoreCase("damn daniel"))
		{
			kick(channel, sender, "please, no memers allowed");
		}
		if(message.equalsIgnoreCase("Change your nickname"))
		{
			for(int i =0;i<10;i++)
			{
				changeNick("Chatbot" + i);
			}
		}
		
	}

	
}
