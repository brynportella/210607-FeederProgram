
public class UsingPrimitives {
	public static void main(String[] args) {
		//Declaring or defining our variable
		//This creates a variable
		//32 -bit whole number
		int myFirstWholeNumber; 
		
		//Initialize 
		myFirstWholeNumber = 1;
		
		// A char can be defined with single quotes
		char myFirstChar = 'a'; 
		
		//A char can also hold a whole number because it is 
		//storing its characters based on their ASCII encoding
		myFirstChar = 75+5;
		System.out.println(myFirstChar);
		
		
		//64 bit signed whole number 
		//suffixed with L or lower case l
		long myFirstLong = 23L;
		
		//16- bit signed whole number
		short myShort = 5; 
		
		//8- bit signed whole number
		byte myByte = 2; 
		
		//boolean -- true or false
		boolean myBoolean = true; //false
		
		//Float suffixed with an f 
		//32 bit decimal number
		float myFloat = 12.3f;
		
		//Double is the default for a decimal number
		double myDouble = 5.6; 
		
		/*
		Can't cast from a boolean to an int---
		int myNewBooleanInteger = (int) myBoolean; 
		*/
		
		System.out.println(myByte);
	}
}
