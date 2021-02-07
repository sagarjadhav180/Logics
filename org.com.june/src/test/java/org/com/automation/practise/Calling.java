package org.com.automation.practise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Calling 
{
	

	String URL="https://convirza.awsapps.com/auth/?client_id=06919f4fd8ed324e&redirect_uri=https%3A%2F%2Fconvirza.awsapps.com%2Fconnect%2Fauth%2Fcode";

    String user="ggarde";
    String pass="ChangeMe1";
    String number="3852931821";
    
    
	

	@FindBy(xpath="//input[@id='wdc_username']")
	private WebElement username;

	@FindBy(xpath="//input[@id='wdc_password']")
	private WebElement password;

	@FindBy(xpath="//button[@id='wdc_login_button']")
	private WebElement login_button;

	@FindBy(xpath="//span[contains(text(),'Dial number')]")
	private WebElement dial_button;

	@FindBy(xpath="//input[@id='numberRealInput']")
	private WebElement number_textbox;

	@FindBy(xpath="//span[@class='dialButtonText ng-scope']")
	private WebElement dial;
	
	@FindBy(xpath="//button[@class='largeButton disconnectButton ng-scope']")
	private WebElement disconnect;
    
	public WebDriverWait wait;	
	WebDriver driver;
	
    public Calling(WebDriver driver,WebDriverWait wait1){
		
		PageFactory.initElements(driver, this);
        	this.wait=wait1;
	}

	
	
        public void test1() throws InterruptedException {
        

    			
//    	wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@class='a-box a-color-offset-background']"))));
    	
    	Thread.sleep(5000);

    	System.out.println("username "+username);    	
    	wait.until(ExpectedConditions.visibilityOf(username));
    	username.sendKeys(user);

    	wait.until(ExpectedConditions.visibilityOf(password));
    	password.sendKeys(pass);

    	wait.until(ExpectedConditions.visibilityOf(login_button));
    	login_button.click();


    	wait.until(ExpectedConditions.visibilityOf(dial_button));
    	dial_button.click();
    	

    	wait.until(ExpectedConditions.visibilityOf(number_textbox));
    	
    	number_textbox.sendKeys(number);
    	

    	wait.until(ExpectedConditions.visibilityOf(dial));
 	    	
        dial.click();
        Thread.sleep(60000);

    	wait.until(ExpectedConditions.visibilityOf(disconnect));
 
    	disconnect.click();
    	Thread.sleep(40000);
    	
    	
    	
    	 String dbUrl="jdbc:postgresql://stag-5-pg-1.convirza.com:5432/ct_stg";
    	 String username="moentekdbrw";
    	 String password="hyPdua14GAu6";
    	 Connection connection=null;
    	 Statement stmpt=null;
    	
    	 String query="SELECT count(*) as count FROM call WHERE tracking='3018934412' AND call_started>'2020-09-09 23:59'";
    	 
    	String call_count = null;
		try{
			
			Class.forName("org.postgresql.Driver");
		   
			 connection = DriverManager.getConnection(dbUrl,username,password);
		    
			stmpt=connection.createStatement();
			
			ResultSet result = stmpt.executeQuery(query);
		
		while(result.next()){
//			Array campaign_count = result.getArray("count");
			 call_count = result.getString("count");
			System.out.println(call_count);
		}
		
		
		}
		
		catch(Exception e){
			e.printStackTrace();
		}
		
    	
    	
    	
    	
        }
        
        
        
        
        
        
        
	}

	
    

	

