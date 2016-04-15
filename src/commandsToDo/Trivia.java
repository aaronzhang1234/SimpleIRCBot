package commandsToDo;

import java.io.IOException;
import java.util.ArrayList;

import hopefully.ReadTxtDocuments;

public class Trivia {

	ReadTxtDocuments reader = new ReadTxtDocuments();
	
	private ArrayList<String> questions;
	private ArrayList<String> answers;
	int i = 0;
	public Trivia()
	{
		try {
			answers = reader.getTriviaAnswers();
			questions = reader.getTriviaQuestions();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	public String getQuestion()
	{
		
		i=(int)(Math.random()*questions.size());
		String question = questions.get(i);
		return question;
	}
	public String getAnswer()
	{
		
		String answer = answers.get(1);
		return answers.get(i);
	}
	
	
}
