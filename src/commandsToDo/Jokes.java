package commandsToDo;

import java.io.IOException;
import java.util.ArrayList;

import hopefully.ReadTxtDocuments;

public class Jokes {

	ArrayList<String> oneLineJokes;
	ArrayList<String> jokeQuestions;
	ArrayList<String> jokeAnswers;
	public Jokes()
	{
		ReadTxtDocuments reader = new ReadTxtDocuments();
		try {
			oneLineJokes = reader.oneLineJokes();
			jokeQuestions = reader.getJokeQuestions();
			jokeAnswers = reader.getJokeAnswers();
		} catch (IOException e) {
		}
		
	}
	
	public String getOneLineJoke()
	{
		return oneLineJokes.get((int) (Math.random()*oneLineJokes.size()));
	}
	public ArrayList getMultiLinedJoke()
	{
		ArrayList jokes = new ArrayList<>();
		int i = (int)(Math.random()*jokeQuestions.size());
		jokes.add(jokeQuestions.get(i));
		jokes.add(jokeAnswers.get(i));
		return jokes;
	}
}
