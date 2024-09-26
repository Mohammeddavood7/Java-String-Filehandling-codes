package Com.march20.Exceptionss;

/*enum Course
{
	Java, python, Spring, Testing
};
public class EnumTest {
	public static void main(String[] args) {
		System.out.println(Course.Spring.getClass());
	}
}*/

enum Movie
{
	Pathaan, Sir, Hit, Geme_over, Lost;
}

public class EnumTest 
{
	 public static void main(String[] args) 
	 {
           try 
           {
		       System.out.println(EnumTest.getMovie("Sir"));
           }
           catch(IllegalArgumentException e)
           {
        	   System.err.println(e.getMessage());
           }
	    
	    System.out.println(EnumTest.getMovie(0));
	 }
	  
	  public static Movie getMovie(String s) 
	  {
	    return Movie.valueOf(Movie.class, s.toLowerCase());
	  }
	  
	  public static Movie getMovie(int n)
	  {
	    return Movie.values()[n];
	  }
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
