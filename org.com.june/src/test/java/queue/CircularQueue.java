package queue;

import java.util.Arrays;

public class CircularQueue {
	int[] queueArr;
	private int size;
	int front;
	int back;
	int currentSize= 0;
	
	public CircularQueue(int size) {
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
			int _back = queueArr.length-front;
			int[] arr = new int[2 * queueArr.length];
//			arr = Arrays.copyOfRange(queueArr, 0, arr.length);
			
			System.arraycopy(queueArr, front, arr, 0, queueArr.length-front);
			System.arraycopy(queueArr, 0, arr, queueArr.length-front, back-1);
			

			queueArr = arr;
			size = queueArr.length;
			back = _back-1;
			front = 0;
			
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
