package Com.march18.InputOutput;
import java.io.*;
public class InputOutputClasss 
{
	public static void main(String[] args) throws IOException
	{
		
		//CASE : 1
		//DataInputStream dis = new DataInputStream(System.in); 
		//Case: 2
//		InputStreamReader isr = new InputStreamReader(System.in);
//		BufferedReader br1 = new BufferedReader(isr);
		
		//Case: 3
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("enter the name: ");
		String  name = br.readLine();
		
		
		System.out.print("enter the id: ");
		String  SId = br.readLine();
		int id = Integer.parseInt(SId);
		
		
		
		System.out.print("enter the gender[M/F]: ");
		//char =>  Male = M\n => ale in Double(not convert string to double => NumberFormatException)that why take charAt(0)
	   char gender = (char)br.readLine().charAt(0); 
		
		
		System.out.print("enter the salary: ");
		String sal = br.readLine();
		double salary = Double.parseDouble(sal);
		
		
		System.out.println("Your Name: "+name);
		System.out.println("Your Id: "+id);
		System.out.println("Your Gender: "+gender);
		System.out.println("Your Salary: "+salary);
		
		
		
		
		
		
	}

}
