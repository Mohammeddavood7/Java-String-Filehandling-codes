package Com.march21.test;

import java.io.FileInputStream;
import java.io.IOException;

public class TEST1 
{
	public static void main(String[] args) throws IOException
	{
		
	
   var fin = new FileInputStream("D:\\FileHandlingFolder\\Student.txt");

    try (fin)
    	{
    	int i;
    	while((i = fin.read()) != -1)
    	{
    		System.out.println((char)i);
    	}
		
	}
    catch (Exception e) 
    {
		e.printStackTrace();
	}
   
   
	}
}
