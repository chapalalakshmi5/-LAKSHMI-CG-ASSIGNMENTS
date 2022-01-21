package LamdaExpressions;
import java.util.List;
import java.util.function.Consumer;

public class words{
 public static void main(String[] args) 
 {
      var words = List.of("Apple", "Box", "Cat", "Dog","Elephant", "Fox");
      words.forEach(new Consumer<String>() 
{
 
public void accept(String s) 
 {

     StringBuilder initials = new StringBuilder();
     for (String st : s.split(" "))
	{
	   initials.append(st.charAt(0));
	}
	System.out.print(initials.toString());
 }
		            
});
}
}
	



