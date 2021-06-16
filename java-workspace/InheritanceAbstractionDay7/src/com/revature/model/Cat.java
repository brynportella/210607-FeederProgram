package com.revature.model;

public class Cat extends Animal {
	private int numberOfLives;
	
	public Cat() {
		super("Tom"); 
	}
	
	@Override
	public String toString() {
		return super.toString()+"Cat [numberOfLives=" + numberOfLives + "]";
	}

	public int getNumberOfLives() {
		return numberOfLives;
	}

	public void setNumberOfLives(int numberOfLives) {
		this.numberOfLives = numberOfLives;
	}

	@Override
	public void eat() {
		System.out.println("Yum fish!");
		
	} 
	
	
	
}
