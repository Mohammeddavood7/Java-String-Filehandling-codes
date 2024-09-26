package Com.march18.Enums;

/*enum Course
{
	Java, python, Spring, Testing
};
public class EnumTest 
{
	public static void main(String[] args) {
		System.out.println(Course.Java.name());
	}
}*/


/*enum Course
{
	Java, python, Spring, Testing
};
public class EnumTest 
{
	public static void main(String[] args) 
	{
		System.out.println(Course.Spring.getClass());
	}
}*/

/*enum Course
{
	Java, python, Spring, Testing
};
public class EnumTest {
	public static void main(String[] args) {
		System.out.println(Course.Spring.ordinal());
	}
}*/


/*
enum Course
{
	 Java,Spring; 
	public int python, Testing;
};
public class EnumTest {
	public static void main(String[] args) {
		System.out.println(Course.Spring.name());
	}
}*/



/*enum Course
{
	Java, Python;
	private Course() {
		System.out.println(25);
	}
}
class EnumTest
{
	public static void main(String[] args) {
		Course nit = new Course();
	}
}*/



enum Movie
{
	pathaan, sir, hit, Geme_over, Lost;
	
}
public class EnumTest 
{
	  public static void main(String[] args)
	  {
	    System.out.println(EnumTest.getMovie("Pathaan"));
	  }
	  
	  public static Movie getMovie(String s)
	  {
	    return Enum.valueOf(Movie.class, s.toLowerCase());
	  }
	  
	  public static Movie getMovie(int n)
	  {
	    return Movie.values()[n];
	  }
	  
} 


/*enum Designation
{
	Developer, Tester, Manager, TEAM_LEADER; 
}
public class EnumTest
{
	public static void main(String[] args)
	{
		Designation designation = Designation.Manager;
		
		switch (designation) 
		{
		case Developer:
			System.out.println("Developer");
			break;
		case Tester:
			System.out.println("Tester");
			break;
		case Manager:
			System.out.println("Manager");
			break;
		case TEAM_LEADER:
			System.out.println("TEAM_LEADER");
			break;
		default:
			break;
		}
		
	}
}*/

















































































