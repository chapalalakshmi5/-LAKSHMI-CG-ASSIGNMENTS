package generics;

public class employee <T1,T2,T3,T4>
{
	public void display(T1 id, T2 name,T3 salary,T4 department)
	{
		System.out.println("id= "+id+" name= "+name+" salary= "+salary+" department= "+department);
	}
	public static void main(String[] args)
	{
		employee<Integer,String,Integer,String> sc=new employee<Integer,String,Integer,String>();
		sc.display(1,"lakshmi",20000,"analyst");
		sc.display(2,"bob",25000,"manager");
		
	}
}
