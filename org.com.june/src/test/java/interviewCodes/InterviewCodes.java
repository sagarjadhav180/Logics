package interviewCodes;

import org.testng.annotations.Test;
import org.yaml.snakeyaml.Yaml;
import org.testng.AssertJUnit;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
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
import java.util.logging.Level;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.io.FileUtils;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;
import org.json.simple.JSONObject;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.logging.LoggingPreferences;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
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

public abstract  class InterviewCodes {

	WebDriver driver;
	
	//abstract class can have any access specifier
	public int i;
	private int o;
	protected int p;
	
	
	
	//write code to reverse string 
//	@Test(groups= {"group a"})
	public void test1() throws  Exception {
		
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
		
		for(int i=chars.length;i>0;i--) {
			System.out.print(chars[i-1]);
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
		
		temp = a;
		a = b;
		b = temp;
		
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
	
	
	// Write a Java Program to remove all alphas/numbers from a string with using replace().
	@Test
	public void test20() {
		String str = "100%";
		System.out.println(str);
		System.out.println(str.replaceAll("\\D", ""));	//---get only digits
		System.out.println(str.replaceAll("\\d", ""));	//---get only alphas	
		System.out.println(str);
	}
	
	
	// Write a Java Program to remove all white spaces from a string without using replace(). -- not working
//	@Test
	public void test21() {
        String str = "Hello World ";
		
	    char[] arr = str.toCharArray();
		
	    for(char one:arr) {
	    	if(one!= ' ') {
	    		System.out.print(one);
	    	}
	    }
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
	
	
//	 Write a Java Program to switch to diff windows. -- in actual practice there will be scenario form parent window diff windows will open 
//	   this code wont work since it will refer to latest driver object
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
		
		//register the jdbc driver
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
	
	//write a code to check if array has all same objects
//	@Test
	public void test38() {
		
		List<String> list  =new ArrayList<String>(Arrays.asList("bing","bing","bing","bing"));

		Boolean flag;
		
		if(Collections.frequency(list, "bing")==list.size()) {
			flag = true;
		}else {
			flag = false;
		}
		System.out.println(flag);
	} 		    	

	
	//write a code to check equality of string literal
//	@Test
	public void test39() {
		
		String str1 = "true";
		String str2 = "true";
		
		System.out.println(str1.equals(str2)); //--will return true
		
		System.out.println(str1==str2); //--will return true
	}
	
	//write a code to check equality of string object
//	@Test
	public void test40() {
		
		String str1 = new String("true");
		String str2 = new String("true");
		
		System.out.println(str1==str2); //will return false
		System.out.println(str1.equals(str2)); //will return true
		
	}
	
	
	//write a java code to fetch only consecutive digits and add them
	//expected output  abv10efdde10sdfsdf10ss  ==>10+10+10
	//	@Test 
    public void test41() {
    	String str = "abv10efdde10sdfsdf10ss";
    	
    	str = str.replaceAll("\\D", " ");
		
    	
    	str = str.replaceAll("\\s{2,}", " ").trim();
    	
    	System.out.println(str);
    	
    
    	String[] arr = str.split(" ");
    	
    	System.out.println(arr);
    	
    	int addition = 0;
    	
    	for(int i=0;i<arr.length;i++) {
    		addition = addition + Integer.parseInt(arr[i]);
    	}
    	
    	
    	System.out.println(addition);
	}
    

	int counter;
//    @Test
    public void test42() {
    	
    	String str1 = new String("java");
    	String str2 = new String("mava");
    	
    	try {
    		counter++;
    		if(str1!=str2)
    			throw new Exception();
    	}catch(Exception e) {
    		if(counter<10)
    			test42();
    	}
    }
	
    
//    @Test
    public void test43() {
    	
    	System.out.println("test43");
    }
    
    
    //Write a java code to print numbers from 1 to 100 without using loops and recursion
//    @Test
    public void test44() {
    	Object[] num = new Object[100];
    	
    	Arrays.fill(num, new Object() {
    		int count = 0;
    		public String toString() {
    			count++;
    			return Integer.toString(count);
    		}
    	});
    	System.out.println(Arrays.toString(num));
    }
		
    
    //write a java code to read data from yaml file
//    @Test
    public void test45() throws FileNotFoundException {
    	Yaml yaml= new Yaml();
    	
    	InputStream inputstream = new FileInputStream(new File(System.getProperty("user.dir")+File.separator+"config.yaml"));
    	
    	Map<String,Object> map = yaml.load(inputstream);
    	
    	Map<String,Object>  avengers = (Map<String,Object>) map.get("convirza");
    	

    	System.out.println(avengers);
    	
    }
    
    //write a java code to write data into yaml file
//    @Test
    public void test46() throws IOException {
        Yaml yaml= new Yaml();
        
        Map<String, Object> map1 = new HashMap<String, Object>();
        
        InputStream inputstream = new FileInputStream(new File(System.getProperty("user.dir")+File.separator+"config.yaml"));
    	
    	map1 = yaml.load(inputstream);
    	
    	Map<String,Object>  convirza = (Map<String,Object>) map1.get("convirza");
        
    	Map<String,Object>  blacklisted_number = (Map<String,Object>)convirza.get("blacklisted_number");
    	
    	Map<String,Object> number = (Map<String,Object>)blacklisted_number.get("agency");
    	
    	
    	number.put("number", "1234567891");
        
    	Map<String,Object>  updated_yaml = new HashMap<String, Object>(); 	
    	
    	updated_yaml.put("convirza", convirza);
    	
        String data = yaml.dump(updated_yaml);
        
//    	OutputStream outputstream = new FileOutputStream(new File(System.getProperty("user.dir")+File.separator+"config.yaml"));
    	FileWriter writer = new FileWriter(new File(System.getProperty("user.dir")+File.separator+"config.yaml")); 
    	writer.write(data);
    	writer .close();
    	
    }
    
    
    //Write a java code to write yaml file into POJO class 
//    @Test
    public void test47() throws JsonParseException, JsonMappingException, IOException {
        Yaml yaml= new Yaml();
    	
    	InputStream inputstream = new FileInputStream(new File(System.getProperty("user.dir")+File.separator+"config.yaml"));
    	
    	Map<String,Object> map1 = yaml.load(inputstream);
    	
    	System.out.println(map1);
    	
    	Map<String,Object> map2 = (Map<String, Object>) map1.get("convirza");
    	
    	Map<String,Object> map3 = (Map<String, Object>) map2.get("group");
    	
    	Map<String,Object> map = (Map<String, Object>) map3.get("agency");
    	
    	JSONObject json = new JSONObject();
    	
    	for(String key:map.keySet()) {
    		Object value = map.get(key);
    		json.put(key, value);
    	}
    	
    	ObjectMapper mapper = new ObjectMapper();

    	PostGroupRequest postGroupRequest = new PostGroupRequest();
    	
    	postGroupRequest= mapper.readValue(json.toString(), PostGroupRequest.class);
    	

    	System.out.println(postGroupRequest);
    	
    	String jsonString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(postGroupRequest);
    	System.out.println(jsonString);
    }

    
    //Write a java code to write POJO class file into yaml 
//    @Test
    public void test48() throws JsonParseException, JsonMappingException, IOException {
        Yaml yaml= new Yaml();
    	
    	InputStream inputstream = new FileInputStream(new File(System.getProperty("user.dir")+File.separator+"config.yaml"));
    	
    	Map<String,Object> map1 = yaml.load(inputstream);
    	
    	System.out.println(map1);
    	
    	Map<String,Object> map2 = (Map<String, Object>) map1.get("convirza");
    	
    	Map<String,Object> map3 = (Map<String, Object>) map2.get("group");
    	
    	Map<String,Object> map = (Map<String, Object>) map3.get("agency");
    	
    	JSONObject json = new JSONObject();
    	
    	for(String key:map.keySet()) {
    		Object value = map.get(key);
    		json.put(key, value);
    	}
    	
    	ObjectMapper mapper = new ObjectMapper();

    	PostGroupRequest postGroupRequest = new PostGroupRequest();
    	
    	postGroupRequest= mapper.readValue(json.toString(), PostGroupRequest.class);
    	
    	
    	postGroupRequest.setGroup_id(25056);
    	postGroupRequest.setAddress("pune-lake town");
    	postGroupRequest.setGroup_ext_id("123abcdefghi");
    	
    	String jsonString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(postGroupRequest);
    	System.out.println(jsonString);
    	
    	map.putAll(postGroupRequest.getMapObject());
    	
    	System.out.println("--------------");
    	System.out.println(map);
    	System.out.println("--------------");
    	
        
    	
    	Map<String,Object>  updated_yaml = new HashMap<String, Object>();
    	
    	updated_yaml.put("convirza", map2);
    	
    	String updatedYAML = yaml.dump(updated_yaml);
    	FileWriter writer = new FileWriter(new File(System.getProperty("user.dir")+File.separator+"config.yaml")); 
    	writer.write(updatedYAML);
    	
    	writer .close();
    }
    
    
//    @Test
    public void test49() {
    	System.setProperty("webdriver.chrome.driver", ".//chromedriver_linux");
		driver = new ChromeDriver();
		
		driver.get("https://compare-staging.patientpop.com/checkup");
		
		
		WebElement input = driver.findElement(By.xpath("//input[@name='practicename']"));
		input.sendKeys("amersi");
		
		List<WebElement> options = driver.findElements(By.xpath("//input[@name='practicename']//ancestor::div[@id='app']//..//div[@class='pac-container pac-logo']//div[@class='pac-item']//span[contains(text(),'USA')]"));
		
		String address = "North Atherton Street, State College, PA, USA";
		
		for(WebElement option:options) {
			System.out.println(option.getText());
			if(option.getText().equals(address)) {
				option.click();
				break;
			}else
				continue;
		}
		
    }
    
    //Write a java code to move all even at left and odd at right using collection
//    @Test
    public void test50() {
		
		int[] arr = {1,5,4,7,9,8,2};
		
		List<Integer> even = new ArrayList<Integer>();
		List<Integer> odd = new ArrayList<Integer>();
		List<Integer> updated = new ArrayList<Integer>();
		
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				even.add(arr[i]);
			}else {
				odd.add(arr[i]);
			}
		}

		updated.addAll(odd);
		updated.addAll(even);
		System.out.println(updated);
    }

    
    //Write a java code to move all even at left and odd at right without using collection
//    @Test
    public void test51() {
        
    	int[] arr = {2,5,4,7,9,8,1};
		int moves = 0;
		
		System.out.println(Arrays.toString(arr));
		
		int left = 0;
		int right = arr.length-1;
		
		for(int i=0;i<arr.length;i++) {
			
			while(arr[left]%2==0) {
				left++;
			}
			while(arr[right]%2!=0) {
				right--;
			}
		
			if(left<right) {
				moves++;
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				continue;
			}else
				break;
		}

		System.out.println("moves are "+moves);
		
		System.out.println(Arrays.toString(arr));
    }

    
//	@Test(enabled=true)
	public void testApp() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", ".//chromedriver_linux");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://tutorialsninja.com/demo/index.php");

		WebElement myaccount=driver.findElement(By.xpath("//*[contains(@title,'My Account')]"));
		Actions act=new Actions(driver);
		act.moveToElement(myaccount).click().perform();
		act.moveToElement(driver.findElement(By.partialLinkText("Login"))).click().perform();

		driver.findElement(By.id("input-email")).sendKeys("sct.test@grr.la");
		driver.findElement(By.id("input-password")).sendKeys("SCT@123");
		driver.findElement(By.xpath("//input[@value='Login']")).click();

		driver.findElement(By.xpath("//*[contains(@class,'fa fa-home')]")).click();

		WebElement Feature=driver.findElement(By.xpath("//h3[text()='Featured']"));
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		jse.executeScript("arguments[0].scrollIntoView()",Feature);



		jse.executeScript("window.scrollTo(0,-document.body.scrollHeight);");
		WebElement LaptopsNotebooks=driver.findElement(By.xpath("//a[text()='Laptops & Notebooks']"));
		WebElement AllLaptopsNotebooks=driver.findElement(By.xpath("//a[text()='Show All Laptops & Notebooks']"));
		act.moveToElement(LaptopsNotebooks).build().perform();
		act.moveToElement(AllLaptopsNotebooks).click().perform();


		Thread.sleep(2000);
		WebElement SortBy=driver.findElement(By.xpath("//select[@id='input-sort']"));
		Select select = new Select(SortBy);
		select.selectByVisibleText("Price (High > Low)");
		Thread.sleep(2000);
		
		WebElement addToCart = driver.findElement(By.xpath("//div[@class='caption']//a[text()='MacBook Pro']//ancestor::div[@class='caption']//following-sibling::div//button//span[text()='Add to Cart']/.."));
		addToCart.click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		driver.quit();

	}
	
	
//	@Test
	public void test96() {
		int totalPeople = 1100;
		int heads = 0;
		int tails = 0;
		
		for(int i=1;i<=totalPeople;i++) {
			if(i==1) 
				heads = 1100;
			if(i%2==0) {
				heads--;
				tails++;
			}
				
		}
		System.out.println("heads count is "+heads);
		System.out.println("tails count is "+tails);
	}

	
	//get email id from random string
//	@Test
	public void test97() {
		List<String> identifiedAgentsFromUI;
		 String s = "a i | ai@yopmail.com";
		    Matcher m = Pattern.compile("[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9-.]+").matcher(s);
		    while (m.find()) {
		    	String id = m.group();
		        System.out.println(id);
		    }
		    
	}
	
	
	//Write java code to remove all special character from String
//	@Test
	public void test98() {
		String arr= "['SpamGuardComponent', 'HIPPAComponent']";
		
		System.out.println(arr);
		
		arr = arr.replaceAll("[^a-zA-Z0-9]", " ");
		
		System.out.println(arr);
		
		String[]  arr1 = arr.split(" ");
		
		
		 System.out.println(arr1);
		System.out.println("-------------------------");
		for(String str:arr1) {
			System.out.println(str.trim());
		}
		System.out.println("-------------------------");		
	}
	
	
	//Write java code for throw keyword
	@Test
	public void test99(int age) {  
		
		if(age<18)
			throw new ArithmeticException("Access denied");
		else
			System.out.println("access granted");
	}
	
	//Write java code for throw keyword
//	@Test
	public void test100() {
		test99(19);
	}
	

	//abstract methods can have only public and protected access specifiers
	public abstract void test101(); 	
	public abstract void test103(); 
	
//	@Test
	public void test102() {
		try {
			String str = "tr";
			String str1 = "ty";
			
			failing("true", "tru");
		}catch(Exception e) {
			failing("true", "true");			
		}
	}
	
	public void failing(String actual, String expected) {
		Assert.assertEquals(actual, expected);
	}
	
	
	
	public int getCube(int val) {
		
		int cube = val*val*val;
		
		return cube;
		
	}
	
	
	
	
	
}



