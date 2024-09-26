package Com.march22.classonSerializationn;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class printWriteDemo1
{
	public static void main(String[] args) throws IOException 
	{
		var pw = new PrintWriter("D:\\FileHandlingFolder\\StudentDetails.txt");
		Scanner sc = new Scanner(System.in); 
		try(pw;sc)
		{
			System.out.print("Enter the marks: ");
			int mark = sc.nextInt();
			int marks = mark;
			pw.printf("student mark: %d",marks," out of 470");
			System.out.println("success");
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
	}

}
