package Com.march22.classonSerializationn;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Test1 
{
	public static void main(String[] args) throws IOException
	{
		//Reader(read the file) //Writer(create the fil
		
		var fw = new FileWriter("D:\\FileHandlingFolder\\OrderFile.txt"); 
		
		try(fw) 
		{
			
			fw.write("shoes order placed.....");
			System.out.println("success");
			
		}
		catch (Exception e)
		{
			e.printStackTrace();
			
		}
		
		var fr = new FileReader("D:\\FileHandlingFolder\\OrderFile.txt");
		
	
		int i;
		while((i = fr.read()) != -1)  
		{
			System.out.print((char)i);
			
		}
		
		
		
		
		
		
	}

}









































