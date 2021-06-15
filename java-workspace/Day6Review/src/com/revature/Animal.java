package com.revature;

public class Animal {

	protected String name; 
	
	//Is not passed down to Cat 
	//because it's not visible in Cat
	private void printInfo() {
		System.out.println("Info");
	}
	/*
	 * Source menu
	 *  
	 * Generate hashCode and equals
	 */

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Animal other = (Animal) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	

}
