
public class BasicOperators {
	public static void main(String[] args) {
		//Integer division 
		// Whole numbers are considers ints by default
		//So this results in 1 and then is upcast to 1.0
		double result = 3/2 ; 
		System.out.println(result);
		
		//Modulus 
		//gives the remainder of the devision operation
		result = 3 % 4; 
		result = 4 % 4;
		System.out.println(result);
		
		/*Can only compare compatible types
		System.out.println(result != true);
		*/
		System.out.println();
		System.out.println();
		System.out.println();

		System.out.println(result);
		//Post-fix operation
		System.out.println(result++);
		System.out.println(result);//Result is 1.0 
		System.out.println(result--);
		//Result is now 0.0 again 
		
		result +=3; //result = result + 3;
		//True for multiplication, subtraction etc. 
	}
}
