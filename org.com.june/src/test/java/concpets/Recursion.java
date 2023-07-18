package concpets;

import org.testng.annotations.Test;

public class Recursion {
	

	int count = 0;
	@Test
	void test() {
		
		System.out.println("test running..");
		
		
		if(count < 10) {
			count++;
			test();
		}
		
	}
	

}
