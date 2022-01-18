package collections;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class DOBLYN {
	public static void main(String arsg[])
	{
		LocalDate birthday = LocalDate.of(2004, 07, 24);
		LocalDate birthday2 = LocalDate.of(1999, 11, 24);
		LinkedList<LocalDate> li=new LinkedList<LocalDate>();
		li.add(birthday);
		li.add(birthday2);
		for(LocalDate ld : li)
		{
	
		String date = ld.format(DateTimeFormatter.ofPattern("dd-MM-YYYY"));
		if(ld.isLeapYear())
		{
			System.out.println("your date of birth is"+date+"it is a leap year");
		}
			else
			{
				System.out.println("your date of birth is "+date+"it is not a leap year");
		}
		}
		
		
		
	}

}
