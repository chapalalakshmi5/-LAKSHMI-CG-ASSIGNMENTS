package generics;

import java.util.HashSet;

public class employee 
{
	public static void main(String[] args)
	{
		HashSet<String> sc=new HashSet<String>();
		sc.add("lakshmi");
		System.out.println(sc);
		HashSet<Integer> sc1=new HashSet<Integer>();
		sc1.add(1);
		System.out.println(sc1);
		HashSet<String> sc2=new HashSet<>();
		sc2.add("cse");
		System.out.println(sc2);
		HashSet<Integer> sc3=new HashSet<Integer>();
		sc3.add(20000);
		System.out.println(sc3);
		
		}
}
