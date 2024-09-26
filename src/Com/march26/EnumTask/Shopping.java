package Com.march26.EnumTask;

public class Shopping 
{
 
	private ProductType pType;
	private ProductSize pSize;
	private double totalPrice;
	
	public Shopping(ProductType pType,ProductSize pSize)
	{
		this.pType = pType;
		this.pSize = pSize;
	}
	
	
	@SuppressWarnings("static-access")
	public void setPrice()
	{
		if(pType.equals(pType.SHIRT)&& pSize.equals(pSize.LONGSIZE))
		{
			totalPrice = 1000;
		}
		else if(pType.equals(pType.SHIRT)&& pSize.equals(pSize.MEDIUMSIZE))
		{
			totalPrice = 900;
		}
		else if(pType.equals(pType.PANT)&& pSize.equals(pSize.LONGSIZE))
		{
			totalPrice = 1200;
		}
		else if(pType.equals(pType.PANT)&& pSize.equals(pSize.MEDIUMSIZE))
		{
			totalPrice = 1100;
		}
		else 
		{

			totalPrice = 0;
		}	
	}
	
	public String book()
	{
		String booking = null;
		if(totalPrice == 1000.0)
		{ 
			booking = pType+" , "+pSize+ " total price: "+totalPrice;

		}
		else if(totalPrice == 900.0)
		{
			booking = pType+" , "+pSize+ " total price: "+totalPrice;

		}
		else if(totalPrice == 1200.0)
		{
			booking = pType+" , "+pSize+ " total price: "+totalPrice;

		}
		else if(totalPrice == 1100.0 )
		{
			booking = pType+" , "+pSize+ " total price: "+totalPrice;
		}
		else
		{
		    booking = "invalid type";
		}
		
		return booking;
	}
	
	
	
}



















































