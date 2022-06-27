package com.View;

import java.util.Scanner;

import com.Function.Functional;
import com.Repo.Repository;
import com.entities.Cosmetics;

public class View {
	
	
	
	public static void FindOptionSnacks() {
		
		Functional function = new Functional();
			 
			 
			 int option;
				do
				{
					System.out.println("**********  Enter the key ***********");
					 System.out.println();
					 
					 System.out.println("1 To Show All Item");
					 System.out.println("2 Sort by Name");
					 System.out.println("3 Sort by MFD");
					 System.out.println("4 Sort by DateOfExpiry");
					 System.out.println("5 Sort by Price Range");
					 System.out.println("6 To Exit From Shopping Cart");
					 System.out.println();
					System.out.println("Press Number To Select Category");
					Scanner sc = new Scanner(System.in);
					option = sc.nextInt();
					switch(option) 
					{
					
					case 1:function.viewSnacks();
					       System.out.println("***********************************");
					       break;
					case 2:function.getBevItemByName();;
				           System.out.println("***********************************");
				           break;
					case 3:function.getBevItemByMFD();
			           	   System.out.println("***********************************");
			               break;
					case 4:function.getBevItemByDOE();
			               System.out.println("***********************************");
			               break;
					case 5:function.getBevItemByPriceRange();
			               System.out.println("************ **********************");
			               break;
					}
				}
				while(option!= 6) ;
				
		   }
	
	
	
public static void FindOptionCosmetic() {
		
		Functional function = new Functional();
			 
			 
			 int option;
				do
				{
					System.out.println("**********  Enter the Key ***********");
					 System.out.println();
					 
					 System.out.println("1 To Show All Item");
					 System.out.println("2 Sort by Name");
					 System.out.println("3 Sort by MFD");
					 System.out.println("4 Sort by DateOfExpiry");
					 System.out.println("5 Sort by Price Range");
					 System.out.println("6 To Exit From Shopping Cart");
					 System.out.println();
					System.out.println("Press Number To Select Category");
					Scanner sc = new Scanner(System.in);
					option = sc.nextInt();
					switch(option) 
					{
					
					case 1:function.viewCosmetic();
					       System.out.println("**************************************");
					       break;
					case 2:function.getCosItemByName();;
				           System.out.println("**************************************");
				           break;
					case 3:function.getCosItemByMFD();
			           	   System.out.println("**************************************");
			           	   break;
					case 4:function.getCosItemByDOE();
						   System.out.println("**************************************");
						   break;
					case 5:function.getCosItemByPriceRange();
						   System.out.println("**************************************");
			               break;
					}
				}
				while(option!= 6) ;
				
		   }
		
	}
     
