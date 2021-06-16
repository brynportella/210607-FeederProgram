package com.revature.model;


public final class Fish extends Animal implements Swimmer, A{

	@Override
	public void eat() {
		System.out.println("Yum fish food!");
		
	}
	

	public void swim() {
		System.out.println("Zoom zoom glub glub I am swimming");
	}
	
	
}
