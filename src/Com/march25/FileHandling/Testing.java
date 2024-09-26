package Com.march25.FileHandling;

import java.io.IOException;

public class Testing
{
	
	public static void main(String[] args) throws IOException
	{
		MakeDirectory md = new MakeDirectory("D:FileHandling25");
		
		try 
		{
			String dir = md.dir();
			if(dir != null)
			{
				System.out.println("Folder is created :"+md.dir());
			}
			else
			{
				System.out.println("Folder filed to created :"+md.dir());

			}
			
			
		}
		catch (Exception e)
		{
			String message = e.getMessage();
			System.out.println(message);
			
		}
		
		
		
		
		MakeFile mf = new MakeFile("D:\\FileHandling25\\march25.txt");
		String mfile = mf.makeFile();
		try 
		{
			
			
			if(mfile != null);
			{
				System.out.println("File is created :"+mfile);

			}
		   if(mfile == null)
			{
				System.out.println("File is filed to created :"+mfile);
			}
			
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
		
		DeleteFile df = new DeleteFile(mfile);
		
		String delete = df.delete();
		if(delete != null)
		{
			System.out.println("file is deleted."+delete);
		}
		else
		{
			System.out.println("File is not deleted."+delete);
		}
		
	}
	

}




























































