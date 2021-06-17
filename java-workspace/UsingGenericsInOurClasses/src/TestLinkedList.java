
public class TestLinkedList {
	public static void main(String[] args) {
		LinkedList<String> greetings = new LinkedList<>();
		
		greetings.add("Hey");
		greetings.add("Hi");
		greetings.add("Hello");
		greetings.add("Hiya");
		
		System.out.println(greetings);
		
		Node<String> removedItem = greetings.remove(); 
		//Store value in variable -- greetMessage
		//using getValue method
		//Invo
		String greetMessage = NodeHelper.<Integer>getValue(removedItem); 
		System.out.println(greetMessage);
	}
}
