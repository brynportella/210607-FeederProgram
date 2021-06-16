package com.revature;

public class CrashProgram {
	
	public static void main(String[] args) {
		try {
			//We can have this divide by zero to get an arithmetic exception. 
			int result = 8/2;
		}finally {
			System.out.println("Clean up!!");
		}
		//If the program is interrupted this will not run 
		System.out.println("End of main!!");
	}
}
