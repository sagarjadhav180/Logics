package dataStructure;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.testng.annotations.Test;


public class Array {
	
	
	
	//write a java code for multidimensional array
//	@Test
	public void test1() {
		
		int[][] arr = new int[2][2];
		arr[0][0] = 1;
		arr[0][1] = 2;
		arr[1][0] = 3;
		arr[1][1] = 4;
		
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

	}
	
	//write a java code copy array from one and put in another -- 		//method 1
//	@Test
	public void test2() {
		
		int[] arr1 = {1,2,3,4,5};
		
		int[] arr2 = new int[arr1.length];
				
		arr2 = Arrays.copyOfRange(arr1, 0, arr1.length);

		System.out.println(Arrays.toString(arr2));
		
	}
	
	
	//write a java code copy array from one and put in another --//method2
//	@Test
	public void test3() {
		
		int[] arr1 = {1,2,3,4,5};
		
		int[] arr2 = new int[arr1.length];

		
		System.arraycopy(arr1, 0, arr2, 0, arr1.length);
		
		System.out.println(Arrays.toString(arr2));
	}	
	
	
	//write a java code clone array
//	@Test
	public void test4() {
		
		int[] arr1 = {1,2,3,4,5};
		
		int[] arr2 = arr1.clone();
		
		System.out.println(Arrays.toString(arr2));		
	}
	
	
	//write a java code to add 2 matrices
//	@Test
	public void test5() {
		
		int a[][]={{1,3,4},{3,4,5}};  
		int b[][]={{1,3,4},{3,4,5}};
		
		int c[][] = new int[2][3];
		
		for(int i =0;i<2;i++) {
			for(int j=0;j<3;j++) {
				c[i][j] = a[i][j] + b[i][j];
			}
		}
		
		for(int i =0;i<2;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
		
	}
	
	
	//write a java code to multiply 2 matrices
//	@Test
	public void test6() {
		
		int a[][]={{1,3,4},{3,4,5}};  
		int b[][]={{1,3,4},{3,4,5}};
		
		int c[][] = new int[2][3];
		
		for(int i =0;i<2;i++) {
			for(int j=0;j<3;j++) {
				c[i][j] = a[i][j] * b[i][j];
			}
		}
		
		for(int i =0;i<2;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
		
	}
	
	//Java Program to find the frequency of each element in the array
//	@Test
	public void test7() {
		int[] arr = {1 ,   2,   8,  3,   2,   2,   2,   5,   1};
		int[] hit = new int[arr.length];
		int visited = -1;
		
		for(int i=0;i<arr.length;i++) {
			

			int counter = 0;
			for(int j=0;j<arr.length;j++) {
				
				if(arr[i]==arr[j]) {
					counter++;
					hit[j] = visited;
				}
			}		
			
			hit[i] = counter;
		
		}
		
		for(int j=0;j<hit.length;j++) {
			if(hit[j]!=visited) {
				System.out.println("frequency of "+arr[j]+"--> "+hit[j]);
			}
		}
		
	}
	
	
	//Program to left rotate the elements of an array
//	@Test
	public void test8() {
		int[] arr = {1 ,   2,   3,   4,   5,   6};
		int[] arr1 = new int[arr.length];
		
		System.out.println("before "+Arrays.toString(arr));
		
		for(int i=0;i<arr.length;i++) {
			int temp = arr[0];
			
			for(int j=i+1;j<arr1.length;j++) {
				arr1[i]=arr[j];
				break;
			}
			arr1[arr1.length-1]=temp;
			
		}
		System.out.println("after "+Arrays.toString(arr1));	
	}	
	
	
	//Program to print the duplicate elements of an array
//	@Test
	public void test9() {
		int[] arr = {1, 2, 3, 4, 2, 7, 8, 8, 3};
		
		int[] hit = new int[arr.length];
		
		for(int i=0;i<arr.length;i++) {
			int counter = 0;
			for(int j=0;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					counter++;
				}
			}
			if(counter>1) {
				Arrays.sort(hit);
				if(Arrays.binarySearch(hit, arr[i])<0)
					hit[i] = arr[i];
			}
			
		}
		for(int j=0;j<hit.length;j++) {
			if(hit[j]!=0)
				System.out.println("duplicate "+hit[j]);
		}
		
	}
	
	
	//Program to print the elements of an array in reverse order
//	@Test
	public void test10() {
		int[] arr = {1, 2, 3, 4, 5};
		
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i] +" ");
		}
		System.out.println();
	}
	
	
	//Java Program to print the elements of an array present on even position
//	@Test
	public void test11() {
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
		
		for(int i=0;i<arr.length;i++) {
			if(i%2==0)
				System.out.println(arr[i]);
		}
		
	}
	
	
	//Java Program to print the largest element in an array with inbuilt function
//	@Test
	public void test12() {
		int[] arr = {1, 2, 8, 4, 5, 6, 7};
		
		Arrays.sort(arr);
		
		System.out.println("largest element "+arr[arr.length-1]);
	}
	
	//Java Program to print the largest element in an array without inbuilt function
//	@Test
	public void test13() {
		int[] arr = {1, 2, 8, 4, 5, 6, 7};
		
		int max = 0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max)
				max = arr[i];
		}
		System.out.println("max is "+max);
	}
	
	
	//Java Program to print the smallest element in an array without inbuilt function
//	@Test
	public void test14() {
		int[] arr = {10, 2, 8, 4, 5, 6, 7};
		
		int min = arr[arr.length-1];
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min)
				min = arr[i];
		}
		System.out.println("min is "+min);
	}

	
	//Java Program to print the sum of all the items of the array
//	@Test
	public void test15() {
		int[] arr = {10, 2, 8, 4, 5, 6, 7};
		
		int sum = 0;
		
		for(int i=0;i<arr.length;i++) {
			sum = sum+arr[i];
		}
		System.out.println(sum);
	}
	
	
	//Java Program to sort the elements of an array in ascending order
//	@Test
	public void test16() {
		int[] arr = {10, 2, 8, 4, 5, 6, 7};
		System.out.println("before sorting "+Arrays.toString(arr));
		
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		System.out.println("after sorting "+Arrays.toString(arr));
	}
	
	
	//Java Program to sort the elements of an array in descending order
//	@Test
	public void test17() {
		int[] arr = {10, 2, 8, 4, 5, 6, 7};
		System.out.println("before sorting "+Arrays.toString(arr));
		
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		System.out.println("after sorting "+Arrays.toString(arr));
	}
	
	
	//Find 3rd Largest Number in an Array
//	@Test
	public void test18() {
		int[] arr = {10, 2, 8, 4, 5, 6, 7};
		System.out.println("before sorting "+Arrays.toString(arr));
		
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		System.out.println("after sorting "+Arrays.toString(arr));
		System.out.println("3rd largest number is  "+arr[arr.length-3]);
	}
	
	
	//Find 2nd smallest Number in an Array
//	@Test
	public void test19() {
		int[] arr = {10, 2, 8, 4, 5, 6, 7};
		System.out.println("before sorting "+Arrays.toString(arr));
		
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		System.out.println("after sorting "+Arrays.toString(arr));
		System.out.println("3rd largest number is  "+arr[arr.length-2]);
	}
	
	
	//Remove Duplicate Element in an Array
//	@Test
	public void test20() {
		int[] arr = {1, 2, 3, 4, 2, 7, 8, 8, 3};
		
		int[] hits = new int[arr.length];
	
		for(int i=0;i<arr.length;i++) {
			
			int counter = 0;
			for(int j=0;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					counter++;		
				}
			} 
			if(counter>=1 && checkValueInArray(hits,arr[i])==false)
				hits[i] = arr[i];
		}
		
		int zeros = 0;
		for(int i=0;i<hits.length;i++) {
			if(hits[i]==0)
				zeros++;
		}
		
		int[] arr1 = new int[hits.length-zeros];
		
		for(int i=0;i<hits.length;i++) {
			if(hits[i]!=0)
				System.out.print(hits[i]+" ");
		}
		System.out.println();
		
	}
	

	public boolean checkValueInArray(int[] arr, int val) {

		boolean flag = false;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==val)
				flag = true;
		}
		return flag;
	}

	
	public  int[] sort(int[] arr, String order) {
		
		int[] sortedArray = Arrays.copyOfRange(arr, 0, arr.length);
		
		for(int i=0;i<sortedArray.length;i++) {
			for(int j=i+1;j<sortedArray.length;j++) {
				switch(order) {
				case "ascending":
					if(sortedArray[i]>sortedArray[j]) {
						int temp = sortedArray[i];
						sortedArray[i] = sortedArray[j];
						sortedArray[j] = temp;				
					}	
					break;
				case "descending":
					if(sortedArray[i]<sortedArray[j]) {
						int temp = sortedArray[i];
						sortedArray[i] = sortedArray[j];
						sortedArray[j] = temp;
					}
					break;
				}
				
			}
		}
		return sortedArray;
		
	}
	
	
	
	
	
	
	
	
	
	
}
