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
	private ArrayList <String> oneLineJokes = new ArrayList<>();
	private ArrayList <String> jokeQuestions = new ArrayList<>();
	private ArrayList <String> jokeAnswers = new ArrayList<>();
	
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
			
			i++;
		}
		return triviaAnswers;
	}
	public ArrayList oneLineJokes() throws IOException
	{
		BufferedReader br = new BufferedReader(new FileReader("jokes.txt"));
		
		String line = "";
		
		while ((line=br.readLine())!=null)
		{
			if(!(line.substring(line.length()-1).equals("?")) && !(line.substring(line.length()-1).equals("a")))
			{
				oneLineJokes.add(line);
			}
		}
		return oneLineJokes;
	}
	public ArrayList getJokeQuestions() throws IOException
	{
		BufferedReader br = new BufferedReader(new FileReader("jokes.txt"));
		
		String line = "";
		
		while ((line=br.readLine())!=null)
		{
			
			if(line.substring(line.length()-1).equals("?"))
			{
				jokeQuestions.add(line);
			}
		}
		return jokeQuestions;
	}
	
	public ArrayList getJokeAnswers() throws IOException
	{
		BufferedReader br = new BufferedReader(new FileReader("jokes.txt"));
		
		String line = "";
		
		while ((line=br.readLine())!=null)
		{
			
			if(line.substring(line.length()-1).equals("a"))
			{
				jokeAnswers.add(line.substring(0,line.length()-2));
			}
		}
		return jokeAnswers;
	}
	
}
