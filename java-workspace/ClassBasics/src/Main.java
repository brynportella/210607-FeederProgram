
public class Main {
	//Making this an executable class 
	public static void main(String[] args) {
		Dog myDog; 
		
		//Calling our constructor
		//invoking our constructor 
		//running our constructor 
		//executing our constructor
		myDog = new Dog(); 
		//=> creating an object!! In this case a Dog obhect 
		System.out.println(myDog.name);
		System.out.println(myDog.size);
		
		myDog.name = "Ruby";
		//Call bark on myDog
		System.out.println(myDog.bark());
		
		System.out.println(myDog.name);
		
		Dog myOtherDog = new Dog();
		System.out.println(myOtherDog.name);
	}
}
