package Com.march25.FileHandling;

import java.io.File;
import java.io.IOException;

public class MakeFile 
{
	String fileName;
	File file;
	
	MakeFile(String str)
	{
		this.fileName = str;
		file = new File(fileName);
	}
	
    public String makeFile() throws IOException
    {
    	
    	if(file.exists())
    	{
    		return null;
    	}
    	else
    	{
    		file.createNewFile();
    		return fileName;   	
    	}
      
    }
}
