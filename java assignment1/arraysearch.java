import java.util.*;
public class arraysearch {
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter array size");
		int size=sc.nextInt();
		System.out.print("Enter values");
		int numbers[]=new int[size];
		for(int i=0;i<size;i++)
		{
			numbers[i]=sc.nextInt();
		}
		System.out.println("enter search value");
		int value=sc.nextInt();
		for(int i=0;i<numbers.length;i++)
		
		if(numbers[i]==value)
		{
			System.out.println("Accepted "+value);
		}
}
}
