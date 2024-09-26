package Com.march22.SerialiazableQ;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class StoreCustomerObject
{
	public static void main(String[] args) throws IOException
	{
		var fin = new FileOutputStream("D:\\FileHandlingFolder\\Customer.txt");
		var oos = new ObjectOutputStream(fin);
		Scanner sc = new Scanner(System.in);
		
		try(oos;fin;sc) 
		{
			System.out.print("How many object want to create ?: ");
			int num = sc.nextInt();
			
			for(int i=1 ; i<=num ; i++)
			{
				Customer customerObject = Customer.getCustomerObject();
				oos.writeObject(customerObject);
			}
			
			System.out.println("Customer object are stored.....");
			
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
	}

}















































































