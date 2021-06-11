
//Question 1
public class MyClass{
	public static void main(String[] args) {
		MyClass obj = new MyClass();
		obj.myMethod(); 
		
		MyClass.myStaticMethod();
		myStaticMethod();
		
		int number = 1; 
		while(number != 1) {
			System.out.println("A");
		}
		//Will run once
		do {
			System.out.println("A");
		}while(number != 1);
	}
	
    public void myMethod(){
         System.out.println("Hello");
    }
    
    public static void myStaticMethod(){
        System.out.println("Hello");
    }
}