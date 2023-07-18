package sortAlgorithms;

import java.util.Arrays;

import org.testng.annotations.Test;

public class QuickSort {

	
	void swap(int[] arr,int a, int b) {
		
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
		
	}
	
	int partition(int[] arr, int start, int end) {
		
		int pivot = arr[end];
		int partitionIndex = start - 1;
		
		for(int i = start; i < end; i++) {
			
			if(arr[i] < pivot) {
				partitionIndex++;
				if(partitionIndex != i)
					swap(arr, partitionIndex, i);
				else
					continue;
			}
			
		}
		System.out.println(partitionIndex);
		swap(arr, partitionIndex + 1, end);
		System.out.println(partitionIndex);		
		
		System.out.println("array after first sort --> "+Arrays.toString(arr));
		return partitionIndex+1;
		
	}
	
	void quickSort(int[] arr, int start, int end) {
		
		if(start < end) {
			//partition index of an array
			int pi = partition(arr, start, end);
			
			System.out.println("pi -> "+pi);
			//left side array
			quickSort(arr, start, pi - 1);
			//right side array
			quickSort(arr, pi+1, end);
		}
	}
	
	@Test
	void main() {
		
		int[] arr = {10, 7, 8, 9, 1, 5};
		
		System.out.println("Before sorting --> ");
		System.out.println(Arrays.toString(arr));
		
		quickSort(arr, 0, arr.length-1);
		
		System.out.println("Aftr sorting --> ");
		System.out.println(Arrays.toString(arr));		
		
	}
	
}

