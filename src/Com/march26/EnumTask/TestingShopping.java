package Com.march26.EnumTask;

public class TestingShopping
{
	public static void main(String[] args)
	{
		
		Shopping shopping = new Shopping(ProductType.SHIRT,ProductSize.LONGSIZE);
		shopping.setPrice();
		System.out.println(shopping.book());
		
		Shopping shopping1 = new Shopping(ProductType.SHIRT,ProductSize.MEDIUMSIZE);
		shopping1.setPrice();
		System.out.println(shopping1.book());
	}

}
