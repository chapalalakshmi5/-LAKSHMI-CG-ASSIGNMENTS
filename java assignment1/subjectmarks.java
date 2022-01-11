import java.util.Scanner;

public class subjectmarks {
	public static void main(String[] args)
	{
		for(int i=1;i<=4;i++)
		{
		Scanner subject=new Scanner(System.in);
		System.out.println("Enter first subject marks");
		int sub1=subject.nextInt();
		System.out.println("Enter second subject marks");
		int sub2=subject.nextInt();
		System.out.println("Enter third subject marks");
		int sub3=subject.nextInt();
		if(sub1>=60 && sub2>=60 && sub3>=60)
		{
			System.out.println("passed");
		}
			else if((sub1>=60 && sub2>=60)||(sub1>=60 && sub3>=60)||(sub2>=60 && sub3>=60))
			{
				System.out.println("promoted");
		}
			else if((sub1>=60 || sub2>=60 || sub3 >=60 )||(sub1<60 || sub2<60 || sub3<60))
			{
				System.out.println("Failed");
			}
		
	}
	}

}
