package collections;
import java.util.*;

class contact  {
	int phonenumber;
	String name,Email,gender;
	public contact(String name,String Email,String gender)
	{
		
		this.name=name;
		this.Email=Email;
		this.gender=gender;
	}
	public static void main(String[] args)
	{
		Map<Integer,contact> tm=new TreeMap<Integer,contact>(Collections.reverseOrder());
		contact c1=new contact("bob","123@gmail.com","male");
		contact c2=new contact("marry","456@gmail.com","female");
		contact c3=new contact("laris","897@gmail.com","male");
        tm.put(99854321,c1);
        tm.put(98554321,c2);
        tm.put(97453218,c3);
         for(Map.Entry<Integer, contact> entry:tm.entrySet())
        {    
            int Key=entry.getKey();  
            contact b=entry.getValue();  
            System.out.println(Key+" phonenumber"); 
            System.out.println(b.name+" "+b.Email+" "+b.gender); 
           System.out.printf("%d   %s  %s  %s",Key,b.name,b.Email,b.gender);
            
            
	}
	}


}
	
	
	

