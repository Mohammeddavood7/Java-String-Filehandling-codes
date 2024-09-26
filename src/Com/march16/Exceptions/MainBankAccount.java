package Com.march16.Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainBankAccount
{
	public static void main(String[] args)
	{
		Scanner sc =  new Scanner (System.in);
		BankAccount ba = new BankAccount(1000);
		
		try 
		{
			System.out.print("enter amount to pay: ");
			double amt = sc.nextDouble();
			ba.performTransaction(amt);
			System.out.println("Transaction is sucessfull...!");
			System.out.println("Remaining Account Balance: "+ba.getAccoutBalance());
		}
		catch (InvalidTransactionException e) 
		{
			System.err.println(e.getMessage());
		}
		catch(InputMismatchException e)
		{
			System.err.println("only digits valid not letter..!");
		}
		
		try 
		{
			System.out.print("enter the amount to withdraw: ");
			double amt2 = sc.nextDouble();
			ba.withDraw(amt2);
			System.out.println("With draw sucessfull...");
			System.out.println("Remaining balance: "+ba.getAccoutBalance());
			
		} 
		catch (InsufficientFundsException e) 
		{
			System.err.println(e.getMessage());
		}
		catch(InputMismatchException e)
		{
			System.err.println("only digits valid not letter..!");
		}
		finally
		{
			sc.close();
		}
	
		
	}

}
