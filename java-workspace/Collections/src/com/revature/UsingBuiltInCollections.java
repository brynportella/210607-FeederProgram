package com.revature;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

import com.revature.model.Animal;

public class UsingBuiltInCollections {
	public static void main(String[] args) {
		LinkedList<Animal> myList = new LinkedList<Animal>(); 
		Animal dog = new Animal("dog"); 
		Animal cat = new Animal("cat"); 
		Animal pig = new Animal("pig"); 
		myList.add(pig); 
		myList.add(cat); 
		myList.add(dog); 
		
		System.out.println(myList);
		List<Animal> list = myList; 
		Deque<Animal> doubleEndedQueue = myList; 
		//Set<int> mySet = new HashSet<>(); 
		
 		
	}
}
