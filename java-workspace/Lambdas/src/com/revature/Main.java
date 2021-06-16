package com.revature;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		SimpleInterface myJumper = new Jumper(); 
				
				
				/*(int x) -> {
			System.out.println("I am jumping "
					+ ""+x+" feet in the air.");
		};*/
		
		myJumper.jumpAround(5); 
		
		Tester myTester = (int input) -> {
			return (input > 100)? true: false;
		};
		
		boolean result = myTester.test(80); 
		
		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(1); 
		list.add(3); 
		list.add(5); 
		
		list.forEach((Integer i)->{
			System.out.println(i); 
		});
	}
}
