package Com.march20.FileHandling;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedInputStreamDemo
{
	public static void main(String[] args) throws IOException
	{
		//FileOutputStream file = new FileOutputStream("DataOutputStream.java");
	
		FileInputStream inF = new FileInputStream("D:\\FileHandlingFolder\\PremitiveDataDemo.java");
		BufferedInputStream bis = new BufferedInputStream(inF);
		
		try(inF;bis) 
		{
			 int i;
			 while((i =  bis.read()) != -1)
			 {
				 System.out.print((char)i);
			 }
			
		}
		catch (Exception e) 
		{
			
		}
		
	}

	
}











































































