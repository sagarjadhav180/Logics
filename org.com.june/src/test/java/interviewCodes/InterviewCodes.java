package interviewCodes;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;


import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class InterviewCodes {

	WebDriver driver;
	
	//write code to reverse string without using string inbuilt function
//	@Test(groups= {"group a"})
	public void test1() {
		
		String str = "Hello World";
		
		StringBuilder builder = new StringBuilder();
		builder.append(str);
		builder = builder.reverse();
		System.out.println(builder);	
	}
	
	//Write a Java Program to reverse a string without using String inbuilt function reverse().
//	@Test(groups= {"group a"})
	public void test2() {
		String str = "Hello World";
		
		char[] chars = str.toCharArray();
		
		for(int i=chars.length;i>=0;i--) {
			System.out.print(chars[i]);
		}
	}
	
	
	//Write a Java Program to swap two numbers without using the third variable.
//	@Test(groups= {"group a"})
	public void test3() {
		int a = 10;
		int b = 20;
		
		System.out.println("----BS-------");
		System.out.println(a);
		System.out.println(b);
		
		b = b-a;
		a = a+b;
		
		System.out.println("----AS-------");
		System.out.println(a);
		System.out.println(b);
	}
	
	//Write a Java Program to swap two numbers using the third variable.
//	@Test(groups= {"group a"})
	public void test4() {
		int a = 10;
		int b = 20;
		int temp;
		
		System.out.println("----BS-------");
		System.out.println(a);
		System.out.println(b);
		
		temp = a+b;
		a = temp-a;
		b = temp-a;
		
		System.out.println("----AS-------");
		System.out.println(a);
		System.out.println(b);
	}
	
	//Write a Java Program to count the number of words in a string using HashMap.
//	@Test
	public void test5() {
		String str = "Hello World";		
		Map<Integer,Character> map = new HashMap<Integer,Character>();
		
		char[] chars = str.replaceAll("\\s", "").toCharArray();
		for(int i=0;i<chars.length;i++) {
			map.put(i, chars[i]);
		}
		
		System.out.println("words in str are "+map.size());
		
		
	}

	
	//Write a Java Program to iterate HashMap using While and advance for loop
//	@Test
	public void test6() {
		Map<Integer,Character> map = new HashMap<Integer,Character>();
		
		map.put(1, 'a');
		map.put(2, 'b');
		map.put(3, 'c');
		map.put(4, 'd');
		
		System.out.println("-----while loop------");
		
		Iterator<Entry<Integer, Character>> itr = map.entrySet().iterator();
		
		while(itr.hasNext()) {
			Entry<Integer, Character> val = itr.next();
			System.out.println(val.getValue());
		}
		
		System.out.println("-----advance for loop------");
		
		for(Entry<Integer, Character> entry:map.entrySet()) {
			System.out.println(entry.getValue());
		}
		
	}
	
	//Write a Java Program to find whether a number is prime or not.
//	@Test
	public void test7() {
		
		List<Integer> primeNumbers = new ArrayList<Integer>();
		
		for(int i=0;i<100;i++) {	
			int counter=0;
			
			for(int j=i;j>=1;j--) {
				if(i%j==0) {
					counter = counter+1;
				}
			}
			
			if(counter==2) {
				primeNumbers.add(i);
			}
		}
		
		System.out.println(primeNumbers);
		
	}
	
	//Write a Java Program to find whether a string or number is palindrome or not.
//	@Test
	public void test8() {
		
		String str = "131";
		
		StringBuilder stb = new StringBuilder();
		StringBuilder stb1 = new StringBuilder();
		stb1.append(str);
		stb.append(str);
		stb = stb.reverse();
		
		if(stb1.toString().equals(stb.toString())) {
			System.out.println(str+" is palindrome");
		}else
			System.out.println(str+" is not palindrome");
		
	}
	
//	@Test
	public void temp() {
	
		String str1 = "Hello World";
		String str2 = "";
		
		for(int i=0;i<str1.length();i++) {
			str2 = str2 + str1.charAt(i);
		}
		
		System.out.println(str2);
	}
	
	
	//Write a Java Program for the Fibonacci series.
//	@Test
	public void test9() {
		
		int a = 0;
		int b = 0;
		int c = 1;
		
		for(int i=0;i<10;i++) {
			a = b;
			b = c;
			c = a+b;
			System.out.println(c);
		}
		
	}
	
	//Write a Java Program to iterate ArrayList using for-loop, while-loop, and advance for-loop.
//	@Test
	public void test10() {
		List<String> list = new ArrayList<>(Arrays.asList("test1","test2"));
		
		//for-loop
		System.out.println("-----------for-loop--------------");
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		//while-loop
		System.out.println("------------while-loop----------------------");
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		//advance for-loop
		System.out.println("-----------advance for-loop--------------");
		for(String one:list) {
			System.out.println(one);
		}
		
	}
	
	

	//Write a Java Program to demonstrate an explicit wait condition check..
//	@Test
	public void test11() {
		System.setProperty("webdriver.chrome.driver", ".//chromedriver_linux");
		driver = new ChromeDriver();
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
		WebElement element = null;
		wait.until(ExpectedConditions.invisibilityOf(element));
	
	}

	
	//Write a Java Program to demonstrate Scroll up/ Scroll down.
//	@Test
	public void test12() {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(x,y)", "");
	}
	
	
	// Write a Java Program to open all links of gmail.com.
//	@Test
	public void test13() {
		
		//lets assume tag name for link is a and link address lies in href attribute
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		for(WebElement link:links) {
			System.out.println(link.getAttribute("href"));
		}
		
	}
	
	//Write a Selenium code to switch to the previous tab.
//	@Test
	public void test14() {

		new Actions(driver).sendKeys(Keys.SHIFT).sendKeys(Keys.TAB).perform();
		
	}
	
	//Write a Java Program to find the duplicate characters in a string.
//	@Test
	public void test15() {
		
		String str = "Hello World";
		
		char[] chars = str.toCharArray();

		Set<Character> set = new HashSet<Character>();
		
		for(char char1:chars) {
			if(set.add(char1)) {
				System.out.println(char1 +" is not duplicate");
			}else {
				System.out.println(char1 +" is duplicate");
			}
		}
	}

	//Write a Java Program to find the second-highest number in an array.
//	@Test
	public void test16() {
		Integer[] arr = new Integer[] {10,20,30,40,50};
		
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(arr));
		
		Collections.sort(list);
		
		Integer secondLargest = list.get(arr.length-2);
		System.out.println(secondLargest);
	}
	
	
	//Write a Java Program to check Armstrong number.
//	@Test
	public void test17() {
		
		int val = 154;
		int addition = 0;
		
		String str = String.valueOf(val);
		char[] chars = str.toCharArray();
		int[] arr = new int[chars.length];
		
		for(int i=0;i<chars.length;i++) {
			
			int value = 0;
			value = getCube(Integer.parseInt(String.valueOf(chars[i])));
			arr[i] = value;
			
		}
		
		for(int j=0;j<arr.length;j++) {
			addition = addition+arr[j];
		}
		
		if(val==addition) {
			System.out.println(val +" is armstrong number"); 
		}else {
			System.out.println(val +" is not armstrong number");			
		}
	}
	
	
	// Write a Java Program to remove all white spaces from a string with using replace().
//	@Test
	public void test18() {
		String str = "Hello World ";
		System.out.println(str.replaceAll("\\s", ""));		
	}
	
	
	// Write a Java Program to remove all numbers from a string with using replace().
//	@Test
	public void test19() {
		String str = "Ha456ello World13 ";
		System.out.println(str.replaceAll("\\d", ""));		
	}
	
	
	// Write a Java Program to remove all alphas from a string with using replace().
//	@Test
	public void test20() {
		String str = "Ha456ello World13 ";
		System.out.println(str.replaceAll("\\D", ""));		
	}
	
	
	// Write a Java Program to remove all white spaces from a string without using replace(). -- not working
//	@Test
	public void test21() {
		String str = "Hello World ";
		
		StringBuilder stb = new StringBuilder();
		char[] chars = str.toCharArray();
		
		for(int i=0;i<chars.length;i++) {
			if(!String.valueOf(chars[i]).isEmpty()) {
				stb.append(chars[i]);	
			}
		}
		System.out.println(stb);
	}
	
	
	// Write a Java Program to read an excel.
//	@Test
	public void test22() throws IOException {
		
		File file =new File(".//staging.xls");
		
		FileInputStream fis = new FileInputStream(file);
		
		Workbook workbook = new HSSFWorkbook(fis);
		
		Sheet sheet = workbook.getSheet("GetTag");
		
		int rows = sheet.getLastRowNum()-sheet.getFirstRowNum();
		
		for(int i=0;i<rows;i++) {
			Row row = sheet.getRow(i);
			
			for(int j=0;j<row.getLastCellNum();j++) {
				Cell cell = row.getCell(j);
				if(cell!=null) {
					if(cell.getCellType()==cell.CELL_TYPE_STRING) {
						System.out.println(cell.getStringCellValue());		
					}else if(cell.getCellType()==cell.CELL_TYPE_NUMERIC) {
						System.out.println(cell.getNumericCellValue());						
					}else if(cell.getCellType()==cell.CELL_TYPE_BLANK) {
						
					}	
				}
			
			}
			
		}
	}

	
	// Write a Java Program to get random number.
//	@Test
	public void test23() {
		
        //Using Random class -- this is used to generate only numbers
		Random random2 =new Random();
		int random_num2 = random2.nextInt(123456789); // -- it will give 8 digit random number
		System.out.println(random_num2);
		
		//Using RandomStringUtils -- this is used to generate alphanumeric 
		
		//uuid --  to generate random UUID
		UUID uniqueId = UUID.randomUUID();
		System.out.println(uniqueId.randomUUID()); //f9d72412-6c97-4921-a3c1-13078cc0e5ac
	
	}
	
	
//	 Write a Java Program to switch to diff windows. -- in actual practise there will be scenario form parent window diff windows will open 
//	   this code wont work since it will refer to latest driver oject
//		@Test
		public void test24() {
			System.setProperty("webdriver.chrome.driver", ".//chromedriver_linux");
			driver = new ChromeDriver();
			
			driver.get("https://www.google.com");
			driver = new ChromeDriver();
			driver.get("https://www.facebook.com");
			driver = new ChromeDriver();
			driver.get("https://www.linkedin.com");
			
			String ref_id_main_window = driver.getWindowHandle();
			Set<String> ref_ids = driver.getWindowHandles();
			
			Iterator<String> itr = ref_ids.iterator();
			while(itr.hasNext()) {
				String ref_id = itr.next();
				System.out.println(ref_id);
				if(ref_id_main_window.equals(ref_id)) {
					driver.switchTo().window(ref_id);	
				}
			}
			driver.switchTo().window(ref_id_main_window);
			driver.close();
	}
	
	
	//write a code to identify broken links	
//	@Test
	public void test25() {
		System.setProperty("webdriver.chrome.driver", ".//chromedriver_linux");
		driver = new ChromeDriver();
		HttpURLConnection conn = null;
		
		driver.get("https://www.google.com");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		Iterator<WebElement> itr = links.iterator();
		
		while(itr.hasNext()) {
			String url = itr.next().getAttribute("href");
			System.out.println(url);
			
			if(url == null || url.isEmpty()) {
				System.out.println("url is not configured for anchor tag or its empty");
				continue;
			}
			try {
				conn = (HttpURLConnection)(new URL(url).openConnection());
				conn.setRequestMethod("HEAD");
				conn.connect();
				int response_code = conn.getResponseCode();
				
				if(response_code>=400) {
					System.out.println("------------------------------INVALID LINK--------------------------------------------------");
					System.out.println(url + " is a broken link");
					System.out.println("------------------------------INVALID LINK--------------------------------------------------");
				}else {
					System.out.println("------------------------------VALID LINK--------------------------------------------------");
					System.out.println(url +" is valid link");
					System.out.println("------------------------------VALID LINK--------------------------------------------------");
				}
				
			}catch(Exception e) {
				
			}
		}
		driver.quit();
	} 	
		
	
	//write a java code to highlight element using jse	
//	@Test
	public void test26() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".//chromedriver_linux");
		driver = new ChromeDriver();
		driver.get("https://stag-7-cmo-1.convirza.com/");
		WebDriverWait wait =new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='email']")));
		WebElement element = driver.findElement(By.xpath("//input[@name='email']"));
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		//highlight
		jse.executeScript("arguments[0].setAttribute('style',arguments[1]);", element,"color: red; border: 3px solid red;");
		
		Thread.sleep(10000);
		//remove highlight
		jse.executeScript("arguments[0].setAttribute('style',arguments[1]);", element,"");
	}


	//write a java code to scroll to element using jse	
//	@Test
	public void test27() {
		System.setProperty("webdriver.chrome.driver", ".//chromedriver_linux");
		driver = new ChromeDriver();
		driver.get("https://stag-7-cmo-1.convirza.com/");
		WebDriverWait wait =new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='email']")));
		WebElement element = driver.findElement(By.xpath("//input[@name='email']"));
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].scrollIntoView(true)", element);	
		
	}
	

	//write a java code to click on element using jse	
//	@Test
	public void test28() {
		System.setProperty("webdriver.chrome.driver", ".//chromedriver_linux");
		driver = new ChromeDriver();
		driver.get("https://stag-7-cmo-1.convirza.com/");
		WebDriverWait wait =new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='email']")));
		WebElement element = driver.findElement(By.xpath("//input[@name='email']"));
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click();", element);	
		
	}

	
	//write a java code to wait for page load using jse	
//	@Test
	public void test29() {
		System.setProperty("webdriver.chrome.driver", ".//chromedriver_linux");
		driver = new ChromeDriver();
		driver.get("https://stag-7-cmo-1.convirza.com/");
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		ExpectedCondition<Boolean> pageload = new ExpectedCondition<Boolean>(){
			public Boolean apply(WebDriver driver) {
				// TODO Auto-generated method stub
				
				return jse.executeScript("return document.readyState").equals("complete"); 
			}
		};
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(pageload);
	}

	
	//write a java code to make element visible using jse	
//	@Test
	public void test30() {
		System.setProperty("webdriver.chrome.driver", ".//chromedriver_linux");
		driver = new ChromeDriver();
		driver.get("https://stag-7-cmo-1.convirza.com/");
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		WebDriverWait wait =new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='email']")));
	
		WebElement element = driver.findElement(By.xpath("//input[@name='email']"));
		
		jse.executeScript("arguments[0].setAttribute('style', 'visibility : visible;')", element);
		
	}
	
	
	//write a java code to add attribute to element using jse	
//	@Test
	public void test31() {
		System.setProperty("webdriver.chrome.driver", ".//chromedriver_linux");
		driver = new ChromeDriver();
		driver.get("https://stag-7-cmo-1.convirza.com/");
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		WebDriverWait wait =new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='email']")));
	
		WebElement element = driver.findElement(By.xpath("//input[@name='email']"));
		
		jse.executeScript("arguments[0].setAttribute('aria-hidden', 'false')", element);	
	}
	
	
	//write a java code to enter text in element using jse	
//	@Test
	public void test32() {
		System.setProperty("webdriver.chrome.driver", ".//chromedriver_linux");
		driver = new ChromeDriver();
		driver.get("https://stag-7-cmo-1.convirza.com/");
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		WebDriverWait wait =new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='email']")));
	
		WebElement element = driver.findElement(By.xpath("//input[@name='email']"));
		
		jse.executeScript("arguments[0].value = 'testautomation@yopmail.com'", element);	
	}
	
	
	//write a java code to capture screenshot	
//	@Test
	public void test33() throws IOException {
	
		TakesScreenshot shot = (TakesScreenshot)driver;
		File src = shot.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("enter path of loc"));
	}
	
	//write a java code for db connection	
//	@Test
	public void test34() throws IOException, SQLException, ClassNotFoundException {
		
		// jdbc:postgresql -- setting jdbc driver for postgresql
		// stag-7-pg-1.convirza.com -- hostname 
		// 5432 -- port
		// ct_stg -- db name
		
		String dbUrl = "jdbc:postgresql://stag-7-pg-1.convirza.com:5432/ct_stg";
		
		//get connection and store it in Connection
		Connection connection = DriverManager.getConnection("dbUrl","username","password");
		
		//loading the jdbc driver
		Class.forName("org.postgresql.Driver");
		
		//calling createStatement()
		Statement stmpt = connection.createStatement();
		
		//from Statement object calling executeQuery() and storing it in ResultSet
		ResultSet result = stmpt.executeQuery("query");
		
		//iterating results
		while(result.next()) {
			//getting result for the particular column by passing column name
			String data = result.getString("columnIndex");
		}
		
	}
	
	
	//write a code for fluent wait
//	@Test
	public void test35() {
		
		System.setProperty("webdriver.chrome.driver", ".//chromedriver_linux");
		driver = new ChromeDriver();
		driver.get("https://stag-7-cmo-1.convirza.com/");
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(60)).
				pollingEvery(Duration.ofMillis(500))
				.ignoring(Exception.class);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='email']")));
	} 
	
	
	//write a code to pick random object from array
//	@Test
	public void test36() {
		
		String[] arr = {"sam","joe","deb"};		
		Random random = new Random();
		int index = random.nextInt(arr.length);
		System.out.println(arr[index]);

	} 	
	
	//write a code to check if array has all same objects
//	@Test
	public void test37() {
		
		List<String> list  =new ArrayList<String>(Arrays.asList("bing","bing","bing","bingo"));

		Boolean flag;
		
		if(new HashSet<String>(list).size()<=1) {
			flag = true;
		}else {
			flag = false;
		}
		System.out.println(flag);
	} 		
	
    	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	*####
//	###**
//	***##
//	@Test
	public void test95() {
		
		int rows = 3;
		int star = 1;
		int hash = 4;
		
		for(int i=1;i<=rows;i++) {
			if(i%2==0) {
				for(int j=1;j<=hash;i++) {
					System.out.print("#");	
				}
			}
			else {
				for(int j=1;j<=star;j++) {
					System.out.print("*");	
				}
			}
			star++;
			hash--;
			System.out.println();
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public int getCube(int val) {
		
		int cube = val*val*val;
		
		return cube;
		
	}
	
	
	
}



