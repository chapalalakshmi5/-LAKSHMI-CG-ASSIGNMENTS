import java.util.Scanner;
public class Armstrong{
	public static void main(String[] args)
	{
		System.out.println("Enter a number");
		int n,temp=0,sum=0,r;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
	temp=n;
	while(n!=0)
	{
		r=n%10;
		sum=sum+(r*r*r);
		n=n/10;
	}
	if(temp==sum)
		System.out.println("armstrong number");
	else
		System.out.println("not a armstrong number");
	}
}