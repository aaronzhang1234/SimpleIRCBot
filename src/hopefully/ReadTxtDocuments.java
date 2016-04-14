package hopefully;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReadTxtDocuments {

	private ArrayList <String> catfact = new ArrayList<>();
	private ArrayList <String> triviaQuestions = new ArrayList<>();
	private ArrayList <String> triviaAnswers = new ArrayList<>();	
	
	public ArrayList getCatFact() throws IOException
	{
		BufferedReader br = new BufferedReader(new FileReader("catfacts.txt"));
		
		String line ="";
		
		while((line=br.readLine()) != null)
		{
			catfact.add(line);
		}
		return catfact;
	}
	public ArrayList getTriviaQuestions() throws IOException
	{
		BufferedReader re = new BufferedReader(new FileReader("trivia.txt"));
		
		int i = 1;
		String line ="";
		
		while((line=re.readLine()) != null)
		{
			if(i%2 == 1)
			{
				triviaQuestions.add(line);
			}
			else
			{
				re.readLine();
			}
			i++;
		}
		return triviaQuestions;
	}
	public ArrayList getTriviaAnswers() throws IOException
	{

		BufferedReader re = new BufferedReader(new FileReader("trivia.txt"));
		
		int i = 1;
		String line ="";
		
		while((line=re.readLine()) != null)
		{
			if(i%2 == 0)
			{
				triviaAnswers.add(line);
			}
			else
			{
				re.readLine();
			}
			i++;
		}
		return triviaAnswers;
	}
	
	
	
}
