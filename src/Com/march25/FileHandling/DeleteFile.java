package Com.march25.FileHandling;

import java.io.File;

public class DeleteFile 
{

	String fileName;
	File file;
	
	DeleteFile(String file)
	{
	  this.file = new File(file);
	  fileName = file;
	}
	
	public String delete()
	{
		if(file.delete())
		{
		   return fileName;
		}
		else
		{
			return null;
		}
		
	}
	

	
}
