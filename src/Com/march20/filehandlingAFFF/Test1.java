package Com.march20.filehandlingAFFF;

import java.io.File;

public class Test1
{
	public static void main(String[] args) 
	{
		
		String aff =  "D:\\Aff";
		File file = new File(aff);   
		
		if(!file.exists()) 
		{
			boolean mkdir = file.mkdir();
			
			if(mkdir) 
			{
				System.out.println("Folder is created");
			}
			else
			{
				System.out.println("Folder is not created");
			}
		}
		else
		{
			System.out.println("folder is already exists");
		}
		
		
		
	}

}















































