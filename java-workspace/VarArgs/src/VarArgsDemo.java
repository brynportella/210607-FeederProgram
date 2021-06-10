
public class VarArgsDemo {
	public static void main(String[] args) {
		System.out.println(" Next invocation");

		variableArgsExample(1,2,3);
		System.out.println(" Next invocation");

		variableArgsExample(1);
		System.out.println(" Next invocation");

		variableArgsExample(1,4,7,8,9);
	}
	
	public static void variableArgsExample(int ... val ) {
		for(int element : val) {
			System.out.println(element);
		}
	}
}
