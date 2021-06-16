package com.revature.main;

import com.revature.model.Fish;
import com.revature.model.Swimmer;

public class WorkingWithInterfaces {
	Swimmer[] aquarium;
	
	public static void main(String[] args) {
		Swimmer swimmy = new Fish(); 
		
		swimmy.swim(); 
	}
	
	public void createAquarium(Swimmer swimmer) {
		//put swimmer into aquarium 
	}
}
