package org.com.automation.practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Temp {

	
//	@Test
	void test1() {
	
		int [] arr[] = new int[3][2];
		
		boolean flag = false ;
		
		if(flag) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
	}
	
	//catch block can handle exceptions not errors
//	@Test
	static void test2() {
		
		try {
			exceptioMethod();
			System.out.println("A");
		}catch(Exception e) {
			System.out.println("B");
		}finally {
			System.out.println("C");
		}
		
	}
	
	static void exceptioMethod()  {
		throw new Error();
	}
	
	
	
	private int a;
	static int b;
	
	public void calc(int x, int y) {
		
		a += x;
		b += y;
		
		System.out.println(a);
		System.out.println(b);
	}
	
//	@Test
	public static void test3() {
		Temp t = new Temp();
		
		t.a = 0;
		b = 0;
		t.calc(1, 2);
		t.a = 0;
		t.calc(2, 3);
		
		System.out.println("a:"+t.a+" b:"+b);
		
	}
	
	void test4(int a, float b) {
		System.out.println("in float method");
	}
	
	void test4(float a, int b) {
		System.out.println("in float method");
	}
	
	
//	@Test
	void test5() {
		test4(20f,20);
	}
	
	//handing of svg elements
//	@Test
	void test6() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./chromedriver_linux");
		
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.get("file:///home/sagar/temp_sagar/svg.html");
		Thread.sleep(2000);
		
		
		WebElement we = driver.findElement(By.xpath("//*[name()='svg']//*[name()='ellipse']"));
		
		
		Thread.sleep(2000);
		
		new Actions(driver).moveToElement(we).perform();

		Thread.sleep(2000);
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
