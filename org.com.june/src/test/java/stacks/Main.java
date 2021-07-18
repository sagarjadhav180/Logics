package stacks;

import org.testng.annotations.Test;

public class Main {

	@Test
	public static void test() {

		ArrayStack stack = new ArrayStack(5);
		
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		stack.push(6);
		System.out.println();
		
		stack.printStack(); 
		System.out.println();
		
		Object peek = stack.peek();
		System.out.println("peek element is "+peek);
		System.out.println();
		
		stack.pop();
		
		System.out.println();
		stack.printStack();		
	}
	
//	@Test
	public void test2() {
		
		System.out.println(checkForPalindrome("I Did, did I?"));
		
	}
	
	public boolean checkForPalindrome(String str) {
		
		LinkedListStack stack = new LinkedListStack();		
		
		str = str.replaceAll("\\s", "");
        str = str.replaceAll("[^a-zA-Z0-9]", ""); 
        str = str.toLowerCase();
		
		
		char[] arr = str.toCharArray();
		for(int i=0;i<arr.length;i++) {
			stack.push(arr[i]);
		}
		
		char[] arr1 = new char[arr.length];
		for(int i=0;i<arr1.length;i++) {
			arr1[i]= (char) stack.peek();
			stack.pop();
		}
		
		if(String.valueOf(arr).equals(String.valueOf(arr1)))
			return true;
		else 
			return false;
		
	}

}
