package LamdaExpressions;
import java.lang.*;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Inbult {
	public static void main(String[] args)
	{
		String name="Bob";//supplier Inbuilt
		display(()->name+" is a Student");
		display(()->name+" is a Employee");
		
		Consumer<Inbult> address=n->n.enter("lakshmi");//Consumer Inbuilt 
		Inbult i=new Inbult();
		address.accept(i);
		
		Predicate<String> isALongWord = t -> t.length() > 10;//predicate Inbuilt
        String s = "successfully";
		boolean result = isALongWord.test(s);
		System.out.println(result);
	}
	static void display(Supplier<String> a)//Supplier Method
	{
		System.out.println(a.get());
	}
	static void enter(String s)//Consumer Method
	{
		System.out.println(s);
	}

}
