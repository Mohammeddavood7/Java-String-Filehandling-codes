package Com.march21.serializable;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class De_SerialiazableDemo
{
	public static void main(String[] args) throws IOException
	{
		var fin = new FileInputStream("D:\\FileHandlingFolder\\Emp.txt");
		var ois = new ObjectInputStream(fin);
		Employee emp = null;
		
		try 
		{
		      while((emp = (Employee)ois.readObject()) != null)
		      {
		    	  System.out.println(emp);
		      }
		      
		}
		catch (EOFException e) 
		{
			System.err.println("Object are how to print: "+e.getMessage());
			
		}
		catch(Exception e)
		{
			System.out.println("check what you provided");
		}
		
	}
	

}




























































