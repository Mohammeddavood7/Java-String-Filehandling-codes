package Com.march25.FileHandling;

import java.io.File;

public class MakeDirectory 
{

	String dirName;
	File file;
	
	MakeDirectory(String str)
	{
		this.dirName = str;
	}
	
	
	
	public String dir()
	{
		
		file =  new File(dirName);
        
//		if(file.exists())
//		{
//			return null;
//		}
//		else
//		{
//			file.mkdir();
//			return  dirName;
//		}
//			
		if(file.mkdir())
		{
			return dirName;
		}
		else
		{
			return null;
		}
		
		
	}
}






































