package tests;

import org.testng.annotations.Test;

public class Test3 extends Test1 {

	@Test  
	public void run3(){    
		  
		Test1 t1=new Test1();
		System.out.println("test3 --"+t1.str1);   
	}    
	
	   
}
