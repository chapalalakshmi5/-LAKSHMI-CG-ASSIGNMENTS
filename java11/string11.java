package java11;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class string11 {
	public static void main(String[] args)
	{
		List<String> a=new ArrayList<String>();
		a.add("A");
		a.add("quick");
		a.add("brown");
		a.add("box");
		a.add("jumps");
		a.add("over");
		a.add("the");
		a.add("lazy");
		a.add("dog");
		Collections.addAll(a);
	      System.out.println(a);
	      a.forEach((e) -> {
	          System.out.print(e+" ");
	        });
		
	}

}
