package commandsToDo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

public class RSSFeed {

	public ArrayList readRSS(String url) throws IOException
	{
		URL rssUrl;
		
		rssUrl = new URL(url);
		
		BufferedReader in = new BufferedReader(new InputStreamReader(rssUrl.openStream()));
		
		String sourceCode ="";
		ArrayList <String> news = new ArrayList<>();
		int i =0;
		String line;
		while((line = in.readLine())!=null)
		{
			if(line.contains("<title>"))
			{
				
				String temp = line.replace("<title>", "");
				temp=temp.substring(0, temp.indexOf("</title>"));
				if(!(temp.contains("VIDEO:")))
				{
					System.out.println(temp);
				}
				if(!(temp.contains("VIDEO:")))
				{
					news.add(temp);
				}
			
						
			}
//			if(line.contains("<description>"))
//			{
//				String temp = line.replace("<description>", "");
//				temp=temp.substring(0,temp.indexOf("</description>"));
//				sourceCode += temp + "\n";
//				i++;
//			}
			
			
		
		}
		in.close();
		return news;
		
	}
}
