package com.revature;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapOfCollection {
	public static void main(String[] args) {
		Set<String> setOfLetters = new HashSet<String>();

		setOfLetters.add("A");
		setOfLetters.add("B");
		
		Map<Set<String>, Integer> mapOfSet = new HashMap<>(); 
		
		
		mapOfSet.put(setOfLetters, 4);
		
		for(Map.Entry<Set<String>, Integer> entry : mapOfSet.entrySet()) {
			System.out.println(entry);
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
		
		System.out.println(mapOfSet.get("A")); //returns null 
	
	}
}
