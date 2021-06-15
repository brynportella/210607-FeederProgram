package com.revature.model;

public class Dog extends Animal {

	@Override
	public String toString() {
		return "Dog [name=" + name + "]";
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Yummy kibble!");
	}
	
	
}
