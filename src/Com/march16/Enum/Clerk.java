package Com.march16.Enum;

public class Clerk extends Employee
{
	 boolean flag=false;
	 int speed;
	 int accuracy;
	 
	public int getSpeet() {
		return speed;
	}
	public void setSpeet(int speet) {
		this.speed = speet;
	}
	public int getAccuracy() {
		return accuracy;
	}
	public void setAccuracy(int accuracy) {
		this.accuracy = accuracy;
	}
//	public Clerk() {
//		super();
//	}
//	
	
	 
	public Clerk(String ename, int empId, double empSal, int speed, int accuracy) {
		super(ename, empId, empSal);
		this.speed = speed;
		this.accuracy = accuracy;
		super.setEmpSal(empSal);
	}
	@Override
	public void setEmpSal(double salary)
	{
		if(speed > 70 && accuracy > 80)
		{
			if(flag==false)
			{
		     	super.setEmpSal(super.getEmpSal()+1000);
		     	
		     	flag=true;
			}
		}
		
		
	}
	@Override
	public String toString() {
		return super.toString()+"       Clerk [flag=" + flag + ", speed=" + speed + ", accuracy=" + accuracy + "]";
	}
	
	
	 
}