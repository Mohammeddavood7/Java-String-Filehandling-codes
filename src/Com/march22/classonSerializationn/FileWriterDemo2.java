package Com.march22.classonSerializationn;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo2
{
	public static void main(String[] args) throws IOException
	{
		var fw = new FileWriter("D:\\FileHandlingFolder\\CharacherProgram1.txt");
		var fr = new FileInputStream("D:\\FileHandlingFolder\\CharacherProgram1.txt");
	    var br = new BufferedInputStream(fr);

		String str = "good morning this is march22 friday in the lab";
		
		try(fr;br;fw)
		{
			try
			{
			fw.write(str);
			System.out.println("success stored in the file");
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}

			int i;
			while((i = br.read() ) != -1)
			{
				System.out.println((char)i);
				System.out.println("hi");
			}
			
		}
		catch (Exception e)
		{
			e.printStackTrace();
					
		}
		
		
	}

}




































