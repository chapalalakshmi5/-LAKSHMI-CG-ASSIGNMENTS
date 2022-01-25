package java11;
import java.util.*;
import java.lang.*;
@FunctionalInterface
interface func
{
	double simplei(int p,double t,double r);
	
}
public class Simpleinterest{
public static void main(String[] args)
{
	
	func si=(var p,var t, var r)-> p*t*r/100;

	System.out.println("the simple interest is:"+(float)si.simplei(20000,2.5,2));
	System.out.println("the simple interest is:"+(float)si.simplei(100000,3.5,2.5));
	System.out.println("the simple interest is:"+(float)si.simplei(8000000,2.8,5));
	System.out.println("the simple interest is:"+(float)si.simplei(886542,3.2,2.5));
	
}
}
