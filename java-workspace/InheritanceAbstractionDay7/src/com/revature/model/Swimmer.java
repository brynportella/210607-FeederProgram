package com.revature.model;

public interface Swimmer {
	
	public static final double lungCapacity=89.9; 
	
	//Interfaces define a new data type and 
	//they typically are made of abstract methods. 
	//contracts -- between implementing classes and the rest of the program
	
	//methods are implicitly public and abstract 
	void swim(); 
	
	public default void sink() {
		System.out.println("I am sinking");
	}
}
