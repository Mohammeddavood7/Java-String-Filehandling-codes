package Com.march21.test;

public class CoffeeOrder
{
	CoffeeType type;
	int sugerLevel;
	public CoffeeOrder(CoffeeType type, int sugerLevel) {
		super();
		this.type = type;
		this.sugerLevel = sugerLevel;
	}
	@Override
	public String toString() {
		return "CoffeeOrder [type=" + type + ", sugerLevel=" + sugerLevel + "]";
	}
	
	
	

}
