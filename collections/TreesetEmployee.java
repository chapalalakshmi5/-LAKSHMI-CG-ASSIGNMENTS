package collections;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class TreesetEmployee {
	int phonenumber;
	String name,Email,gender;
	public TreesetEmployee(int phonenumber,String Email,String gender)
	{
		
		this.phonenumber=phonenumber;
		this.Email=Email;
		this.gender=gender;
	}
	public static void main(String[] args)
	{
		Map<String,TreesetEmployee> tm=new TreeMap<String,TreesetEmployee>(Collections.reverseOrder());
		TreesetEmployee c1=new TreesetEmployee(99,"123@gmail.com","Female");
		TreesetEmployee c2=new TreesetEmployee(100,"456@gmail.com","male");
		TreesetEmployee c3=new TreesetEmployee(150,"897@gmail.com","Female");
        tm.put("lakshmi",c1);
        tm.put("bob",c2);
        tm.put("marry",c3);
         for(Map.Entry<String,TreesetEmployee> entry:tm.entrySet())
        {    
            String Key=entry.getKey();  
            TreesetEmployee b=entry.getValue();  
            System.out.println(" names in the sorted order are:"+Key); 
            System.out.println(b.phonenumber+" "+b.Email+" "+b.gender); 
           System.out.printf("%s\n  %d  %s  %s",Key,b.phonenumber,b.Email,b.gender);
            
            
        }
}
}
