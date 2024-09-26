package Com.march16.Enum;


public class Manager extends Employee
{
	
	 private ManagerType type;

	public ManagerType getType() {
		return type;
	}

	public void setType(ManagerType type) {
		this.type = type;
	}

	public Manager() {
		super();
		
	}
	
	public Manager(String ename, int empId, double empSal, ManagerType type) {
		super(ename, empId, empSal);
		this.type = type;
		super.setEmpId(empId); //revised
	}

	@Override
	public void setEmpSal(double empSal)
	{
		if(type.equals(ManagerType.HR))
		{
			super.setEmpSal(empSal+10000);
		}
		else if(type.equals(ManagerType.Sales))
		{
			super.setEmpSal(empSal+5000);
		}
	}

	@Override
	public String toString()
	{
		return super.toString()+"     Manager [type=" + type + "]";
	}
 

}



































