package interviewCodes;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.testng.annotations.Test;

public class Delete {
	
	//Write a Java Program to reverse a string without using String inbuilt function reverse().
//	@Test
	public void test1() {
		String str = "Hello World";
		
//		str = str.replaceAll("\\s", "");
		
		System.out.println(str);
		
		StringBuilder stb = new StringBuilder();
		stb.append(str);
		stb.reverse();
		System.out.println(stb);
	}
	
	
	//Write a Java Program to reverse a string without using String inbuilt function reverse().
//	@Test
	public void test2() {
		String str = "Hello World";
		
		char[] arr = str.toCharArray();
		
		for(int i = arr.length-1;i>=0;i--) {
			System.out.print(arr[i]);
		}
		
		System.out.println();
	}
	
	
	//Write a Java Program to swap two numbers without using the third variable.
//	@Test
	public void test3() {
		int a = 10;
		int b = 20;
		
		b = b-a;
		a = b+a;
		
		
		System.out.println("a --> "+a);
		System.out.println("b --> "+b);
		
	}

	
	//Write a Java Program to swap two numbers with using the third variable.
//	@Test
	public void test4() {
		int a = 10;
		int b = 20;
		
		int temp;
		
		temp = b;
		b = a;
		a = temp;
		
		System.out.println("b --> "+b);
		System.out.println("a --> "+a);
		
	}
	
	//Write a Java Program to count the number of words in a string using HashMap.
//	@Test
	public void test5() {
		String str = "Hello World";
		
		Map<Integer,Character> map = new HashMap<Integer,Character>();
		
		char[] arr = str.toCharArray();
		
		for(int i = 0;i<arr.length;i++) {
			map.put(i, arr[i]);
		}
		
		System.out.println("no of characters in string are --> "+map.size());
		
	}
	
	
	//Write a Java Program to iterate HashMap using While and advance for loop
	@Test
	public void test6() {
		Map<Integer,String> map = new HashMap<Integer,String>();	
		
		map.put(1, "Thor");
		map.put(2, "Tony stark");
		map.put(3, "Steve Roger");
		map.put(4, "Pepper Potts");
		map.put(5, "Peter");
		
		
		//advance for loop
		Set<Entry<Integer, String>> set = map.entrySet();
		
		for(Entry<Integer, String> entry:set) {
			System.out.println("key is "+entry.getKey()+" value is "+entry.getValue());
		}
		
		
		System.out.println("----------------------------------------------------");
		//while loop
		Iterator<Entry<Integer, String>> itr = map.entrySet().iterator();
		
		while(itr.hasNext()) {
			Entry<Integer, String> entry = itr.next();
			System.out.println("key is "+entry.getKey()+" value is "+entry.getValue());
		}
		
	}
	
	
	
	
	
	

}
