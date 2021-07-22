package searchAlgorithms;

import java.util.Arrays;

import org.testng.annotations.Test;

public class BinarySearch {
	
	@Test
	public void test1() {
		
		int[] arr = {1, 2, 4, 8, 50, 85, 90, 5, 56};
		
		System.out.println(Arrays.toString(arr));
		System.out.println();
		System.out.println(Arrays.toString(sortArray(arr)));
		System.out.println();
		System.out.println(binarySearch(arr, 5));
		
	}
	
	
	public int[] sortArray(int[] arr) {
		
		Arrays.parallelSort(arr);
		return arr;
		
	}
	
	public int binarySearch(int[] arr, int val) {
		
		int start = 0;
		int last = arr.length;
		
		while(start < last) {
			int mid = (start + last)/2;
			if(arr[mid] == val) {
				return mid;
			}else if(arr[mid] > val){
				last = mid;
			}else {
				start = mid+1;
			}
			
		}
		return -1;
		
	}

}
