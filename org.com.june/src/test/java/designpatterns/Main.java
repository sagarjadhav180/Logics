package designpatterns;

import org.testng.annotations.Test;

public class Main {

	@Test
	public void run1() {
	
		Singleton instance = Singleton.getInstance();
		Singleton instance1 = Singleton.getInstance();
		Singleton instance2 = Singleton.getInstance();
		System.out.println(instance.toString());
		System.out.println(instance1.toString());
		System.out.println(instance2.toString());
		instance.test();
	}
	
	
	
}
