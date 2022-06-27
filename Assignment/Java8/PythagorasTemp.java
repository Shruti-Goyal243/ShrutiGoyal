//2.3 From a given set of numbers in array, you need to find out how many number satisfy the Pythagoras template

import java.io.*;
import java.util.*;

public class PythagorasTemp {
	
	public static void main(String[] args) {

		int arr[] = {7,8,12,4,3,15,9,17};
		int n=arr.length;
		int a,b,c;
		for(int i=0;i<n-2;i++)
		{
			for(int j=i+1;j<n-1;j++)
				{
				for(int k=i+2;k<n;k++)
				{
					a = arr[i];	
					b = arr[j];	
					c = arr[k];
					if(a*a + b*b == c*c) 	
						System.out.println(a +" "+b+" "+c);
				}
				}
		}
	}
}
