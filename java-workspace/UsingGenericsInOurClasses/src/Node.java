
public class Node<T> {

	T data; 
	
	Node<T> next; 
	
	public Node(){
		
	}
	
	public Node(T data) {
		this.data = data; 
	}
	
	public void setData(T data) {
		this.data = data; 
	}
	
	public T getData() {
		return data; 
	}

	public Node<T> getNext() {
		return next;
	}

	public void setNext(Node<T> next) {
		this.next = next;
	}

	@Override
	public String toString() {
		return "Node [data=" + data + "]";
	}
	
	
	
}
