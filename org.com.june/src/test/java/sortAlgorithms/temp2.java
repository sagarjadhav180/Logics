package sortAlgorithms;

import org.testng.annotations.Test;

public class temp2 extends temp{

	
	int l = 50;
	
	@Test
	void test2() throws Throwable {
		int l = 40;
		
		System.out.println(this.l);
		
		temp t = new temp();
		System.out.println(t);
		super.finalize();
		System.out.println(t);
		
	}
	
	static void foo1() {
		
	}
	
	static void foo1(int n) {
		
	}
}
