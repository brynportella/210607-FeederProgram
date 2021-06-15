package com.revature.model;

public class HardCandy extends Candy {

	/* TODO: 

	 * 	  
	 * Override toString
	 * 
	 */
	private String flavor;
	
	public HardCandy() {
		//name = "Hard Candy"
		//7 - secret number 
		//55.0- num of calories
		super("Hard Candy", 7, 55.0 );
	}
	
	public HardCandy(String flavor, String name, int number, double calories) {
		super(name, number, calories );		
		this.flavor = flavor;
	}



	

	public String getFlavor() {
		return flavor;
	}

	public void setFlavor(String flavor) {
		this.flavor = flavor;
	} 
	
	public void breakApart() {
		this.numberOfCalories /= 2.0; 
	}

	@Override
	public String toString() {
		return "HardCandy [flavor=" + this.flavor + ", name=" + name + ", numberOfCalories=" + numberOfCalories
				+ ", getMySecretCandyNumber()=" + getMySecretCandyNumber() + "]";
	}
	
	
	
}
