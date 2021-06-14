package com.revature;

import com.revature.model.Candy;
import com.revature.model.Chocolate;

public class Driver {
	
	
	
	public static void main(String[] args) {
		Candy kitkat = new Candy(); 
		
		//Can't access outside of the package
		//kitkat.name = "KitKat"; 
		
		//This is okay because its public 
		//kitkat.numberOfCalories = 1000.0; 
		//Invoke setNumberOfCalories
		kitkat.setNumberOfCalories(1000.0);
		
		System.out.println(kitkat.numberOfCalories);
		
		Chocolate myChocolate = new Chocolate();
		myChocolate.setName("Chocolate from main");
		myChocolate.printChocolate();
		System.out.println(myChocolate);
	}
}
