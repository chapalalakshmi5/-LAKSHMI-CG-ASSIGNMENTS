package exceptionhandling;

public class IllegalBankTransactionException extends Exception {
	public IllegalBankTransactionException(String str)
	{
	
			System.out.println(str);
	}
}
