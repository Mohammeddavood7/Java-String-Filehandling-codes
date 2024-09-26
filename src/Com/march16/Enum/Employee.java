package Com.march16.Enum;

public class Employee
{
	private String ename;
	private int empId;
	private double empSal;
	
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public double getEmpSal() {
		return empSal;
	}
	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}
	public Employee() {
		super();
	}
	public Employee(String ename, int empId, double empSal) {
		super();
		this.ename = ename;
		this.empId = empId;
		this.empSal = empSal;
	}
	@Override
	public String toString() {
		return "Employee [ename=" + ename + ", empId=" + empId + ", empSal=" + empSal + "]";
	}
	
	
	
	

}