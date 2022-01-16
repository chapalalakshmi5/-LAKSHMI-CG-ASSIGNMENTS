package generics;
import java.util.Random;

public class test<T>
{
	

	public static void main(String[] args)
	{
		test<Integer> in=new test<Integer>();
		test<Double> in1=new test<Double>();
		for(int i=0;i<10;i++)
		{
			Random rand=new Random();
		   int randomint=rand.nextInt(1,5);
		   Double randomdouble=rand.nextDouble(1,5);
		   System.out.println("the random integer values are:"+randomint);
		   System.out.println("the random double values are:"+randomdouble);
		}
		
	}

}
