package Com.march21.serializable;

import java.io.Serializable;
import java.util.Scanner;

public record Employee(int empId,String empName,Double empSalary) implements Serializable
{
//static variable ,instance methods ,static methods,static block,instance block
	
	public static Employee getEmployees()
	{
		Scanner sc = new Scanner(System.in);
		
			System.out.print("Enter the Employee Id: ");
			int id = sc.nextInt();
			
			System.out.print("Enter the Employee Name: ");
			String name = sc.nextLine();
		    name = sc.nextLine();
		    
		    System.out.print("Enter the Employee Salary: ");
		    double sal = sc.nextDouble();
		    return new Employee(id, name, sal);
		}
}
	
	












































