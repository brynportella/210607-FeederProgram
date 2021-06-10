
public class ForLoops {
	public static void main(String[] args) {
		/*
		 * for (initialization statement; conditional; update){
		 *   instructions 
		 * }
		 */
		
		int x = 0; 
		
		for(;;) {
			x++;
			if(x == 2) {
			 continue; //Skip the rest of the loop and begin the next iteration. 
			}
			System.out.println(x);
			if(x>=5)
				break;//Break out of the inner loop-- in this case the only loop. 
		}
		
		String[] array = { "A", "B", "C"};
		
		for( int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
		//i = 3
		/*Output:
		 *  "A"
		 *  "B"
		 *  "C"
		 */
		
		//Enhanced For Loop
		//Get each item in the array
		//Store the current item in the variable 
		//element
		for(String element: array) {
			System.out.println(element);
		}
		
	}
}
