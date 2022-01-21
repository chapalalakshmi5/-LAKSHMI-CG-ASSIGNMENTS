package LamdaExpressions;
import java.util.*;
public class Uppercase {
	public static void main(String[] args)
	{
		ArrayList<String> ar=new ArrayList<String>();
		ar.add("bob");
		ar.add("harry");
		ar.add("salt");
		ar.replaceAll(r->r.toUpperCase());
		System.out.println("the list are:"+ar);
		
	}

}
