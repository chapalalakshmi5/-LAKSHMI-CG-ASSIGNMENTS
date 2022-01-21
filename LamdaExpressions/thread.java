package LamdaExpressions;
import java.util.*;
import java.lang.*;
public class thread {
	public static void main(String[] args)
	{
		Runnable r1=()->{  
			 LinkedList<Integer> list=new LinkedList<Integer>();
			 list.add(22);
			 list.add(10); 
			 System.out.println(list);
     };  
     Thread t1=new Thread(r1);  
     t1.start();  
		          
		    }
}
