package stacks;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListStack {

	
	private int top;
	private LinkedList stack;
	private int size;
	
	
	public LinkedListStack() {
		stack = new LinkedList();
	}
	
	public void push(Object data) {
		stack.push(data);
	}
	
	public Object pop() {
		return stack.pop();
		
	}
	
	public Object peek() {
		return stack.peek();
		
	}
	
	public boolean isEmpty() {
		return false;
		
	}
	
	public void printStack() {
		Iterator<Integer> itr = stack.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
	
}
