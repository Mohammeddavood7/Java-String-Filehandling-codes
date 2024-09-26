package Com.march21.testpractice;

enum CoffeeType 
{
	 ESPRESSO,
	 AMERICANO,
	 LATTE,
	 CAPPUCCINO
}


class CoffeeOrder 
{
	 private CoffeeType type;
	 private int sugarLevel;
	
	
	 public CoffeeOrder(CoffeeType type, int sugarLevel) {
	     this.type = type;
	     this.sugarLevel = sugarLevel;
	 }
	
	 
	 public CoffeeType getType() {
	     return type;
	 }
	
	 public int getSugarLevel() {
	     return sugarLevel;
	 }
}

class CoffeeShop
{
 
	 public CoffeeOrder takeOrder(CoffeeType type, int sugarLevel) 
	 {
	     return new CoffeeOrder(type, sugarLevel);
	 }
	
	 
	 public void prepareCoffee(CoffeeOrder order)
	 {
	     System.out.println("Preparing " + order.getType() + " with sugar level: " + order.getSugarLevel());
	 }
}

public class Main 
{
	 public static void main(String[] args) 
	 {
		     
		     CoffeeShop coffeeShop = new CoffeeShop();
		
		     
		     CoffeeOrder order1 = coffeeShop.takeOrder(CoffeeType.LATTE, 2);
		     CoffeeOrder order2 = coffeeShop.takeOrder(CoffeeType.AMERICANO, 1);
		
		     System.out.println("Order 1: " + order1.getType() + " with sugar level: " + order1.getSugarLevel());
		     System.out.println("Order 2: " + order2.getType() + " with sugar level: " + order2.getSugarLevel());
		
		     coffeeShop.prepareCoffee(order1);
		     coffeeShop.prepareCoffee(order2);
	 }
}
