package Com.march22.SerialiazableQ;

import java.io.Serializable;
import java.util.Scanner;

@SuppressWarnings("serial")
public class Customer  implements Serializable
{
	private int customerId;
	private String customerName;
	private transient double customerBill;
	static Scanner sc = new Scanner(System.in);

	public Customer(int customerId, String customerName, double customerBill) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerBill = customerBill;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public double getCustomerBill() {
		return customerBill;
	}
	public void setCustomerBill(double customerBill) {
		this.customerBill = customerBill;
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerBill="
				+ customerBill + "]";
	}
	
	
	
	public static Customer getCustomerObject()
	{
		
		
		System.out.print("Enter the customer Id: ");
		int id = sc.nextInt();
		
		System.out.print("Enter the customer Name: ");
		String name = sc.nextLine();
		name = sc.nextLine();
		
		System.out.print("Enter the customer Bill: ");
		double bill = sc.nextDouble();
		
		return new Customer(id, name, bill);
		
		
	}
	

}
























































