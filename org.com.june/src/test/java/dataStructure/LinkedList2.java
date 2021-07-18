package dataStructure;


/*Data Structure
 * Implementation for singly linked list */

public class LinkedList2 {

	private Node head;
	
	
	//list will grow from front side (head) 
	public void addFromFront(int data) {
		Node node = new Node(data);

		System.out.println("for current opration before addition head --> "+head);
		System.out.println("for current add operation node next --> "+node.getNext());
		
		//setting tail of the list 
		node.setNext(head);
		
		head = node;
		
		System.out.println("for next add operation node next --> "+node.getNext());
		System.out.println("for current opration after addition head --> "+head);
		
	}
	
	//list will grow from end side (tail) 	
	/*
	 * public void addFromEnd(int data) {
	 * 
	 * Node current = head;
	 * 
	 * System.out.println("for current opration before addition head --> "+head);
	 * 
	 * while(current != null) { current = current.getNext(); }
	 * 
	 * Node node = new Node(data); current.setNext(node);
	 * 
	 * System.out.println("for current opration after addition head --> "+head);
	 * 
	 * }
	 */

	public void print() {
		Node current = head;
		
		while(current != null) {
			System.out.print(current+ " ");
			current = current.getNext();
			System.out.println();
		}
		
		System.out.println("null");  
	}

	public Node remove() {
//		Node temp = head;
		while(head != null) {
			head = head.getNext();			
		}
		return head;
	}
}
