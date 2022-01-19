package Annotations;
import java.util.*;
import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Test {
	String name();

}
class annotation
{

	@Test(name="bob")
	public void fruits()
	{
	
		System.out.println("Apple is a fruit");
	}
	public static void main(String[] args)throws Exception
	{
		
		annotation a=new annotation();
		a.fruits();
		Method m=a.getClass().getMethod("fruits");
		Test t=m.getAnnotation(Test.class);
		System.out.println("name is:"+t.name());
		
	}
}
