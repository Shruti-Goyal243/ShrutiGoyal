package com.Function;

import java.util.Scanner;

import com.Controller.Main;
import com.Repo.Repository;
import com.entities.Cosmetics;
import com.entities.Snacks;

public class Functional {
   
	 public  void viewSnacks()
	  {   
		  System.out.println(">>>>>Snackss MENU");
		  System.out.println("Item ID :  Item Name :        Price      :     MFD     :      DOE");
		  System.out.println();
		  for(Snacks s:Repository.snack_list1) 
		  {
			  System.out.println("  " +s.getItem_id()+"  :  "+s.getItem_name()+"   :  "+s.getItem_price()+".00"+"    :    "+s.getItem_mfd()+"    :"+s.getItem_doe());
		      System.out.println();
		  }
              Main.menuUI();
     }
	 
	 public void getBevItemByName() {
		 System.out.println("Enter the First Letter");
		 Scanner sc = new Scanner(System.in);
		 String str = sc.nextLine().toUpperCase();
		 
		 for(Snacks s : Repository.snack_list1) {
			 
			 String name = s.getItem_name();
			 if(name.startsWith(str)) {
				System.out.println("Item ID :  Item Name :        Price      :     MFD     :      DOE");
				System.out.println("  " +s.getItem_id()+"  :  "+s.getItem_name()+"   :  "+s.getItem_price()+".00"+"    :    "+s.getItem_mfd()+"    :"+s.getItem_doe());
			    System.out.println();
			    Main.menuUI();
			 }
			 else {
				 System.out.println("No Item Found");
				 Main.menuUI();
			 } 
		 }	 
	 }
	 
	 public void getBevItemByMFD() {
		 
		 System.out.println("Enter the mfd in formate abc/XXXX");
		 Scanner sc = new Scanner(System.in);
		 String str = sc.nextLine().toUpperCase();
		 
		 for(Snacks s : Repository.snack_list1) {
			 
			 String mfd = s.getItem_mfd();
			 if(mfd.equalsIgnoreCase(str)) {
				System.out.println("Item ID :  Item Name :        Price      :     MFD     :      DOE");
				System.out.println("  " +s.getItem_id()+"  :  "+s.getItem_name()+"   :  "+s.getItem_price()+".00"+"    :    "+s.getItem_mfd()+"    :"+s.getItem_doe());
			    System.out.println();
			    Main.menuUI();
			 }
			 else {
				 System.out.println("No Item Found");
				 Main.menuUI();
			 }
			 
		 }
		 
		 
	 }
	 
	 
     public void getBevItemByDOE() {
		 
		 System.out.println("Enter the mfd in formate abc/XXXX");
		 Scanner sc = new Scanner(System.in);
		 String str = sc.nextLine().toUpperCase();
		 
		 for(Snacks s : Repository.snack_list1) {
			 
			 String doe = s.getItem_doe();
			 if(doe.equalsIgnoreCase(str)) {
				System.out.println("Item ID :  Item Name :        Price      :     MFD     :      DOE");
				System.out.println("  " +s.getItem_id()+"  :  "+s.getItem_name()+"   :  "+s.getItem_price()+".00"+"    :    "+s.getItem_mfd()+"    :"+s.getItem_doe());
			    System.out.println();
			    Main.menuUI();
			 }
			 else {
				 System.out.println("No Item Found");
				 Main.menuUI();
			 }
			 
		 }
		 
		 
	 }
	 
 public void getBevItemByPriceRange() {
		 
		 System.out.println("Enter the starting price range from");
		 Scanner sc = new Scanner(System.in);
		 int range1 = sc.nextInt();
		 System.out.println("Enter the ending price range from");
		 int range2 = sc.nextInt();
		 	 
		 for(Snacks s : Repository.snack_list1) {
			 
			 if((s.getItem_price()>range1) && (s.getItem_price()<range2)) {
				System.out.println("Item ID :  Item Name :        Price      :     MFD     :      DOE");
				System.out.println("  " +s.getItem_id()+"  :  "+s.getItem_name()+"   :  "+s.getItem_price()+".00"+"    :    "+s.getItem_mfd()+"    :"+s.getItem_doe());
			    System.out.println();
			    Main.menuUI();
			 }
			 else {
				 System.out.println("No Item Found");
				 Main.menuUI();
			 }
			 
		 }
		 
		 
	 }
	 //***********************************************************************************************************************
	 public  void viewCosmetic()
	  {   
		  System.out.println(">>>>>Cosmetics MENU");
		  System.out.println("Item ID :  Item Name :        Price      :     MFD     :      DOE");
		  System.out.println();
		  for(Cosmetics c:Repository.cosmetic_list2) 
		  {
			  System.out.println("  " +c.getItem_id()+"  :  "+c.getItem_name()+"   :  "+c.getItem_price()+".00"+"    :    "+c.getItem_mfd()+"    :"+c.getItem_doe());
		      System.out.println();
		  }
		  Main.menuUI();
     }
	 
	 
	 public void getCosItemByName() {
		 System.out.println("Enter the First Letter");
		 Scanner sc = new Scanner(System.in);
		 String str = sc.nextLine().toUpperCase();
		 
		 for(Cosmetics c : Repository.cosmetic_list2) {
			 
			 String name = c.getItem_name();
			 if(name.startsWith(str)) {
				System.out.println("Item ID :  Item Name :        Price      :     MFD     :      DOE");
				System.out.println("  " +c.getItem_id()+"  :  "+c.getItem_name()+"   :  "+c.getItem_price()+".00"+"    :    "+c.getItem_mfd()+"    :"+c.getItem_doe());
			    System.out.println();
			    Main.menuUI();
			 }
			 else {
				 System.out.println("No Item Found");
				 Main.menuUI();
			 }
			 
		 }
		 
	 }
	 
	 public void getCosItemByMFD() {
		 
		 System.out.println("Enter the mfd in formate abc/XXXX");
		 Scanner sc = new Scanner(System.in);
		 String str = sc.nextLine().toUpperCase();
		 
		 for(Cosmetics c : Repository.cosmetic_list2) {
			 
			 String mfd = c.getItem_mfd();
			 if(mfd.equalsIgnoreCase(str)) {
				System.out.println("Item ID :  Item Name :        Price      :     MFD     :      DOE");
				System.out.println("  " +c.getItem_id()+"  :  "+c.getItem_name()+"   :  "+c.getItem_price()+".00"+"    :    "+c.getItem_mfd()+"    :"+c.getItem_doe());
			    System.out.println();
			    Main.menuUI();
			 }
			 else {
				 System.out.println("No Item Found");
				 Main.menuUI();
			 }
			 
		 }
		 
		 
	 }
	 
	 
     public void getCosItemByDOE() {
		 
		 System.out.println("Enter the mfd in formate abc/XXXX");
		 Scanner sc = new Scanner(System.in);
		 String str = sc.nextLine().toUpperCase();
		 
		 for(Cosmetics c : Repository.cosmetic_list2) {
			 
			 String doe = c.getItem_doe();
			 if(doe.equalsIgnoreCase(str)) {
				System.out.println("Item ID :  Item Name :        Price      :     MFD     :      DOE");
				System.out.println("  " +c.getItem_id()+"  :  "+c.getItem_name()+"   :  "+c.getItem_price()+".00"+"    :    "+c.getItem_mfd()+"    :"+c.getItem_doe());
			    System.out.println();
			    Main.menuUI();
			 }
			 else {
				 System.out.println("No Item Found");
				 Main.menuUI();
			 }
			 
		 }
		 
		 
	 }
	 
 public void getCosItemByPriceRange() {
		 
		 System.out.println("Enter the starting price range from");
		 Scanner sc = new Scanner(System.in);
		 int range1 = sc.nextInt();
		 System.out.println("Enter the ending price range from");
		 int range2 = sc.nextInt();
		 	 
		 for(Cosmetics c : Repository.cosmetic_list2) {
			 
			 if((c.getItem_price()>range1) && (c.getItem_price()<range2)) {
				System.out.println("Item ID :  Item Name :        Price      :     MFD     :      DOE");
				System.out.println("  " +c.getItem_id()+"  :  "+c.getItem_name()+"   :  "+c.getItem_price()+".00"+"    :    "+c.getItem_mfd()+"    :"+c.getItem_doe());
			    System.out.println();
			    Main.menuUI();
			 }
			 else {
				 System.out.println("No Item Found");
				 Main.menuUI();
			 }
			 
		 }
		 
		 
	 }
}
