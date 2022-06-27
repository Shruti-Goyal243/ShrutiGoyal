//1 WAP to find out average marks from the list of the marks

import java.util.Scanner;
 
class AverageMarks
{
  public static void main(String args[])
  {
 
 int average;
 int total = 0;
    System.out.println("Enter Number of Subjects : ");
 
    Scanner sc = new Scanner(System.in);
 
    int n = sc.nextInt();
 
    int[] a = new int[n];
 
    System.out.println("Enter marks");
 
    for(int i=0;i<n;i++)
    {
      a[i] = sc.nextInt();
    }

    for(int i=0;i<n;i++)
	{
	    
		total= total+ a[i];
		
	}
	average = total/n;
	System.out.print("average marks is"+"  "+average);
 
  }
}


		
	

