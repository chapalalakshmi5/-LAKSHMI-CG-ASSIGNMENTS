package generics;
import java.util.HashMap;
import java.time.LocalDateTime; 

public class properties{
	public static void main(String[] args)
	{
		HashMap<String,String> p=new HashMap<String,String>();
		p.put("hello","welcome");
		p.put("lakshmi", "1");
		System.out.println(p.keySet());
		System.out.println(p.containsValue("1"));
		
		System.out.println(p.values());
		LocalDateTime date = LocalDateTime.now();
	    System.out.println(date);
		
	}

}
