package LamdaExpressions;
import java.lang.annotation.*;
import java.util.*;
import java.util.stream.Stream;
public class orders {
	float price;
	String ordername;
	String orderaddress;
	String orderstatus;
	public orders(float price,String ordername,String orderaddress,String orderstatus)
	{
		this.price=price;
		this.ordername=ordername;
		this.orderaddress=orderaddress;
		this.orderstatus=orderstatus;
	}
	public static void main(String[] args)
	{
		ArrayList<orders> list=new ArrayList<orders>();
		list.add(new orders(2000f,"wristwatch","Bangalore","ACCEPTED"));
		list.add(new orders(450000f,"watchingmatchine","Pune","COMPLETED"));
		list.add(new orders(19000f,"Smartwatch","Mumbai","ACCEPTED"));
		list.add(new orders(80000f,"LapTop","Nellore","COMPLETED"));
		
		Stream<orders>  filtereddata=list.stream().filter(o->o.price>10000);
		 filtereddata.forEach
		 (  
	            orders ->{
	                	    System.out.println(orders.ordername+": "+orders.price);
	      
	                         System.out.println(orders.orderstatus);
	                      }
	     );  
	}

}
