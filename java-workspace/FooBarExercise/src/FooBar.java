
public class FooBar {
	public static void main(String[] args) {
		fooBarPrint(100);
		System.out.println("Other approach");
		fooBarPrintNestedIf(100);
	}
	
	public static void fooBarPrint(int number) {
		for (int i = 1; i <= number; i++) {
			if((i % 3 == 0) && (i % 5 == 0)) {
				System.out.println("FooBar");
			}else if(i % 3 == 0) {
				System.out.println("Foo");
			}else if(i % 5 == 0) {
				System.out.println("Bar");
			}else {
				System.out.println(i);
			}
		}	
	}
	
	public static void fooBarPrintNestedIf(int number) {
		for (int i = 1; i <= number; i++) {
			if(i % 3 == 0) {
				System.out.print("Foo");
				if(i % 5 == 0)
					System.out.print("Bar\n");
				else
					System.out.print("\n");
			}else if(i % 5 == 0) {
				System.out.print("Bar");
				if(i % 3 == 0)
					System.out.print("Foo\n");
				else
					System.out.print("\n");
			}else {
				System.out.println(i);
			}
		}	
	}
}
