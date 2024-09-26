package Com.march22.classonSerializationn;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo1
{
	public static void main(String[] args) throws IOException
	{
		FileReader fr = new FileReader("D:\\FileHandlingFolder\\lincoln22.jpeg");
		FileWriter fw = new FileWriter("D:\\FileHandlingFolder\\lincolnD1.jpeg");
		
		try(fr;fw)
		{
			int i;
			while((i = fr.read() ) != -1 )
			{
				fw.write((char)i);
			}
			System.out.println("transfered successfull...");
			
		}
		
		
		
		
		
		
	}

}
