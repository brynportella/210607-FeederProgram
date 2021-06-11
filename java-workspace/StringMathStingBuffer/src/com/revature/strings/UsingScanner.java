package com.revature.strings;

//CTL + Shift+ O - organize imports 
import java.util.Scanner;

public class UsingScanner {
	static Scanner myScanner = new Scanner(System.in);
	
	
	public static void main(String[] args) {
	
		
		System.out.println("Give me your name");
		//next() reads in just a word 
		//nextLine() reads in the whole line
		String name = myScanner.nextLine();
		//nextInt()
		//nextDouble()
		//hasNext()
		//hasNextInt()
		//hasNextDouble(); 	
		System.out.println(name);
        System.out.println("Give me your graduation year");
		//next() reads in just a word 
		//nextLine() reads in the whole line
		int gradYear = myScanner.nextInt();
		//nextInt()
		//nextDouble()
		//hasNext()
		//hasNextInt()
		//hasNextDouble(); 
		System.out.println(gradYear);
		myScanner.close();
	}

}
