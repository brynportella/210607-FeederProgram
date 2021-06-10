
public class Question7 {
	public static void main(String[] args) {
		// 1 is not evenly divisible by 2 
		// 1 % 2 will not result in 0
		// Thus the flag will be false. 
		boolean flag = ((1 % 2) == 0);

		if (flag) {
			System.out.println("A");
		} else {
			System.out.println("B"); //This will print to the console.
		}
	}
}
