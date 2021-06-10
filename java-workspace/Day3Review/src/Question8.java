
public class Question8 {
	public static void main(String[] args) {
		
		int x = 10; 
		
		if ( x % 2 == 0 ) { 
		    System.out.println("A"); //This will print to the console. 
		} else if (x % 5 == 0) {
		    System.out.println("B"); 
		}
		
		//x is evenly divisible by both 2 and 5 
		//however when we have an else if statement 
		//only the if or the else if will run 
		//NOT both
	}
}
