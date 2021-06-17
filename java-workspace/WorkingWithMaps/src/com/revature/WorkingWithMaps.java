package com.revature;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set; 

public class WorkingWithMaps {
	public static void main(String[] args) {
		//Map<KEYTYPE, VALUETYPE> nameOfVariable = new ImplementationOFMAP<>();
		Map<String, Integer> map = new Hashtable<>(); //HashMap
		
		map.put("A", 1);
		map.put("B", 1);
		//Can't have repeat keys -- simply updates the value 
		map.put("A", 5);
		System.out.println(map);
		
		System.out.println(map.get("B"));
		
		//Iterating over a map
		for(String key : map.keySet()) {
			System.out.println(key);
			System.out.println("Value "+map.get(key));
		}
		
		for (Integer i : map.values()) {
			System.out.println(i);
			//Can't get the keys 
		}
		
		for(Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry);
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
	}
}
