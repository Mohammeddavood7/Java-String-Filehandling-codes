package Com.march21.test;

public class Main 
{
	public static void main(String[] args)
	{
		CoffeeShop cs = new CoffeeShop();
		CoffeeOrder co = new CoffeeOrder(CoffeeType.Cappuccino, 10);
		cs.takeOrder(CoffeeType.Cappuccino, 10);
		cs.prepareCoffee(co);
		cs.coffeeOrder(co, CoffeeType.Cappuccino);
		
		
	}

}
