import java.util.Scanner;

public class Armstrongrange {
		public static void main(String[] args)
		{
			System.out.println("enter a range");
			int n,n1,n2,rem,total,i;
			Scanner sc=new Scanner(System.in);
			n1=sc.nextInt();
			n2=sc.nextInt();
            for(i=n1;i<=n2;i++)
            {
            	n=i;
            	total=0;
            	while(n > 0)
            	{
            		rem=n%10;
            		total=total+(rem*rem*rem);
            		n=n/10;
            		
            	}
            	if(total==i)
            		System.out.println("the armsrong numbers in the given range are"+total);
            	
            }
				
		}
	}

