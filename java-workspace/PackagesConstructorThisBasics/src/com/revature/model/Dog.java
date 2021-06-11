package com.revature.model;

public class Dog {
	public double size;
	
	
	//Constructors don't have a return type
	public Dog() {
		//Typically we setup our object's state in the constructor 
		this(45.0); //first line in the constructor 
		//We can add any valid Java instructions/statements
	}
	
	//Constructor overloading 
	//Paramterized Constructor
	public Dog(double size) {
		this.size = size; 
	}
	
	
	public void grow(double amountOfGrowth) {
		this.size += amountOfGrowth; 
	}
	//To overload methods is to change the list of parameters
	//and create a method of the same name in the same class. 
	public void grow() {
		this.size += 1; 
	}
	
	public static void main(String[] args) {
		Dog sparky = new Dog();
		sparky.grow(1);
	}
}
