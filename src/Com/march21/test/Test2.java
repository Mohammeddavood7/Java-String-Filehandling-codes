package Com.march21.test;

import java.io.File;

public class Test2
{
	public static void main(String[] args)
	{
		File file = new File("D:\\FileHandlingFolder\\Student.txt");
		
		if(file.exists())
		{
			System.out.println("File and Directory exits");
		}
		else if(file.exists() ==  false)
		{
			System.out.println("file an directory not exists");
		}
		
		
		if(file.delete())
		{
			System.out.println("file is deleted successfully");
		}
		else {
			System.out.println("file is not deleted successfully, ");
		}
		
		
		
		
		
		
		
	}

}
