package org.com.automation.practise;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test3   {

	
	@FindBy(xpath="//*[@id='email']")
	private static WebElement username;

	@FindBy(xpath="//input[@placeholder='Password']")
	private static WebElement password;

	

	@FindBy(xpath="//*[@id='b1']")
	private static WebElement login_button;	
	
	public WebDriverWait wait1;	
	WebDriver driver;
	
public Test3 (WebDriver driver,WebDriverWait wait){
		
		PageFactory.initElements(driver, this);
        this.wait1=wait;	
	}


	@Test  (enabled=false)
	public void Test1(){
	
	AllNewLogics obj=(AllNewLogics)new Test2();
	
	obj.run();
	
	

	}
	
	
	@Test
	public void test007() throws InterruptedException {
JavascriptExecutor jse=(JavascriptExecutor)driver;
//		
//		//highlight
//		jse.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 1px solid red;');", username);
//		Thread.sleep(2000);
//		//unhighlight
//		jse.executeScript("arguments[0].setAttribute('style', 'background: white');", username);
//		Thread.sleep(2000);
		try{
			wait1.until(ExpectedConditions.visibilityOf(username));
			AssertJUnit.assertTrue(username.isDisplayed());
			username.sendKeys("ganesh5@yopmail.com");
		}
		catch(Exception e){
			e.printStackTrace();
		}
		try{
			wait1.until(ExpectedConditions.visibilityOf(password));
			AssertJUnit.assertTrue(password.isDisplayed());
			password.sendKeys("lmc2demo");
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		login_button.click();
		Thread.sleep(7000);

		
		

		
	}


	
	
	
	
}
