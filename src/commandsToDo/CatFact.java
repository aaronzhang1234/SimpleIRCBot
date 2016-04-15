package commandsToDo;

import java.io.IOException;
import java.util.ArrayList;

import hopefully.ReadTxtDocuments;

public class CatFact {

	ArrayList<String> catfact;
	public CatFact() 
	{
		ReadTxtDocuments reader = new ReadTxtDocuments();
		try {
			catfact = reader.getCatFact();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public String getCatFact() throws IOException
	{

		return catfact.get((int)(Math.random()*catfact.size()));
		
	}
}
