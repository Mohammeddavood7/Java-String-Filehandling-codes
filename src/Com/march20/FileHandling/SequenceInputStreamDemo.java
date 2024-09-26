package Com.march20.FileHandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

public class SequenceInputStreamDemo 
{
	public static void main(String[] args) throws IOException
	{
		var file1 = new FileOutputStream("D:\\FileHandlingFolder\\abc.txt");
		var file2 = new FileOutputStream("D:\\FileHandlingFolder\\xyz.txt");
		
		var if1 = new FileInputStream("D:\\FileHandlingFolder\\abc.txt");

		var if2 = new FileInputStream("D:\\FileHandlingFolder\\xyz.txt");

		
		  var bout = new SequenceInputStream(if1, if2);
		String str1 = "hi ";
		String str2 = "hello";
		
		byte[] b1 = str1.getBytes();
	    byte[] b2 = str2.getBytes();
	    
	    file1.write(b1);
		file2.write(b2);
		System.out.println("success...");
		
	 
		
		try(file1;file2;if1;if2)
		{
		
			
			int i ;
			while((i = bout.read()) != -1)
			{
				
				System.out.print((char)i);
			}
			
			
			
			
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
		
		 

		
	}

}
