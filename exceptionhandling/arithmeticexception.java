package exceptionhandling;

import java.util.Scanner;

public class arithmeticexception {
	public static void main(String[] args)
	{
		int n = 4;
		
		for(int i=1;i<n;i++)
		try
		{
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a value");
		a=sc.nextInt();
		System.out.println("enter b value");
		b=sc.nextInt();
		
		if(b<0)
		{
			throw new ArithmeticException();
		}
		System.out.println("the division value is:"+a/b);
		}
	catch(ArithmeticException ae)
	{
		System.out.println("divide by zero exception");
	
		System.out.println(ae);//system generated exception
	
	}
	
}
}
