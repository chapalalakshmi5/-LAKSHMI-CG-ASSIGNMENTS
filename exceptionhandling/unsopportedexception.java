package exceptionhandling;

import java.util.Scanner;

public class unsopportedexception {
	public static void main(String args[])
	{
		int n=4;
	  for(int i=0;i<n;i++)
	  {
           try
			{
			int a,b;
			Scanner sc=new Scanner(System.in);
			System.out.println("enter a value");
			a=sc.nextInt();
			System.out.println("enter b value");
			b=sc.nextInt();
			System.out.println("the divisor value is"+a/b);
	   }
	   catch(UnsupportedOperationException ae1)
	   {
		   System.out.println(ae1);
	   }
	}
	}
}
