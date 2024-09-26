package Com.march22.SerialiazableQ;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class RetriveCustomerObject 
{

	public static void main(String[] args) throws IOException
	{
		var fin = new FileInputStream("D:\\FileHandlingFolder\\Customer.txt");
		
		var ois = new ObjectInputStream(fin);
		 
		Customer cr = null;
		
		try(fin;ois)
		{
		    while((cr = (Customer) ois.readObject()) != null)
		    {
		    	System.out.println(cr);
		    }
			
			
		}
		catch (Exception e)
		{
			System.err.println("Object is printed all data and  ended...");
		}
		
	}
}























































