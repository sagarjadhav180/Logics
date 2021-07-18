package dataStructure;

public class Node {

	private int data;
	private Node prev;  //---when used for doubly linked list
	private Node next;
	

	public void setData(int data) {
		this.data = data;
	}
	
	
	public Node(int data) {
		this.data = data;
	}
	
	
	public Node getPrev() {
		return prev;
	}

	public void setPrev(Node prev) {
		this.prev = prev;
	}
	
	public int getData() {
		return data;
	}

	@Override
	public String toString() {
		return "data -> "+data;
	}


	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}
	
}
