package Com.march26.EnumTask;

enum CoffeeType
{
	COLDCOFFEE,BLACKCOFFEE,MILKCOFFEE
}

enum CoffeeSize
{
	SMALL,MEDIUM,BIG
}


class CoffeeOrder
{
	private CoffeeType cType;
	private CoffeeSize cSize;
	public CoffeeOrder(CoffeeType cType, CoffeeSize cSize) {
		super();
		this.cType = cType;
		this.cSize = cSize;
	}
	
	
	public String getOrderDetails()
	{
		return "Coffee Type is: "+cType+", Coffee Size is: "+cSize;
		
	}
	
	
}

public class Test
{
	
	public static void main(String[] args)
	{
		
	
	
      	CoffeeOrder co = new CoffeeOrder(CoffeeType.COLDCOFFEE, CoffeeSize.MEDIUM);
      	System.out.println(co.getOrderDetails());
	
      	CoffeeOrder co1 = new CoffeeOrder(CoffeeType.BLACKCOFFEE, CoffeeSize.BIG);
      	System.out.println(co1.getOrderDetails());
	
	}
}













































































