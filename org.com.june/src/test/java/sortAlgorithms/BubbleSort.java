package sortAlgorithms;

import java.util.Arrays;

import org.testng.annotations.Test;

public class BubbleSort {

	@Test
	void test1() {
		int[] arr = {20, 35, -15, 7, 55, 1, -22};
		
		int size = arr.length;
		
		for(int j=arr.length;j>0;j--) {
			for(int i=0;i<size-1;i++) {
				if(arr[i] > arr[i+1]) {
					swap(arr, i, i+1);
				}
			}	
		}
		
		System.out.println(Arrays.toString(arr));
	}
	
	
	void swap(int[] arr, int i, int j) {
		if(i == j)
			return;
		else {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;	
		}
	}
}
