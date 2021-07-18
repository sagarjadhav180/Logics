package dataStructure;

import org.testng.annotations.Test;

public class Main {

	@Test
	public void test() {
		
		Employee ab = new Employee("ab", "deviliers", 132);
		Employee jack = new Employee("jack", "kallis", 135);
		Employee ms = new Employee("ms", "dhoni", 1635);
		Employee virat = new Employee("virat", "kohli", 16535);
		
		SinglyLinkedList list = new SinglyLinkedList();
		
		list.addToFront(virat);
		list.addToFront(ab);
		list.addToFront(ms);
		list.addToFront(jack);
	
//		list.addToEnd(virat);
//		list.addToEnd(ab);
//		list.addToEnd(ms);
//		list.addToEnd(jack);		
		
		list.print();
	}
	
}

