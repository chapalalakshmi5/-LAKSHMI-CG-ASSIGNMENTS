package Streams;

import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.*;

import LamdaExpressions.orders;


import java.lang.*;

class Fruit  {
	String name;
	int calories;
	int price;
	String color;
	public Fruit(String name,int calories,int price,String color)
	{
		super();
		this.name=name;
		this.calories=calories;
		this.price=price;
		this.color=color;
	}
		
	
}
class News{
	int newsid;
	String postedByUser;
	String commentByUser;
	String comment;
	public  News(int newsid,String postedByUser,String commentByUser)
	{
		this.newsid=newsid;
		this.postedByUser=postedByUser;
		this.commentByUser=commentByUser;
		
		
	}

}
class Trader {
String name;
String city;
public Trader(String name,String city)
{
	this.name=name;
	this.city=city;
}
}
class Transaction {
	
	
	
	int year;
	int value;
	public Transaction(int year,int value)
	{
		
		this.year=year;
		this.value=value;
	}

}



public class main {
	
		public static int countWords(String com)//countWords method 
		    {
			 if (com == null || com.isEmpty())
		     System.out.println("the list is empty");
			 String[] words = com.split("Budget");
			return (words.length);
		    }
		 
		 public static void main(String[] args)
			{
		ArrayList<Fruit> list=new ArrayList<Fruit>();
		list.add(new Fruit("Apple",200,200,"Red"));
		list.add(new Fruit("Grapes",78,50,"Green"));
		list.add(new Fruit("Watermelon",55,90,"Red"));
		list.add(new Fruit("Kiwi",150,110,"Green"));
		list.add(new Fruit("pineapple",60,88,"yellow"));
		Map<String,News> list1=new TreeMap<String,News>(Collections.reverseOrder());
		News n1=new News(7,"bob","jack");
		News n2=new News(5,"harry","Emma");
		News n3=new News(4,"peter","angelina");
		News n4=new News(3,"Nova","Emma");
		list1.put("Finance minister Nirmala Sitharaman is likely to present the Budget 2022 on February 1. This will be the fourth Budget of the Modi government's second term and will be looked at keenly for commentary that will shape up India's next leg of growth.", n1);
		list1.put("good", n4);
		list1.put("Awesome", n2);
		list1.put("interesting,good", n3);
		list1.put("Budget 2022 is likely to give more clarity on the treatment of private cryptocurrencies. Emerging technologies like blockchain could also feature in the Budget along with sectors like fintech, renewables and SaaS.",n4);
	
	Map<Trader,Transaction> list3=new TreeMap<Trader,Transaction>();
		Trader t=new Trader("emmile","bangalore");
		Trader t1=new Trader("hyma","pune");
		Trader t2=new Trader("emma","japan");
		Trader t3=new Trader("nova","mumbai");
		Transaction tr=new Transaction(1999,200);
		Transaction tr1=new Transaction(2010,100);
		Transaction tr2=new Transaction(2019,50);
		Transaction tr3=new Transaction(2011,40);
		list3.put(t,tr);
		list3.put(t1,tr1);
		list3.put(t2, tr2);
		list3.put(t3,tr3);
		
		
		/*for(Map.Entry<Trader,Transaction> entry1:list3.entrySet())
		{
			Trader ta=entry1.getKey();
			Transaction ta1=entry1.getValue();
			Optional<Trader> isbnCodes = list3.entrySet().stream().filter(e -> "2011".equals(e.getValue())).map(Map.Entry::getKey).findFirst().forEach(f->System.out.println(f.year));
			
		}*/
		for(Map.Entry<String,News> entry:list1.entrySet())
		{
			String com=entry.getKey();
			News n=entry.getValue();
			System.out.println(countWords(com));//print count words
			
			System.out.println(n.commentByUser+com);
			
			
		}
		
		 list.stream().filter(o->o.calories<100).forEach(f->System.out.println(f.name+" "+f.calories));//print calories name
		 
		 Stream<Fruit>  filtereddata1=list.stream().filter(o->o.color=="Red");
          
			 filtereddata1.forEach
			 (  
		            Fruit ->{
		            	        
		            	
		                	    System.out.println(Fruit.name+" "+Fruit.price);
		                	    
		                        
		                      }
		     );  
			 
			 
}
}
