package dataStructure;

public class SinglyLinkedList {

	private EmployeeNode head;
	private EmployeeNode tail;
	
	
	//growing list from front
	public void addToFront(Employee employee) {
		EmployeeNode node = new EmployeeNode(employee);
		node.setNext(head);
		
		if(head == null) {
			tail = node;
		}else {
			node.setPrevious(node);
		}
		
		head = node;
	}
	
	
	//growing list from end
	public void addToEnd(Employee employee) {
		EmployeeNode node = new EmployeeNode(employee);
		
		if(tail == null) {
			head = node;
		}else {
			tail.setNext(node);
			node.setPrevious(tail);
		}
		tail = node;
	}
	
	
	public void print() {
		EmployeeNode current = head;
		
		while(current != null) {
			System.out.print(current);
			current = current.getNext();
			System.out.println();			
		}

	}
	
}
