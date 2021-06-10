
import java.util.Arrays; 

public class UsingArray {
	public static void main(String args []) {
		
		//Array of char 
		//How do I define my variable?
		//Here we have defined and initialized our array of char
		char prepopArray [] = {'a', 'b'}; 
		
		System.out.println(prepopArray.length);
		
		System.out.println(prepopArray[0]);
		
		//Print out the last item in the array. 
		//without just saying prepopArray[1]
		//Maybe I don't know the size. 
		int indexOfLastItem = prepopArray.length - 1; 
		char charElement = prepopArray[indexOfLastItem]; 
		System.out.println(charElement);
		
		//Store 'z' in the first position of prepopArray
		prepopArray[0] = 'z'; 
		
		
		//Array of Strings of size 4
		//call our array variable- array 
		String[] array = new String[4]; 
		
		System.out.println(array[0]);//when our array stores objects we get null
		
		//int x; 
		//System.out.println(x);
		//Print an array using the Arrays class 
		System.out.println(Arrays.toString(array));
		
	}
}
