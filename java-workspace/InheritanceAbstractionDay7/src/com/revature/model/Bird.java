package com.revature.model;

public class Bird extends Animal {
	
	//Shadows the inherited property 
	//DONT DO THAT 
	String name= "Bird"; 
	
	public void messinessWithNames() {
		System.out.println(super.name);
		System.out.println(name);
	}
	
	
	public static void main(String[] args) {
		Animal birdie = new Bird(); 
		((Bird)birdie).messinessWithNames();
		System.out.println(birdie.name);
		
	}
	
	@Override
	public void eat() {
		System.out.println("Yum worms!");
		
	}

}
