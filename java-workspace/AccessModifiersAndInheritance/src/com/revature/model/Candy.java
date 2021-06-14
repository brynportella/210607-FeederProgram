package com.revature.model;

/*
 * Encapsulation-- the idea that we want all 
 * class members to be as private as possible 
 * 
 */
public class Candy extends Object {
	//This is package-private
	//default access modifier -- i.e. NO access modifier 
	String name; 
	
	//private to the class
	private int mySecretCandyNumber; 
	
	//accessible in all classes regardless of the package 
	public double numberOfCalories; 
	
	//protected -- more on this to come
	
	
	//Getter and setter for name 
	
	//Getter-- accessor 
	public String getName() {
		return this.name; 
	}
	
	//Setter - mutator 
	public void setName(String name) {
		this.name = name; 
	}

	public int getMySecretCandyNumber() {
		return mySecretCandyNumber;
	}

	public void setMySecretCandyNumber(int mySecretCandyNumber) {
		this.mySecretCandyNumber = mySecretCandyNumber;
	}

	public double getNumberOfCalories() {
		return numberOfCalories;
	}

	public void setNumberOfCalories(double numberOfCalories) {
		this.numberOfCalories = numberOfCalories;
	}
	
	
}
