package LamdaExpressions;
import java.util.*;
import java.lang.annotation.*;
@FunctionalInterface
interface Arithmeticoperations
{
	public int values(int a,int b);
	
}
public class operations {
	public static void main(String[] args)
	{
		Arithmeticoperations ap=(a,b)->{
			return(a+b);
		};
		System.out.println("the addition of two numbers is: "+ap.values(100,200));
		
		Arithmeticoperations ap1=(a,b)->{
			return(a-b);
			
		};
		System.out.println("the subtractions of two numbers is: "+ap1.values(100,50));
		
		Arithmeticoperations ap2=(a,b)->{
			return(a/b);
		};
		System.out.println("the division of two values is: "+ap2.values(500, 5));
		
		Arithmeticoperations ap3=(a,b)->{
			return(a*b);
		};
		System.out.println("The multiplaction of two values: "+ap3.values(50,50));
	
	
	}
	
	

}
