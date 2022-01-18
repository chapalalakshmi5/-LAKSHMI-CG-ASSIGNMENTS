package collections;
import java.util.*;
import java.lang.*;

public class product {
	
	public static void main(String[] args)
	{
		Set<String> ts=new TreeSet<String>();

		ts.add("Apple");
		ts.add("Boll");
		ts.add("Apple");
		ts.add("Bat");
		
	 Iterator<String> itr=ts.iterator();  
	  while(itr.hasNext()){  
		   System.out.println(itr.next());  
		  }  

}
}
