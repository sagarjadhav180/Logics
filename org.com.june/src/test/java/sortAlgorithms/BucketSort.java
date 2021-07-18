package sortAlgorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.testng.annotations.Test;

public class BucketSort {

	
//	@Test
	public void test() {
		int[] arr = {10,21,32,85,89,95,45,49,8,5,22};
		
		int[] output = bucketSort(arr);
		
		System.out.println(Arrays.toString(output));
		
	}
	
	public int[] bucketSort(int[] input) {
		
		List<Integer> buckets[] = new List[10];
		
		for(int i = 0;i < buckets.length; i++) {
			buckets[i] = new ArrayList<Integer>();
		}
		
		for(int i=0;i<input.length;i++) {
			buckets[hash(input[i])].add(input[i]);
		}
		
		for(List<Integer> bucket:buckets) {
			Collections.sort(bucket);
		}
		
		int j = 0;
		for(int i=0;i<buckets.length;i++) {
			List<Integer> bucket = buckets[i];
			for(int k=0;k<bucket.size();k++) {
				input[j] = bucket.get(k);
				j++;
			}	
		}
		return input;
	} 
	
	
	public int hash(int value) {
		return value / 10;
	}
	
	
	@Test
	public void test2() {
		int[] nums = new int[10];
		
		int[] arr = {59382, 43, 6894, 500, 99, -58};
		
		for(int i=0;i<arr.length;i++) {
			nums[hash1(arr[i])] = arr[i]; 
		}
		
		System.out.println(Arrays.toString(nums));
		
	}
	
	
	public int hash1(int value) {
		
		return Math.abs(value % 10);
	}
}
