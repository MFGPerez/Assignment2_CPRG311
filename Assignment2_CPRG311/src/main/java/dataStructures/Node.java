package dataStructures;

/**
 * Class description: 
 *
 * @author Marcel Gallardo (000827700)
 *
 * 
 */
public class Node {

	private Object value; 
	private Node next;
	private Node prev; 
	
	
	public Node(int value ) {
		
		this.value = value; 
		this.next = null; 
	}
	
	public Node( Node next , Object value , Node prev) {
		
		this.value = value; 
		this.next = next; 
		this.prev = prev; 
	}



	public Object getValue() {
		return value;
	}


	public void setValue(Object value) {
		this.value = value;
	}


	public Node getNext() {
		return next;
	}


	public void setNext(Node next) {
		this.next = next;
	}
}
