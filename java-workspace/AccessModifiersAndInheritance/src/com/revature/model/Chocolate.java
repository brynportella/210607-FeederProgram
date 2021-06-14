package com.revature.model;

public class Chocolate extends Candy{
	/*
	 * Add chocolate specific fields 
	 * 
	 * add chocolate specific methods
	 * 
	 * Set up constructor to establish the state of the chocolate
	 * 
	 * 
	 */
	
	
	public Chocolate() {
		this.name = "Some kind of chocolate!";
		this.numberOfCalories = 100.0; 
		this.setMySecretCandyNumber(5);
	}
	
	public void printChocolate() {
		
		System.out.println(this.getName());
		System.out.println(this.getNumberOfCalories());
		System.out.println(this.getMySecretCandyNumber());
	}
	
	/*
	 * Method overriding:
	 * 1. Need an IS-A relationship 
	 * 2. Define a method that is declared in the superclass in the subclass
	 * (THE methods must have the SAME NAME)
	 * 3. Make sure parameters match.
	 * 4. Make sure return type is compatible. 
	 * 5. Make it as visible as the inherited method.
	 */
	
	public String toString() {
		return "Name: "+this.getName()+
				" Calories: "+this.getNumberOfCalories()+
				"SecretNumber "+this.getMySecretCandyNumber(); 
	}
}
