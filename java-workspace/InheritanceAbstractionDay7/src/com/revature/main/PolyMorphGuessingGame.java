package com.revature.main;

import java.util.Scanner;

import com.revature.model.Animal;
import com.revature.model.Cat;
import com.revature.model.Dog;

public class PolyMorphGuessingGame {
	private static Scanner scan = new Scanner(System.in); 
	
	public static void main(String[] args) {
		System.out.println("Do you want to play as a dog or cat? Enter c or d.");
		String input = scan.next(); 
		Animal animal = null; 
		switch(input.toLowerCase().trim()) {
		case "c":
			animal = new Cat(); 
			break;
		case "d":
			animal = new Dog(); 
			break;
		}
		System.out.println(animal);
		scan.close(); 
	}
	
	//write methods that deal with swimming animals
}
