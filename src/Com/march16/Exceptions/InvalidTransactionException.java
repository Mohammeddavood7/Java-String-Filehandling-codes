package Com.march16.Exceptions;

@SuppressWarnings("serial")
public class InvalidTransactionException extends Exception
{
	    
	public InvalidTransactionException()
	{
		super();
	}
	public InvalidTransactionException(String errorMessage)
	{
		super(errorMessage);
	}
}
