package hopefully;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReadTxtDocuments {

	private ArrayList <String> catfact = new ArrayList<>();
	
	
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
	
	
	
}
