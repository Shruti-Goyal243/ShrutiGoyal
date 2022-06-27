// 7. WAP to print only those price which are even from the given item list.

import java.util.Scanner;

public class EvenPriceList {
	public static void main(String args[]) {
		

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n = scanner.nextInt();
		int number[] = new int[n];
		System.out.println("Enter "+ n +" numbers");
	    for(int i=0;i<n;i++)
	    {
	        number[i]=scanner.nextInt();
	    }
	
		System.out.println("Even Number in given list are ");
		for(int i=0;i<n;i++)
		{
		    if( number[i]%2 == 0)
		    {
		        System.out.println(number[i]);
		    }
		}
			
	}

}
