package Com.march21.serializable;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SerialiazableDemo
{
	

	public static void main(String[] args) throws IOException
	{
		var fos = new FileOutputStream("D:\\FileHandlingFolder\\Emp.txt");
		
		var oos = new ObjectOutputStream(fos);
		Scanner sc = new Scanner(System.in);
		
		try(sc;fos;oos;) 
		{
			System.out.print("How many Object want to create ? : ");
			int num = sc.nextInt();
			
			for(int i = 1 ; i <= num ; i++)
			{
				Employee empObj = Employee.getEmployees();
				oos.writeObject(empObj);
			}
			System.out.println("object are created: "+num);
		   
		} 
		catch(InputMismatchException e)
		{
			System.err.println("please enter required data only !");
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		
	}

}



















































































