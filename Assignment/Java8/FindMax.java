//4. WAP to find maximum from array of numbers with the help of stream api.

import java.util.Scanner;
import java.util.Arrays;

public class FindMax{
	public static void main(String args[]) {
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of elements in Array : ");
		int n = scanner.nextInt();
		int number[] = new int[n];
		System.out.println("Enter "+ n +" numbers");
	    for(int i=0;i<n;i++)
	    {
	        number[i] = scanner.nextInt();
	    }
	
		int max = Arrays.stream(number)
                        .max()
                        .getAsInt();
		 System.out.println("Max element is " + max);
	}

}

