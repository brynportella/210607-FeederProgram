
public class OurMath {
	public static void main(String[] args) {
		OurMath myMathDoer = new OurMath();
		int result = myMathDoer.sum(1, 2); 
		System.out.println(result);
		//Assign result difference of 5 and 6 
		//Using our subtraction method
		result = myMathDoer.subtraction(5,6); 
		
		int input = 5; 
		//We could also access the static method
		//directly by the name addTwo
		result = OurMath.addTwo(input); 
		System.out.println(result);//This is line 13
		System.out.println(input);//This is line 14 
		
		
		int otherResult = addTwo(90); 
	}
		
	//instance method 
	//Sum 
	public int sum (int a, int b) {
		 //a = 1;
		 //b = 2; 
		int result = a + b;
		return result; 
	}
	//instance method 
	//Subtraction
	public int subtraction(int c, int d) { 
		return c-d; 
	}
	
	public static int addTwo(int a ) {
		a += 2; //a = a+2; 
		return a; 
	}
	
	
	
	
}
