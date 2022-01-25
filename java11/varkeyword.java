package java11;
import java.util.*;
@FunctionalInterface
interface variable
{
	int add(int a,int b);
	
}
@FunctionalInterface
interface Scenarios
{
	String sc(String scenario,String scenario1,String scenario2,String scenario3,String scenario4);
	String scenario="(var s1, s2) -> s1 + s2     // we cannot use var for some parameters and skip for others";
	String scenario1="(Var s1,String s2)->s1+s2  //we cannot mix explist types";
  String scenario2="s1 -> s1.findFirst()       //Finally, even though we can skip the parentheses in single parameter lambda";
   String scenario3="var s1 -> s1.toUpperCase() //we cannot skip them while using var";
    String scenario4="All of the above three usages will result in compilation error";
}

public class varkeyword {
	
	public static void main(String[] args)
	{
		
	    variable v=(var a,var b)->(a+b);
	    System.out.println(v.add(100, 500));
	 {
		System.out.println(Scenarios.scenario);
		System.out.println(Scenarios.scenario1);
		System.out.println(Scenarios.scenario2);
		System.out.println(Scenarios.scenario3);
		System.out.println(Scenarios.scenario4);
	};
	 
	    
	}

}
