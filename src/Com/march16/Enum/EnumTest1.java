package Com.march16.Enum;

interface enumClass
{
	default void show() {
		
	}
}


enum Direction implements enumClass
{
	EAST,WEST,NORTH,SOUTH;
	
	private Direction()
	{
		System.out.println("excuted...");
	}

	
}

public class EnumTest1 
{
   static enum WeekDays
   { 
	   MONDAY(10),TUESDAY(20),WEDNESDAY(30),THURSDAY(40),FRIDAY(50),SATURDAY(60);
	   
	   {
		   System.out.println("Non - STATIC BLOCK");
	   }
	   
	 static
	   {
		   System.out.println("static block");
	   }
	   
	   private WeekDays(int a)
	   {
		   System.out.println("Excuted: "+a);
	   }
   }
   
	
	public static void main(String[] args)
	{
		/* System.out.println(Direction.EAST);
		System.out.println(Direction.WEST);
		System.out.println(Direction.NORTH);
		System.out.println(Direction.SOUTH);
		
		Direction[] values = Direction.values();
		for(Direction d : values)
		{
			System.out.println(d+" position of Constant: "+d.ordinal());
		} */
		
	WeekDays.FRIDAY.ordinal();
//		Direction e1 = Direction.EAST;
//		Direction e2 = Direction.EAST;
//		
//		System.out.println(e1 == e2);
//		
//		
//		if(e1.equals(e2))
//		{
//			System.err.println("equals");
//		}
//		
		
	}

}














































































