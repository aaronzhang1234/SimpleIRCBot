package hopefully;

import org.jibble.pircbot.*;
public class CatFact extends PircBot {
	
	public CatFact(String name)
	{
		setName(name);
	}
	public void onMessage(String channel, String sender,String login, String hostname, String message) {
		if (message.equalsIgnoreCase("@catfact")) 
		{
			sendMessage(channel, "CATS CANNOT BREATHE");
		}
		if(message.equalsIgnoreCase("@botcommands"))
		{
			sendMessage(channel, "@catfact - for a catfact \n@trvia for fun trivia \n @randomkick to be kicked \n@ban to get banned");
		}
		if(message.equalsIgnoreCase("@randomkick"))
		{
			kick(channel, sender);
		}
		if(message.equalsIgnoreCase("@trvia"))
		{
			sendMessage(channel, "@trvia does not work now");
		}
		if(message.equalsIgnoreCase("@ban"))
		{
			sendMessage(channel, "cannot ban unless operator");
		}
		if(message.equalsIgnoreCase("Change your nickname"))
		{
			for(int i =0;i<10;i++)
			{
				changeNick("Chatbot" + i);
			}
		}
		
	}
	protected void onConnect()
	{
		sendMessage("#nimbyesttest","HELLO I AM ALIVE");
	}
	
	

	
}
