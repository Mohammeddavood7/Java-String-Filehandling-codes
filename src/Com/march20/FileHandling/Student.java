package Com.march20.FileHandling;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.*;

public class Student 
{
	public static void main(String[] args) throws IOException
	{
		var file = new FileOutputStream("D:\\FileHandlingFolder\\Student.txt");
		
		
		try(file)
		{
			
			  String str = "I am Smith and from Newyork";
			     
			     byte[] b = str.getBytes();
			     
			      file.write(b);
			      System.out.println("success..");
			
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
		
		
		
		var inFile = new FileInputStream("D:\\FileHandlingFolder\\Student.txt");
		
		FileOutputStream bFile = null;
		try(inFile)
		{
			bFile = new FileOutputStream("D:\\FileHandlingFolder\\JavaStudent.txt");
		
			
			int i;
			
			while((i = inFile.read())!=-1)
			{
				System.out.print((char)i);
				bFile.write(i);
			}
			
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	   
		
		
		
		
	}

}












































