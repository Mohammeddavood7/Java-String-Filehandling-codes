package Com.march19.FileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileHandlingprog3
{
	public static void main(String[] args)
	{
		File file1 = new File("D:\\FileHandlingFolder");
		if(!file1.exists())
		{
		   file1.mkdir();
		   System.out.println("successfully directory created..");
		}
		else
		{
			System.out.println("not directory created..");
		}
		
		
		try
		{
			FileOutputStream fos = new FileOutputStream("D:\\FileHandlingFolder\\Test1.txt");
		
			
			String str = "Naresh i technologies";
			
			byte[] bytes = str.getBytes();
			
			try(fos)
			{
				File file = new File("D:\\FileHandlingFolder\\Test1.txt");
				if(file.exists())
				{
					System.out.println("Successfully date transfered into file...");
					fos.write(bytes);
				}
				else {
					System.out.println("file is not exit and data not transfered into file");
				}
				
			}
			catch (IOException e)
			{
				
				e.printStackTrace();
			}
			
			
		} 
		catch (FileNotFoundException e)
		{
			
			e.printStackTrace();
		}
				
		
	}

}































































