package org.com.automation.practise;

import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Test2 extends AllNewLogics
{
//
//	@Test(priority=1)
	@Test
	public  void test1() throws InterruptedException
	{



		System.setProperty("webdriver.chrome.driver", ".//chromedriver.exe");
		driver=new ChromeDriver();

		driver.manage().window().maximize();		
	driver.get("https://stag-5-cmo-1.convirza.com");
	wait= new WebDriverWait(driver,30);
	
	
	
	
	}
	

	@Test
	public  void test2() throws InterruptedException 
	{

		
		
		Calling calling=new Calling(driver,wait);
		calling.test1();
	
	
	
	}
	
	
@AfterTest
public void teardown(){
	driver.quit();
}

	
	
	
}
