package com.revature.strings;

import java.util.Arrays;

public class UsingStrings {

	public static void main(String[] args) {
		String a = "a"; //string literal 
		String otherA = new String("a"); //object notation
		
		if(a == otherA)
			System.out.println("Equal.");
		else
			System.out.println("Not equal.");
		
		String b = "b";
		String otherB = "b";
		
		if (b == otherB)
			System.out.println("Equal.");
		else
			System.out.println("Not equal.");
		
		if(a.equals(otherA))
			System.out.println("Equal.");
		else
			System.out.println("Not equal.");
		
		char[] makeAnArray = "ABCDEFGHIJKLMNOPQRSTUV".toCharArray();
		
		System.out.println(Arrays.toString(makeAnArray));
		
		for(char c: makeAnArray) {
			System.out.println(c);
		}
		String greeting = "Hello"; 
		char characterVariable = "Hello".charAt(0); 
		
		String otherGreeting = "Hello"; 
		/*
		for(char c: "Hello") {
			System.out.println(c);
		}
		*/
		
		for(int i = 0; i < greeting.length(); i++ ) {
			char currentCharacter = greeting.charAt(i); 
			System.out.println(currentCharacter);
		}
	}
}
