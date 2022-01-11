import java.util.Scanner;

public class incometax {
	public static void main(String args[])
	{
	    for(int i=1;i<=5;i++)
	    {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter income amount");
		long  income=sc.nextLong();
		if(income>=0 && income<=80000)
		{
			System.out.println("Slab A");
			System.out.println("tax payable amount is 'Nill'");
			
		}
		else if(income>=181001 && income<=300000)
		{
			System.out.println("Slab B");
			income=income*10/100;
			System.out.println("tax payable amount is"+income);
			
		}
		else if(income>=300001 && income<=500000)
		{
			System.out.println("Slab C");
			income=income*20/100;
			System.out.println("tax payable amount is"+income);
		}
		else if(income>=500001 && income<=1000000)
		{
			System.out.println("Slab D");
			income=income*30/100;
			System.out.println("tax payable amount is"+income);
		}
		
	}
	}

}
