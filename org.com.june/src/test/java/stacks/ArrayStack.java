package stacks;

import java.util.Arrays;
import java.util.EmptyStackException;

public class ArrayStack {
	
	private int top;
	private int[] stack;
	private int size;
	
	
	public ArrayStack(int size) {
		this.stack = new int[size];
		this.size = size;
		this.top = -1;
	}
	
	public boolean isEmpty() {
		if(top == -1)
			return true;
		else
			return false;
	}
	
	
	public boolean isFull() {
		if(top == size-1)
			return true;
		else
			return false;
	}
	
	public void push(int data) {
		
		if(isFull() == false) {
			top++;
			stack[top] = data;
			System.out.println("pushed element is "+data);
		}else {
			int[] newArr = new int[2 * stack.length];
			newArr = Arrays.copyOfRange(stack, 0, newArr.length);
			stack = newArr;
			top++;
			stack[top] = data;
			System.out.println("pushed element is "+data);
		}

	}
	
	public int pop() {
		
		if(isEmpty() == false) {
			System.out.println("popped element "+stack[top]);
			top--;
			return stack[top];
		}else {
			System.out.println("stack is empty");
			return -1;

		}
	}
	
	public int peek() {
		
		if(isEmpty() == false) {
			return stack[top];
		}else {
			System.out.println("stack is empy");
			return -1;
		}
		
	}
	
	public void printStack() {
		for(int i=top;i>=0;i--) {
			System.out.print(stack[i]+" ");
		}
		System.out.println();
		
	}
	
			

}
