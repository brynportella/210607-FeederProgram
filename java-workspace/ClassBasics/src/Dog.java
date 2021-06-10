
public class Dog {
	 double size = 45.5;
	 String name = "Daisy"; 
	
	//access modifier optional specifier return-type name parameters
	public int bark() {
		System.out.println("Woof");
		return 5; 
	}
	
	//creating no- arg constructor
	//defining/declaring the no-arg constructor
	public Dog() {
		System.out.println("No-arg constructor ran");
	}
}
