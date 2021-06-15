package com.revature.main;

import com.revature.model.Animal;
import com.revature.model.Cat;

public class Main {
	public static void main(String[] args) {
		Cat cat = new Cat(); 
		cat.setName("Garfield");
		cat.setNumberOfLives(9);
		
		System.out.println(cat);
		
		//Co-variant types an example of polymorphism 
		//form of upcasting 
		Animal myAnimal = cat; 
		
		//Only have access via myAnimal to Animal's methods/state
		myAnimal.setName("Garf");
		
		viewAnimal(cat);
		viewAnimal(myAnimal);//toString from Animal? Cat? Object? 
		//Overridden behavior depends on the instance itself 
		//depends on the specific object 
		//regardless of the reference type 
		
		//Overriding is runtime polymorphism 
		
	}
	
	private static void viewAnimal(Animal animal) {
		System.out.println(animal);
	}
	
}
