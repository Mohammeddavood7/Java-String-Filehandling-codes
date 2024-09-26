package Com.march16.Exceptions;

public class BankAccount
{
	private double accoutBalance;

	public BankAccount(double accoutBalance) {
		super();
		this.accoutBalance = accoutBalance;
	}
	
	
	public double getAccoutBalance() {
		return accoutBalance;
	}


	public void setAccoutBalance(double accoutBalance) {
		this.accoutBalance = accoutBalance;
	}


	public void performTransaction(double amount) throws InvalidTransactionException
	{
		
		if(amount <= 0)
		{
			throw new InvalidTransactionException("Transaction amount should not zero and negative number ..!");
		}
		else if(amount > this.accoutBalance)
		{
			System.out.println();
			throw new InvalidTransactionException("Insufficient funds!");
		}
		else if(amount <=  this.accoutBalance)
		{
			this.accoutBalance = this.accoutBalance - amount;
			
		}
	
	}
	
	public void withDraw(double amount) 
	{
	
		
		if(amount <= 0)
		{
			throw new InsufficientFundsException("Transaction amount must be positive number..!");
		}
		else if(amount > this.accoutBalance)
		{
			throw new InsufficientFundsException("Insufficient funds!");
		}
		else if(amount <=  this.accoutBalance)
		{
			this.accoutBalance = this.accoutBalance - amount;
			
		}
	}
	

}


























































