package Com.march16.Exceptions;

@SuppressWarnings("serial")
class InvalidItemException extends Exception
{
	public InvalidItemException(String errorMessage)
	{
		super(errorMessage);
	}
	
}
@SuppressWarnings("serial")
class OutOfStockException extends RuntimeException
{
	public OutOfStockException(String errorMessage)
	{
		super(errorMessage);
	}
}


public class ShoppingCart 
{
	
	public int getAvailableItems() {
		return availableItems;
	}

	public void setAvailableItems(int availableItems) {
		this.availableItems = availableItems;
	}

	private int availableItems;

	public ShoppingCart(int availableItems) {
		super();
		this.availableItems = availableItems;
	}
	
	public void addItem(int quantity) throws Exception
	{
		if(quantity <= 0)
		{
			throw new InvalidItemException("adding items means Number should be positive number..");
		}
		else if(quantity > 5)
		{
			throw new InvalidItemException("adding in cart more then 5 invalid..");
		}
		
		this.availableItems += quantity;
		System.out.println("After AddCart: "+this.availableItems);
	}
	
	
	public void addItemUnchexcked(int quantity)
	{
		if(quantity <= 0)
		{
			throw new IllegalArgumentException("adding items means Number should be positive number..");
		}
		else if(quantity > 5)
		{
			throw new OutOfStockException("adding in cart more then 5 invalid..");
		}
		
		this.availableItems += quantity;
		System.out.println("After AddCart: "+this.availableItems);
		
	}
	
	
   public static void main(String[] args)
   {
	   ShoppingCart sCart = new ShoppingCart(2);
	   try 
	   {
		 sCart.addItem(1);
		 System.out.println("Item added sucessfully..");
	   } 
	   catch (Exception e)
	   {
		   System.err.println(e.getMessage());
	   }
	   
	   
	   try
	   {
		   sCart.addItemUnchexcked(2);
			 System.out.println("Item added sucessfully..");
	   }
	   catch(IllegalArgumentException |OutOfStockException e)
	   {
		   System.err.println(e.getMessage());
	   }
		
	   System.out.println("TOTAL ITEMS: "+sCart.availableItems);
   } 
  
	

}

















































