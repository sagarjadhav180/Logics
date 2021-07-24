package sortAlgorithms;

import java.util.Arrays;

import org.testng.annotations.Test;

public class InsertionSort {

	@Test
	void test1() {
		int[] array = {20, 35, -15, 7, 55, 1, -22};
		
		
		
        int key, value;
		
		for(int i=1; i < array.length; i++) {
			
			key = i;
			value = array[i];
			
			while(key > 0 && value < array[key - 1]) {
				
				array[key] = array[key - 1];
				key--;
				
			}
			
			array[key] = value;
			
		}
		
		
		System.out.println(Arrays.toString(array));
	}
	
	@Test
	void test2() {

	}
	
}
