package Com.march19.FileHandling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class FileHandlingProg1 
{

	public static void main(String[] args) throws IOException
	{
		@SuppressWarnings("resource")
		
		
		FileOutputStream fos = new FileOutputStream("C:\\nit\\Desktop1\\No\\Test01.txt");
		
		try(fos)
		{
		String str = "New York ....";
		
         byte[] b = str.getBytes();
       
  
       //System.out.println(Arrays.toString(b));

       File file = new File("C:\\nit\\Desktop1\\No\\Test01.txt");
	     
	         	if(file.exists())
	         	{
	         		System.out.println("Success ...!!!");
	         		fos.write(b);
	         	}
	         	else 
	         	{
	         		System.out.println("not success....");
	         	}
		}
		catch(Exception e)
		{
		 System.out.println(e.getMessage());
		}
	         	
		
	}
}































