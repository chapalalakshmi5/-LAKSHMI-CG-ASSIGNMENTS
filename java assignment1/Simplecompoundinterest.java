import java.util.*;
public class Simplecompoundinterest {
	public static void main(String[] args)
	{
		//simple interest
	    System.out.println("Enter principle Rate and Time:");
	    int p;
	    float t;
	    double r,si;
	    Scanner sc=new Scanner(System.in);
	    p=sc.nextInt();
	    t=sc.nextFloat();
	    r=sc.nextDouble();
	    si=(p*t*r)/100;
	    System.out.println("simple interest is"+si);
	    //compound interest
	    System.out.println("Enter amount principle rate:");
	    System.out.println("interest for the two years");
	    int principle,year;
	    double amount;
	    double rate;
	    principle=sc.nextInt();
	    rate=sc.nextDouble();
	    for(year=1;year<=15;year++)
	    {
	    	amount=principle*Math.pow(1+rate,year);
	    	System.out.println(year+" "+amount);
	    }
	    
	}
	
	    
	    
	

}

