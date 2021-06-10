
public class UsingIfStatements { 
	public static void main(String[] args) {
		
		// || - is short circuit or 
		// | - is just or 
		boolean flag = (5 <= 6) | (4 > 7); 
		
		//Check if the flag is false
		if(!flag) {
			//If it is do this thing
			System.out.println("A");
		}
		
		int x = 4; 
		if(x % 2 == 0) {
			System.out.println("A: Even.");
			if (x % 5 == 0) {
				System.out.println("B: Multiple of five.");
			}
		}else{
			System.out.println("C: Not even.");
		}
		
		
		//Ternary operator
		//(boolean expression)? returned if true: returned if false
		System.out.println((x == 4)? "It's true": false);
		
		String exampleValueForSwitch = "A"; 
		
		switch(exampleValueForSwitch) {
		case "A":
			System.out.println("A");
			break; 
		case "B": 
			System.out.println("B");
		default: 
			System.out.println("Default");
		}
		//break will cause it come out of the switch and resume here 
	}
}
