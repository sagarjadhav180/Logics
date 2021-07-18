package queue;

import java.util.Arrays;

public class ArrayQueue {

	int[] queueArr;
	private int size;
	int front;
	int back;
	int currentSize= 0;
	
	public ArrayQueue(int size) {
		this.size = size;
		front = 0;
		back = -1;
		queueArr = new int[this.size];
	}
	
	
	public boolean isFull() {
		if(currentSize == size) 
			return true;
		else
			return false;
	}
	
	public boolean isEmpty() {
		if(currentSize == 0) 
			return true;
		else
			return false;
	}
	
	public void enqueue(int data) {
		
		if(isFull() == true) {
			int[] arr = new int[2 * queueArr.length];
			arr = Arrays.copyOfRange(queueArr, 0, arr.length);
			queueArr = arr;
			size = queueArr.length;
			
		}
		
			back++;
			queueArr[back] = data;
			currentSize++;
		
	}
	
    public void dqueue() {
    	
    	if(isEmpty() == true) {
    		System.out.println("queue is empty");
    	}else {
    		System.out.println(queueArr[front]+" removed from the queue");
    		queueArr[front] = 0;
    		front++;
    	}
//    	currentSize--;
	}
	
    public void prinQueue() {
    	for(int i=front; i<=back;i++) {
    		System.out.print(queueArr[i]+" ");
    	}
    	System.out.println();
    }
    
}
