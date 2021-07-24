package dataStructure;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

import org.testng.annotations.Test;
import org.yaml.snakeyaml.Yaml;

public class temp {

	
	//Write a java code to move all even at left and odd at right using collection
//	@Test
	public void test1() {
		int[] arr = {1,5,4,7,9,8,2};
		
		List even = new ArrayList();
		List odd = new ArrayList();
		List all = new ArrayList();
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i] % 2 == 0) {
				even.add(arr[i]);
			}else {
				odd.add(arr[i]);
			}
		}
		all.addAll(even);
		all.addAll(odd);
		System.out.println(Arrays.toString(all.toArray()));
	}
	
	
//	@Test
	public void test2() {
		int[] arr = {1,5,4,7,9,8,2};
		
		for(int i=0;i<arr.length;i++) {
			int left = 0;
			int right = arr.length-1;
			
			while(arr[left] % 2 == 0) {
				left++;
			}
			while(arr[right] % 2 != 0) {
				right--;;
			}
			
			if(left<right) {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
			}
				
		}
		System.out.println(Arrays.toString(arr));	
	}
	
	
	//print Duplicate Element in an Array
//	@Test
	public void test3() {
		int[] arr = {1, 2, 3, 4, 2, 7, 8, 8};
		
		Set set = new HashSet();
		
		for(int i=0;i<arr.length;i++) {
			
		   int count = 0;	
			
			for(int j=0;j<arr.length;j++) {
				if(arr[i] == arr[j])
					count++;
			}
			if(count>1) {
				set.add(arr[i]);
			}

		}
	
		set.forEach(temp -> System.out.print(temp+" "));
		
		System.out.println();
	}
	

	//Remove Duplicate Element in an Array
//	@Test
	public void test4() {
		int[] arr = {1, 2, 3, 4, 2, 7, 8, 8};
		
		for(int i=0;i<arr.length;i++) {
			
		   int count = 0;	
			
			for(int j=0;j<arr.length;j++) {
				if(arr[i] == arr[j])
					count++;
			}
			if(count>1) {
				arr[i] = 0;
			}

		}

		for(int i=0;i<arr.length;i++) {
			if(arr[i] != 0)
				System.out.println(arr[i]);
		}
		
		System.out.println();
	}
	
	
	//ascending order
//    @Test
	public int[] test5(int[] arr) {
    		
    	for(int i=0;i<arr.length;i++) {
    		
    		for(int j=i+1;j<arr.length;j++) {
    			if(arr[i] > arr[j]) {
    				int temp = arr[i];
    			    arr[i] = arr[j];
    			    arr[j] = temp;
    			}
    		}
    	}
		System.out.println(Arrays.toString(arr));
		return arr;
	}
	
  //descending order
//    @Test
	public int[] test6(int[] arr) {
    	
    	for(int i=0;i<arr.length;i++) {
    		
    		for(int j=i+1;j<arr.length;j++) {
    			if(arr[i] < arr[j]) {
    				int temp = arr[i];
    			    arr[i] = arr[j];
    			    arr[j] = temp;
    			}
    		}
    	}
		System.out.println(Arrays.toString(arr));
		return arr;
	}
	
	
	//Find 2nd smallest Number in an Array
//	@Test
	public void test7() {
		int[] arr = {10, 2, 8, 4, 5, 6, 7};
		
		test6(arr);
		
		System.out.println(arr[arr.length - 2]);
		
	}
	
	
	//Find 3rd largest Number in an Array
//	@Test
	public void test8() {
		int[] arr = {10, 2, 8, 4, 5, 6, 7};
		
		test5(arr);
		
		System.out.println(arr[arr.length - 3]);
		
	}
	
	//Java program to print the smallest element in an array without inbuilt function
//	@Test
	public void test9() {
		int[] arr = {10, 2, 8, 4, 5, 6, 7};
		
		int min = arr[arr.length-1];
		
		for(int i=0;i<arr.length;i++) {
			
			if(min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.println("min -> "+min);
	}
	
	
	//Program to left rotate the elements of an array
//	@Test
	public void test10() {
		int[] arr = {1 ,   2,   3,   4,   5,   6};
		
		for(int i=0;i<arr.length-1;i++) {
		int temp1 = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp1;		
		}
		
		System.out.println(Arrays.toString(arr));	
	}
	
	//Java Program to find the frequency of each element in the array
//	@Test
	public void test11() {
		int[] arr = {1 ,   2,   8,  3,   2,   2,   2,   5,   1};
		
		int[] arr1 = new int[arr.length];
		
		for(int i=0;i<arr.length;i++) {
			int count = 0;
			for(int j=arr.length-1;j>=0;j--) {
				if(arr[i] == arr[j]) {
					count++;
					arr1[j] = -1;
				}
			
			}
			arr1[i] = count;
		}
		
		for(int k=0;k<arr.length;k++) {
			if(arr1[k] != -1)
				System.out.println("frequency of "+arr[k]+" --> "+arr1[k]);			

		}
		
	}
	
	
	
//	@Test
	void test12() {
		String str = "Hello World";
		
		StringBuilder stb = new StringBuilder(str);
//		stb.append(str);
		
		stb = stb.reverse();
		
		System.out.println(stb);
		
	}
	
	
//	@Test
	void test13() {
		String str = "Hello World";
		
		char[] arr = str.toCharArray();
		
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]);
		}
		System.out.println();
		
		
	}
	
	
//	@Test
	void test14() {
		String str = "Hello World";	
		
		char[] arr = str.replaceAll("\\s", "").toCharArray();
		
		Map map = new HashMap();
		
		for(int i=0;i<arr.length;i++) {
			map.put(i, arr[i]);
		}
		
		System.out.println("elements --> "+map.size());
	}
	
	
//	@Test
	void test15() {
		Map<Integer,String> map = new HashMap<Integer,String>();
		
		map.put(1, "india");
		map.put(2, "us");
		map.put(3, "aus");
		map.put(4, "uk");
		map.put(5, null);
		
		//classic
		for(Entry<Integer, String> set:map.entrySet()) {
			System.out.println(set.getValue());
		}
		
		//iterator
		Set<Entry<Integer, String>> set = map.entrySet();
		
		Iterator<Entry<Integer, String>> itr = set.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}	
		
	}
	
	
//	@Test
	void test16() {
		
		for(int i=1;i<=100;i++) {
			int counter = 0;
			
			for(int j=i;j>1;j--) {
				if(i % j == 0) {
					counter++;
				}
			}
			if(counter == 1)
				System.out.println(i + " is prime");
		}
		
	}
	
	
//	@Test
	void test17() {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("please enter here --");
		
		String str = scanner.next();
		
		StringBuilder stb = new StringBuilder(str);
		
		stb = stb.reverse();
		
		System.out.println(str.equals(stb.toString())  );
		
	}
	
	
//	@Test
	void test18() {
		int a = 0;
		int b = 0;
		int c = 1;
		
		for(int i=0;i<10;i++) {
			a = b;
			b = c;
			c = a+b;
			System.out.println(c);
		}
	}
	
	
//	@Test
	void test19() {
		List<String> list = new ArrayList<>(Arrays.asList("india", "UK", "USA"));
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		System.out.println();
		
		
		ListIterator<String> itr = list.listIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println();
		for(String one:list) {
			System.out.println(one);
		}
		System.out.println();
		
		list.forEach(one -> System.out.println(one));
			
	}
	
//	@Test
	void test20() {
		String str = "Hello World ";
		  	
		char[] arr = str.toCharArray();  
		
		List list = new ArrayList();
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i] != ' ')
				list.add(arr[i]);
		}
		System.out.println(Arrays.toString(list.toArray()));
	}
	
	
//	@Test
	void test21() {
		Object[] num = new Object[100];
		Arrays.fill(num, new Object() {
			int count = 0;
			public String toString() {
				count++;
				return Integer.toString(count);
			}
		});
		
		System.out.println(Arrays.toString(num));
	}
	
	
//	@Test
	void test22() throws IOException {
		  Yaml yaml= new Yaml();
	        
	        Map<String, Object> map1 = new HashMap<String, Object>();
	        
	        InputStream inputstream = new FileInputStream(new File(System.getProperty("user.dir")+File.separator+"config.yaml"));
	    	
	    	map1 = yaml.load(inputstream);
	    	
	    	Map<String,Object>  convirza = (Map<String,Object>) map1.get("convirza");
	        
	    	Map<String,Object>  blacklisted_number = (Map<String,Object>)convirza.get("blacklisted_number");
	    	
	    	Map<String,Object> number = (Map<String,Object>)blacklisted_number.get("agency");
	    	
	    	
	    	number.put("number", "1234567891");
	        
	    	Map<String,Object>  updated_yaml = new HashMap<String, Object>(); 	
	    	
	    	updated_yaml.put("convirza", convirza);
	    	
	        String data = yaml.dump(convirza);
	        
//	    	OutputStream outputstream = new FileOutputStream(new File(System.getProperty("user.dir")+File.separator+"config.yaml"));
	    	FileWriter writer = new FileWriter(new File(System.getProperty("user.dir")+File.separator+"config.yaml")); 
	    	writer.write(data);
	    	writer .close();
	}
	
	
	//binary search
//	@Test
	void test23() {
		int[] arr = {1, 2, 4, 8, 50, 85, 90, 5, 56};
		
		Arrays.sort(arr);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter here -->");
		int val = sc.nextInt();
		
		int first = 0;
		int last = arr.length-1;
		
		
		for(int i=0;i<arr.length;i++) {
			int mid = (first + last) / 2;
			if(arr[mid] == val) {
				System.out.println("index of " + val + " is " + mid);
				break;
			}else {
				
				if(val < arr[mid]) {
					last = mid;
				}else {
					first = mid+1;
				}
				
			}
		}
		
	}
	
	//bubble sort
//	@Test
	void test24() {
		int[] arr = {20, 35, -15, 7, 55, 1, -22};
		
		for(int i=0;i<arr.length;i++) {
			
			for(int j=0;j<arr.length-1;j++) {
			
				if(arr[j] > arr[j+1]) {
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
				
			}
			
		}
		System.out.println(Arrays.toString(arr));
		
	}
	
	
	
//	@Test
	void test25() {
	
		int[] arr = {10,21,32,85,89,95,45,49,8,5,22};
		
		List<Integer> list[] = new List[10];
		
		for(int i=0;i<list.length;i++) {
			list[i] = new ArrayList();
		}
		
		
		for(int i=0;i<arr.length;i++) {
			
			list[hash(arr[i])].add(arr[i]);
		}
		
		for(List<Integer> one:list) {
			Collections.sort(one);
		}
		
		
		int i = 0;
		for(int j=0;j<list.length;j++) {
			List<Integer> one = list[j];
			for(int k=0;k<one.size();k++) {
				arr[i] = one.get(k);
				i++;
			}
			
		}
		System.out.println(Arrays.toString(arr));
	}
	
	
	int hash(int val) {
		return val / 10;
		
	}
	
	
	//selection sort
//	@Test
	void test26() {
		int[] arr = {20, 35, -15, 7, 55, 1, -22};
		
		for(int i=arr.length-1;i>0;i--) {
			
			int largest = 0;
			for(int j=1;j<=i;j++) {
				if(arr[j] > arr[largest]) {
					largest = j;
				}
			}
			int temp = arr[largest];
			arr[largest] = arr[i];
			arr[i] = temp;
		}
		System.out.println(Arrays.toString(arr));
	}
	
	
	
//	@Test
	void test27() {
		int[] arr1 = { 1, 12, 14, 17, 23 };
		int[] arr2 = { 11, 19, 27 };
		
		int n1 = arr1.length;
		int n2 = arr2.length;
		
		
		int[] arr3 = new int[arr1.length+arr2.length];
		
		
		int i = 0, j = 0, k = 0;
		
		while(i < n1 && j < n2) {
			if(arr1[i] < arr2[j]) {
				arr3[k] = arr1[i];
				i++;
			}else {
				arr3[k] = arr2[j];
				j++;
			}
			k++;
		}
		
		while(i < n1) {
			arr3[k] = arr1[i];
			k++;
			i++;
		}
		while(j < n2) {
			arr3[k] = arr2[j];
			k++;
			j++;
		}
		
		System.out.print(Arrays.toString(arr3));
		
		System.out.println();
	}
	
	
//	@Test
	void test28() {
		
		int[] array = {20, 35, -15, 7, 55, 1, -22};
		
		
		for(int i=1;i<array.length;i++) {
			
			int key = i;
			int val = array[i];
			
			while(key > 0 && array[key-1] > val) {
				array[key] = array[key - 1];
				key--;
			}
			array[key] = val;
			
		}
		System.out.println(Arrays.toString(array));
	}
	
	
//	@Test
	void test29() {
		
		int[] arr = {20, 35, -15, 7, 55, 1, -22};
		
		for(int i=arr.length-1;i>0;i--) {
			
			int largest = 0;
			
			for(int j=1;j<=i;j++) {
				if(arr[j] > arr[largest])
					largest = j;
			}
			
			int temp = arr[largest];
			arr[largest] = arr[i];
			arr[i] = temp;
			
		}
		
		System.out.println(Arrays.toString(arr));
		
	}
	
	
	
	
	
	
	
	
	
}
