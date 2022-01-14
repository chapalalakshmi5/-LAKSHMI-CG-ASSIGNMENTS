package exceptionhandling;

public class InsufficientBalanceException extends Exception
{
	public InsufficientBalanceException(String str)
	{
		System.out.println(str);
	}

}
