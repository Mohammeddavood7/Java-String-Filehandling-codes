package Com.march16.Exceptions;

@SuppressWarnings("serial")
public class InsufficientFundsException extends RuntimeException
{
	public InsufficientFundsException()
	{
		super();
	}
	
	public InsufficientFundsException(String errorMessage)
	{
		super(errorMessage);
	}
}
