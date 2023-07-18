package tests;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ChinmayProject {

	@Test
	public void test1() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".//chromedriver_linux");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/");
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, 60);
		WebElement alerts = driver.findElement(By.xpath("//h5[text()='Alerts, Frame & Windows']"));
		alerts.click();
		WebElement browser = driver.findElement(By.xpath("//span[text()='Browser Windows']"));
		browser.click();
		WebElement newWindow = driver.findElement(By.xpath("//button[text()='New Window']"));
		newWindow.click();


//	driver.switchTo().alert();
		String title = driver.getTitle();
		System.out.println(title);
//	driver.switchTo().alert().dismiss();
		WebElement alert = driver.findElement(By.xpath("//span[text()='Alerts']"));
		alert.click();
		WebElement clickMe = driver.findElement(By.xpath("(//button[text()='Click me'])[4]"));
		clickMe.click();
		driver.switchTo().alert().sendKeys("Chinmay");
		driver.switchTo().alert().accept();
		WebElement name = driver.findElement(By.xpath("//span[@id='promptResult']"));
		Assert.assertTrue(name.getText().endsWith("Chinmay"));
		WebElement modal = driver.findElement(By.xpath("//span[text()='Modal Dialogs']"));
		modal.click();
		WebElement largModal = driver.findElement(By.xpath("//button[text()='Large modal']"));
		largModal.click();
		driver.findElement(By.xpath("(//button[text()='Close'])")).click();
		Thread.sleep(5000);
		driver.quit();

	}

}
