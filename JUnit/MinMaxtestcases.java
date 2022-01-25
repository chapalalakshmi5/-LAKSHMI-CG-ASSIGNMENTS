package JUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class MinMaxtestcases {

	    int[] array = new int[] {1, 2, 3, 58, 47, 229, 40};
	    int[] array1=new int[] {56,34,7,3,54,3,34,34,53};
        int[] array2=new int[] {78,90,45,100,56,32,100};
	    @Test
	    public void shouldBeMaxValue() {
	        int maxValue = MinMaxFind.getMaxValue(array);
	        int maxValue1 = MinMaxFind.getMaxValue(array1);
	        int maxValue2 = MinMaxFind.getMaxValue(array2);
	        
	       assert(maxValue == 229);
	       assert(maxValue1==56);
	       assert(maxValue2==100);
	       
	       
	    }

	    @DisplayName(value = "this is to test minmax program")
	    @Test
	   
	    public void shouldBeMinValue() {
	    	int minValue=MinMaxFind.getMinValue(array);
	    	int minValue1=MinMaxFind.getMinValue(array1);
	        int minValue2=MinMaxFind.getMinValue(array2);
	    	
	    	assert(minValue==1);
	    	assert(minValue1==3);
	    	assert(minValue2==32);
	    }

}