package org.com.automation.practise;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
public class test6 {

	@Test
	public void calling_method() throws InterruptedException {
		 
		/*
		* System.setProperty("WebDriver.Chrome.driver",
		* "C:\\Users\\Amit\\git\\UI_Automation\\replica\\chromedriver.exe"); WebDriver
		* driver2 = new ChromeDriver();
		*/
		 
		WebDriver driver;

		System.setProperty("webdriver.chrome.driver",".//chromedriver_linux");
	    driver=new ChromeDriver();
		
		WebDriverWait wait = new WebDriverWait(driver, 70);

		driver.get("https://stag-5-cmo-1.convirza.com/#/login");
		driver.manage().window().maximize();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='email']")));

		// Thread.sleep(10000);
		WebElement user_id = driver.findElement(By.xpath("//*[@id='email']"));
		user_id.sendKeys("newac@yopmail.com");
		WebElement pwd = driver.findElement(By.xpath("//input[@placeholder='Password']"));
		pwd.sendKeys("lmc2demo");
		WebElement login = driver.findElement(By.xpath("//*[@id='b1']"));
		login.click();
		Thread.sleep(5000);
		WebElement reports = driver.findElement(By.xpath("//ul[@id='sidebar']/li[2]/a"));
		reports.click();
		Thread.sleep(60000);

		WebElement iframe1 = driver.findElement(By.xpath("//iframe[@id='looker']"));
		driver.switchTo().frame(iframe1);

		WebElement reports_listbox_button = driver.findElement(By.xpath("//span[@class='select2-arrow']"));
		reports_listbox_button.click();
		WebElement reports_listbox_textbox = driver.findElement(By.xpath("//input[@id='s2id_autogen1_search']"));
		reports_listbox_textbox.sendKeys("Account Details");
		Actions report_click = new Actions(driver);

		report_click.sendKeys(Keys.ENTER).build().perform();


		 Thread.sleep(15000);
		 try {
		 //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='dashboard-filter-section']/div[1]/div[2]/div[1]/button")));
		 WebElement Run_btn = driver.findElement(By.xpath("//*[@id='dashboard-filter-section']/div[1]/div[2]/div[1]/button"));
		 AssertJUnit.assertTrue( Run_btn.isDisplayed());
		 
		 }
		 catch (Exception e) {
		 
		 }
		 //Run_btn.click();

		 

		//driver2.close();

		}
	
}
