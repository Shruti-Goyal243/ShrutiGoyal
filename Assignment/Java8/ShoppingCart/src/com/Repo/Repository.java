package com.Repo;

import java.util.ArrayList;
import com.entities.Cosmetics;
import com.entities.Snacks;

public class Repository {
	
	 public static ArrayList<Snacks> snack_list1;
	 public static ArrayList<Cosmetics> cosmetic_list2;
	 
	 public static void data_Repo() {
		 
		 snack_list1 = new ArrayList<Snacks>();
		 
		 Snacks b1 = new Snacks();
		 b1.setItem_id(1);
		 b1.setItem_name("Milk Shake");
		 b1.setItem_price(125);
		 b1.setItem_mfd("Jan/2021");
		 b1.setItem_doe("Jan/2023");
		 
		 Snacks b2 = new Snacks();
		 b2.setItem_id(2);
		 b2.setItem_name("Coffee");
		 b2.setItem_price(99);
		 b2.setItem_mfd("Feb/2020");
		 b2.setItem_doe("Feb/2022");
		 
		 Snacks b3 = new Snacks();
		 b3.setItem_id(3);
		 b3.setItem_name("Tea Bags");
		 b3.setItem_price(150);
		 b3.setItem_mfd("Oct/2020");
		 b3.setItem_doe("Oct/2022");
		 
		 snack_list1.add(b1);
		 snack_list1.add(b2);
		 snack_list1.add(b3);
		 
		 cosmetic_list2 = new ArrayList<Cosmetics>();
		 
		 Cosmetics c1 = new Cosmetics();
		 c1.setItem_id(1);
		 c1.setItem_name("Axe HairGell");
		 c1.setItem_price(69);
		 c1.setItem_mfd("Sept/2022");
		 c1.setItem_doe("Sept/2024");
		 
		 Cosmetics c2 = new Cosmetics();
		 c2.setItem_id(2);
		 c2.setItem_name("Nivia Deo");
		 c2.setItem_price(120);
		 c2.setItem_mfd("Aug/2022");
		 c2.setItem_doe("Aug/2024");
		 
		 Cosmetics c3 = new Cosmetics();
		 c3.setItem_id(3);
		 c3.setItem_name("Hair Dyer");
		 c3.setItem_price(250);
		 c3.setItem_mfd("Dec/2022");
		 c3.setItem_doe("Dec/2024");
		 
		 cosmetic_list2.add(c1);
		 cosmetic_list2.add(c3);
		 cosmetic_list2.add(c3);
		 
		 
		 
	 }

}
