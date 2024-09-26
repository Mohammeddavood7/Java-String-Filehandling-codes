package Com.march16.Enum;

enum ManagerType
{
	HR,Sales;
}
public class MainEmployee
{
	public static void main(String[] args)
	{
		
		Manager m1 = new Manager("Smith", 111, 50000, ManagerType.HR);
		m1.setEmpSal(m1.getEmpSal());
		System.out.println(m1);
		
		
		Manager m2 = new Manager("Smith", 111, 50000, ManagerType.Sales);
		m2.setEmpSal(m2.getEmpSal());
		System.out.println(m2);
		

		
		
		Clerk c = new Clerk("Ward", 222, 39000, 60, 88);
		c.setEmpSal(c.getEmpSal());
		System.out.println(c);  //40000
//		
//		c.setEmpSal(c.getEmpSal());
//		System.out.println(c);
//		
//		c.setEmpSal(c.getEmpSal());
//		System.out.println(c);
//		
//		
		
		
		
	}
}

































































