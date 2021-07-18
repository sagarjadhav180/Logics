package sortAlgorithms;

import java.util.Arrays;

import org.testng.annotations.Test;

public class SelectionSort {
	@Test
	void test1() {
		int[] arr = {20, 35, -15, 7, 55, 1, -22};
		
        int size = arr.length;
		
		for(int j=arr.length-1;j>0;j--) {
		
			int largest = 0;
			for(int i=1;i<=j;i++) {			
				if(arr[i] > arr[largest]) {
					largest = i;
				}
			}	
			swap(arr, j, largest);
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
