
public class Dog {
	
	//instance variables
	//size is a primitive instance variable
	 double size = 45.5;
	 //name is a reference instance variable 
	 String name = "Daisy"; 
	
	//access modifier optional specifier return-type name parameters
	//instance method
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
