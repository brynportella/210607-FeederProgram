package com.revature;

import javax.print.PrintException;

public class HandlingExceptions {
	
	//Adding the throws declaration to our method
	//Is called "ducking" 
	//It's essentially a form of handling the exception.
	public void throwException() throws Exception {
		/*
		 * This is a checked Exception
		 * --any Exception that is not a child of 
		 * RuntimeException. 
		 * 
		 */
		throw new Exception("Example message to be added to exception"); 
	}
	
	
	//How can I fix this compilation error? 
	public void indirectlyThrowException() throws Exception {
		throwException(); 
	}
	
	public static void main(String[] args) {// -can do this- don't typically wanna throws Exception {
		//How do I invoke indirectlyThrowException?? 
		HandlingExceptions he = new HandlingExceptions();
		try {
			he.indirectlyThrowException();
			//can have multiple catch blocks 
			//must put specific version first!!
			
		}catch(PrintException e) {
			
		}catch(Exception ex) {
			System.out.println("Uh oh");
			ex.printStackTrace();
		}finally {
			//essentially always runs
			//regardless of an exception being caught 
			//clean up resources
			System.out.println("Clean up!!");
		}
		
		System.out.println("Fun Message -- interesting fact");
	}

}
