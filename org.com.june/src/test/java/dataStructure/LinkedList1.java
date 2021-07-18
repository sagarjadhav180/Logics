package dataStructure;


/*Data Structure
 * Implementation for doubly linked list */

public class LinkedList1 {
	
	
	private Node head;
	private Node tail;
	private int size;
	
	
	//list will grow from front side (head) 
	public void addFromFront(int data) {
		Node node = new Node(data);

		System.out.println("for current opration before addition head --> "+head);
		System.out.println("for current opration before addition tail --> "+tail);
		System.out.println("for current add operation node next --> "+node.getNext());
		System.out.println("for current add operation node prev --> "+node.getPrev());
		
		//setting tail of the list based on head of the lists
		if(head == null) {
			tail = node;
		}else {
			//setting next and prev for current node and head for the list
			node.setNext(head);
			head.setPrev(node);
		}
		head = node;
		size++;
		
		System.out.println("for next add operation node next --> "+node.getNext());
		System.out.println("for next add operation node prev --> "+node.getPrev());
		System.out.println("for current opration after addition head --> "+head);
		System.out.println("for current opration after addition tail --> "+tail);
		
	}
	
	//list will grow from end side (tail) 	
	public void addFromEnd(int data) {
        
		Node node = new Node(data);
		
		System.out.println("for current opration before addition head --> "+head);
		System.out.println("for current opration before addition tail --> "+tail);
		System.out.println("for current add operation node next --> "+node.getNext());
		System.out.println("for current add operation node prev --> "+node.getPrev());
		
		
		if(tail == null) {
			head = node;
		}else {
			tail.setNext(node);
			node.setPrev(tail);
		}
		tail = node;

		System.out.println("for next add operation node next --> "+node.getNext());
		System.out.println("for next add operation node prev --> "+node.getPrev());
		System.out.println("for current opration after addition head --> "+head);
		System.out.println("for current opration after addition tail --> "+tail);
		System.out.println("tail next "+tail.getNext());
		
		
	}
	
	
	public boolean addBefore(int newVal, int existingVal) {
		
		if(head == null) {
			return false;
		}
		
		//find node of the existing val
		Node current = head; 
		while(current != null && current.getData() != existingVal) {
			current = current.getNext();
		}
		
		if(current == null) {
			return false;
		}
		
		Node node = new Node(newVal);
		
		node.setPrev(current.getPrev());
		node.setNext(current);
		current.setPrev(node);
		
		if(head == current) {
			head = node;
		}else {
			node.getPrev().setNext(node);
		}
		
		size++;
		return true;	
	}
	
	public boolean addAfter(int newVal, int existingVal) {
		
		Node current = tail ;
		
		if(tail == null) {
			return false;
		}
		
		while(current != null && current.getData() != existingVal) {
			current = current.getPrev();
		}
		
		Node node = new Node(newVal);
		node.setNext(current.getNext());
		node.setPrev(current);
		current.setNext(node);
		
		if(tail == current) {
			tail = node;
		}else {
			node.getNext().setPrev(node);
		}
		return true;
	}
	
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
