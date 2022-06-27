//9.WAP to implement predicate to check given list of array contain how many even and odd .

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CountEvenOdd {

	
	 public static void main(String[] args)
	 {
		 int arr_size = 5;
		 int arr[]= {12,13,14,15,16};
	 
	    {
	        int even_count = 0;
	        int odd_count = 0;
	 
	        for (int i = 0; i < arr_size; i++) {
	             
	              
	            if ((arr[i] & 1) == 1)
	                odd_count++;
	            else
	                even_count++;
	        }
	 
	        System.out.println("Even Element ="  + "  " + even_count +"   "
	                           + " Odd elements = " + odd_count);
	    }
	 
}
}