package dataStructure;

import org.testng.annotations.Test;

public class Main1 {
	
	
//	@Test
	public void run() {
		LinkedList1 list = new LinkedList1();
		
		list.addFromFront(0);
		System.out.println("*****************************************************************************");
		list.addFromFront(1);
		System.out.println("*****************************************************************************");
		list.addFromFront(5);
		System.out.println("*****************************************************************************");
		list.addFromFront(8);
		System.out.println("*****************************************************************************");
		list.addFromFront(6);

		//To add 7 after 5		
		list.addAfter(7, 5);
		
		//To add 7 before 5
		list.addBefore(7, 5);
		
//		list.addFromEnd(0);
//		System.out.println("*****************************************************************************");
//		list.addFromEnd(1);
//		System.out.println("*****************************************************************************");
//		list.addFromEnd(5);
//		System.out.println("*****************************************************************************");
//		list.addFromEnd(8);
//		System.out.println("*****************************************************************************");

		System.out.println("--------before----------");
		list.print();
		System.out.println("------------------");
		
//		Node node = new Node(0);
		list.remove();
	
		System.out.println("--------after----------");
		list.print();
		System.out.println("------------------");
		
	}
	

	@Test
	public void run1() {
		LinkedList2 list = new LinkedList2();
		
		list.addFromFront(0);
		System.out.println("*****************************************************************************");
		list.addFromFront(1);
		System.out.println("*****************************************************************************");
		list.addFromFront(5);
		System.out.println("*****************************************************************************");
		list.addFromFront(8);
		System.out.println("*****************************************************************************");
		list.addFromFront(6);

		System.out.println(list.getNode(50));
		
		list.print();
		

		
	}
	
}
