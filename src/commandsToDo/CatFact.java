package commandsToDo;

import java.io.IOException;
import java.util.ArrayList;

import hopefully.ReadTxtDocuments;

public class CatFact {

	ArrayList<String> catfact;
	public CatFact()
	{}
	
	public String getCatFact() throws IOException
	{
		ReadTxtDocuments reader = new ReadTxtDocuments();
		catfact = reader.getCatFact();

		return catfact.get((int)(Math.random()*catfact.size()));
		
	}
}
