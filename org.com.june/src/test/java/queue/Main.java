package queue;

import org.testng.annotations.Test;

import stacks.LinkedListStack;

public class Main {

	
//	@Test
	public static void test() {

		ArrayQueue queue = new ArrayQueue(5);
		
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		queue.enqueue(4);
		queue.enqueue(5);		
		
		queue.enqueue(6);		
		queue.enqueue(7);		

		System.out.println();
		queue.prinQueue();
		System.out.println();
		
		queue.dqueue();
		System.out.println();
		
		queue.prinQueue();
	
	}

	
	@Test
	public static void test2() {

		CircularQueue queue = new CircularQueue(5);
		
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		queue.enqueue(4);
		queue.enqueue(5);		
		

		queue.dqueue();
		queue.dqueue();
		queue.dqueue();

		System.out.println();
		queue.prinQueue();
		System.out.println();
		
		queue.enqueue(6);		
		
		
		
		System.out.println();
		queue.prinQueue();
		System.out.println();
		
	
	}
	
}
