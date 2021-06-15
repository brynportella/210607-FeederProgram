package com.revature;
public class Cat extends Animal{
	private int age; 
	
	//getter 
	public int getSomeVar() {
		if(age> 100)
			return this.age; 
		else
			return 100; 
	}
	
	public void setSomeVar(int a) {
		this.age = a;
	}
	
	public static void main(String[] args) {
		Cat cat = new Cat(); 
		//cat.age = 100; 
		cat.setSomeVar(100);
	}
	
	
}
