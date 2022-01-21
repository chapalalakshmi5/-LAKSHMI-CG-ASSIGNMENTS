package LamdaExpressions;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Stream;
import java.lang.*;
import java.util.List;

interface oddlengthinterface
{
	public void oddlengthf(String list);
}

public class oddlength {
	public static void main(String[] arsg)
	{
		int i=0;
		LinkedList<String> list=new LinkedList<String>();
		list.add("Bob");
		list.add("lakshmi");
		list.add("laks");
		list.add("lessa");
		list.add("marry");
	    List<String> words = new ArrayList<String>();
	    for (String word:words)
	    {
	        if (i % 2 != 0)
	        {

	            //it.remove();
	            list.add(word);
	        }

	        i++;
	    }
	    words.removeAll(list);
		 {
			 System.out.println(list);
		 }
		 
}
}
