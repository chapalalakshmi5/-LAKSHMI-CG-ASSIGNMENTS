package LamdaExpressions;

import java.util.HashMap;
import java.util.*;

public class Book 
{
	public static void main(String[] args)
	{
	
	Map<String,String> m=new HashMap<String,String>();
	m.put("Apoorva Kumar Singh","A Commentary and Digest on The Air, Act 1981");
	m.put("Abhay K.","The Bloomsbury Anthology of Great Indian Poems");
	m.put("Amit Shah", "Karmayoddha Granth");
	
	StringBuilder sb=new StringBuilder();
	for (Map.Entry<String,String> entry:m.entrySet())
	{
		 sb.append(entry.getKey() + ": " + entry.getValue());
		   sb.append(";");
	}
	System.out.print(sb.toString());
	
	
	}
}
