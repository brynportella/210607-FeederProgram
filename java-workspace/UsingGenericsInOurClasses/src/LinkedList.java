
public class LinkedList<T>{

	 Node<T> head; 
	 
	 //add
	 public void add(T data) {
		 Node<T>  newNode = new Node<T>(data); 
		 
		 add(newNode); 
	 }
	 
	 public void add(Node<T> node) {
		 if(head == null) {
			 head = node; 
			 return; 
		 }
		 Node<T> runner = head; 
		 while(runner.getNext() != null) {
			 runner = runner.getNext(); 
		 }
		 runner.setNext(node); 
	 }
	 //remove
	 
	 public Node<T> remove(){
		 Node<T> removedNode = head; 
		 if(head != null) {
			 head = head.getNext(); 
			 removedNode.setNext(null); 
		 }
		
		 return removedNode; 
	 }
	 //toString 
	 
	 public String toString() {
		 String s = ""; 
		 Node<T> runner = head; 
		 while(runner != null) {
			 s += runner.toString()+" --> "; 
			 runner = runner.getNext();
		 }
		 s+= "null"; 
		 return s; 
	 }
}
