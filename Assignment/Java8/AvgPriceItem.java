// 6. WAP to create list of item price whose price is less than average price of all item.

import java.util.Scanner;

public class AvgPriceItem{
	public static void main(String args[]) {
		
		int avgPrice;
		int totalPrice = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number of Items : ");
		int n = scanner.nextInt();
		int number[] = new int[n];
		System.out.println("Enter Price of "+ n +" number Items : ");
	    for(int i=0;i<n;i++)
	    {
	        number[i] = scanner.nextInt();
	    }
	
		for(int i=0;i<n;i++)
		{
		    
			totalPrice = totalPrice+ number[i];
			
		}
		avgPrice = totalPrice/n;
		System.out.println("List of Price Less than Average Price...");
		for(int i=0;i<n;i++)
		{
		    if(avgPrice > number[i])
		    {
		        System.out.println(number[i]);
		    }
		}
		
		
	}

}
