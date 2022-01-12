import java.util.*;
import java.lang.*;

public class studentmarksaverage {
	public static void main(String[] args)
	{    
		int total,average;
		for(int i=1;i<=3;i++)
		{
		
		Scanner subject=new Scanner(System.in);
		System.out.println("enter student name");
		String s=subject.next();
		System.out.println("Enter first subject marks");
		int sub1=subject.nextInt();
		System.out.println("Enter second subject marks");
		int sub2=subject.nextInt();
		System.out.println("Enter third subject marks");
		int sub3=subject.nextInt();
		total=sub1+sub2+sub3;
		average=total/3;
		System.out.println(s+ "total marks is" +total);
		System.out.println(s+"average marks is"+average);
		
	}
		
	}

}

