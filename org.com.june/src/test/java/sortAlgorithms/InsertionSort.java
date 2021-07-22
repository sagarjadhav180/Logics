package sortAlgorithms;

import java.util.Arrays;

import org.testng.annotations.Test;

public class InsertionSort {

	@Test
	void test1() {
		int[] array = {20, 35, -15, 7, 55, 1, -22};
		
		int n = array.length;  
        for (int j = 1; j < n; j++) {  
            int key = array[j];  
            int i = j-1;  
            while ( (i > -1) && ( array [i] > key ) ) {  
                array [i+1] = array [i];  
                i--;  
            }  
            array[i+1] = key;  
        }  
		System.out.println(Arrays.toString(array));
	}
	
	
	
}
