package Com.march21.test;

public class CoffeeShop
{
	CoffeeOrder co ; 
	CoffeeType ct;
	public CoffeeOrder takeOrder(CoffeeType ct,int sl)
	{  
		co = new CoffeeOrder(ct,sl);
		this.co.sugerLevel = sl;
		this.ct = ct;
		return co;
	}
	
	public void prepareCoffee(CoffeeOrder co)
	{
		System.out.println("prapering a cofee is : "+co);
	}
	
	public void  coffeeOrder(CoffeeOrder co,CoffeeType ct)
	{
		System.out.println("coffee prepare "+co+" coffe name "+ct);
	}

	@Override
	public String toString() {
		return "CoffeeShop [co=" + co + ", ct=" + ct + "]";
	}
	
	

}
