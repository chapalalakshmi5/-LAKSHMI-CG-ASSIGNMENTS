package Annotations;
import java.lang.annotation.*;
import java.lang.reflect.*;
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD,ElementType.TYPE})

@interface Execute
{
	int Sequence();
}
class Restaurant {
	@Execute(Sequence=1)
	public void Menu()
	{
		System.out.println("CoolDrinks");
		System.out.println("Icecream");
		System.out.println("Italian");
		System.out.println("Indian");
		
	}
	@Execute(Sequence=2)
	public void ItemsCost()
	{
		System.out.println("CoolDrinks:"+200);
		System.out.println("Icecream:"+500);
		System.out.println("Italian:"+650);
		System.out.println("Indian:"+600);
	}
	@Execute(Sequence=3)
	public void gstandtaxs()
	{
		System.out.println("Items cost"+200);
	}
	public static void main(String[] args)throws Exception
	{
		Restaurant r=new Restaurant();
		Method m=r.getClass().getMethod("Menu");
		 Execute e=m.getAnnotation(Execute.class);
         System.out.println("the Menu in the restaurant  sequence are:"+e.Sequence());
		r.Menu();
		Method m1=r.getClass().getMethod("ItemsCost");
		 Execute e1=m1.getAnnotation(Execute.class);
        System.out.println("the Menu in the restaurant  sequence are:"+e1.Sequence());
		r.ItemsCost();
		Method m2=r.getClass().getMethod("gstandtaxs");
		 Execute e2=m2.getAnnotation(Execute.class);
       System.out.println("the Menu in the restaurant  sequence are:"+e2.Sequence());
		r.gstandtaxs();
        }
	}
	

