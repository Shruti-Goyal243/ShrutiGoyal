package com.Controller;

import java.util.Scanner;

import com.Repo.Repository;
import com.View.View;

public class Main {

	
	
	 public static void menuUI()
	   {
		 System.out.println("**********  WellCome To Shopping Mart  ***********");
		 System.out.println();
		 
		 System.out.println(" SELECT CATEGORIES !! ");
		 System.out.println("1 Snacks");
		 System.out.println("2 Cosmetics");
		 System.out.println("6 To Exit From Shopping Cart");
		 System.out.println();
		 
		 
	   }
	public static void main(String[] args) {
	
		Repository repo = new Repository();
		repo.data_Repo();
		View view = new View();
		
		
		int option;
		do
		{
			menuUI();
			System.out.println("Press Number To Select Category");
			Scanner sc = new Scanner(System.in);
			option = sc.nextInt();
			switch(option) 
			{
			
			case 1:view.FindOptionSnacks();
			       System.out.println("*********************************");
			       break;
			case 2:view.FindOptionCosmetic();
		           System.out.println("*********************************");
		           break;	
			}
		}
		while(option!= 6) ;
		

	}

}
