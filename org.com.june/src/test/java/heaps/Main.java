package heaps;

import org.testng.annotations.Test;

public class Main {
	
	@Test
	public void test1() {
		Heap heap = new Heap(10);
		
		heap.insert(80);
		heap.insert(75);
		heap.insert(60);
		heap.insert(68);
		heap.insert(55);
		heap.insert(40);
		heap.insert(52);
		heap.insert(67);
		
		heap.printHeap();

//		System.out.println();
        
//		System.out.println(heap.peek());
		
		System.out.println();
		
//		heap.delete(0);
		
//		System.out.println();
		
		heap.sort();
		System.out.println();
		heap.printHeap();
		
	}

}
