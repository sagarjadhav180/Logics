package org.com.automation.practise;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.message.BasicNameValuePair;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.NotConnectedException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.internal.Yaml;
import org.testng.xml.XmlSuite;

import com.googlecode.charts4j.Color;
import com.googlecode.charts4j.GCharts;
import com.googlecode.charts4j.PieChart;
import com.googlecode.charts4j.Slice;
//import org.yaml.snakeyaml.Yaml;




public class AllNewLogics  
{
	
	@Test(enabled=false)
	public void test1() throws InterruptedException {

        int num = 1234554321;
        int reversedInteger = 0; 
        int remainder;  
        int n;

        n = num;

        // reversed integer is stored in variable 
        while( num != 0 )
        {
            remainder = num % 10;
            reversedInteger = reversedInteger * 10 + remainder;
            num  =num/10;
        }

        // palindrome if orignalInteger and reversedInteger are equal
        if (n == reversedInteger)
            System.out.println(n + " is a palindrome.");
        else
            System.out.println(n + " is not a palindrome.");
    }


	@Test(enabled=false)
	public void test2() throws Exception
	{
		Date now = new Date();
		SimpleDateFormat dateFormatter = new SimpleDateFormat("YYYY'-'MM'-'dd'T'HH':'mm':'ss'.'SSS'Z'",Locale.UK);
		String today_formated_date = dateFormatter.format(now).toString();
		System.out.println(today_formated_date);
		
	}
	
	@Test(enabled=false)
	public void test3()
	{
		Map<String,Integer> map=new HashMap<String,Integer>();
		
		map.put("Maths",85 );
		map.put("science", 90);
		map.put("Bio", 85);
		map.put("History", 70);
		
		Set<String> keys = map.keySet();
		
		for(String key:keys)
		{
			System.out.println(key);
		}
		
		System.out.println("-------------------------------");
		
		Collection<Integer> values = map.values();
		
		for(Integer value:values)
		{
			System.out.println(value);
			
		}
		
		Integer key = map.get("History");
		
		System.out.println("-------------------------------");
		
		System.out.println(key);
		System.out.println("-------------------------------");
		
		Set<Entry<String, Integer>> set = map.entrySet();
		
		for(Entry<String, Integer> obj:set)
		{
			System.out.println(obj);
		}

		
		Map<String,Integer> map1=new HashMap<String,Integer>();
		map1.put("amit", 56);
		map1.put("ganesh", 11);
		map1.put("sagar", 41);
		
	
		List<String> Group1=new ArrayList<String>();
		Group1.add("India");
		Group1.add("England");
		Group1.add("UK");
		
		List<String> Group2=new ArrayList<String>();
		Group2.add("Srilanka");
		Group2.add("West Indies");
		Group2.add("Austeailiya");
		
		Map<String,List> map3=new HashMap<String,List>();
		
		map3.put("Asia", Group1);
		map3.put("Europe", Group2);
		
		List map4 = map3.getOrDefault("Asia", Group1);
		
		System.out.println("---------------ASIA GROUP------------------------------");
		for(Object obj:map4)
		{
		
			System.out.println(obj);
		}
		
		System.out.println("---------------EUROPE GROUP------------------------------");
		List map5 = map3.getOrDefault("Europe", Group2);
		for(Object obj:map5)
		{
		
			System.out.println(obj);
		}
		
	
	}
	
	
	
	
	@Test(enabled=false)
	public void test4()
	{
		int count_opencurls = 0;
		int count_closecurls = 0;
		int count_b=0;
		Scanner sc1=new Scanner(System.in);
		System.out.println("enter value");
		String input = sc1.next();
		char[] arr2 = input.toCharArray();
		String[] arr1;
		for(int j=0;j<arr2.length;j++)
		{

			if(arr2[j]=='{')
			{
				count_opencurls++;

			}
			else if(arr2[j]=='}')
			{
				count_closecurls++;
				if(arr2[0]=='}')
				{
					count_b++;
				}
			}
			

			
		}
		
	
		if(count_opencurls==count_closecurls && count_b==0)
		{
			System.out.println("correct");
		}
		else
		{
			System.out.println("incorrect");
			
		}
		
	}
	
	


	//database connection
	@Test(enabled=false)
	public void test5()  
	{
		
		String dbUrl="jdbc:postgresql://stag-5-pg-1.convirza.com:5432/ct_stg";
		String username="moentekdbrw";
		String password="hyPdua14GAu6";

		List suspendedNumbers_new =new ArrayList();
		
		List unprovisionedNumbers =new ArrayList();

		
		
		Connection connection=null;
		Statement stmpt=null;
		
		String getNumbersQuery="SELECT * from phone_number where number_status='suspended' limit 1";

		
		try{
		
		 Class.forName("org.postgresql.Driver");
		 
		 
		  connection = DriverManager.getConnection(dbUrl, username, password);
		 
		  stmpt = connection.createStatement();
		 
		  ResultSet result = stmpt.executeQuery(getNumbersQuery);
		 
			
		 
		 while(result.next() )
		 {
			 
			 Array arr1 = result.getArray("number_str");
			 try{
				 
			suspendedNumbers_new.add(arr1);
				 
			 }catch(NullPointerException ne){
				 ne.printStackTrace();
			 }
			 

		 }
		 System.out.println("following are suspended numbers..");
		 System.out.println(suspendedNumbers_new);
		  String number1 = suspendedNumbers_new.get(0).toString();
		 String number = "'"+number1+"'";
		 System.out.println();
		
		String markNumberUnprovisionedQuery="UPDATE phone_number set number_status='unprovisioned' where number_str="+number+"";
		 try{
		  stmpt.executeQuery(markNumberUnprovisionedQuery);
		 }catch(Exception e)
		 {
			System.out.println( "number unprovisioned successfully");
		 }; 
		 
		 String getNumbersQuery1="SELECT * from phone_number where number_str="+number+"";
		 ResultSet actual = stmpt.executeQuery(getNumbersQuery1);
		 
		 
		 
		 Array arr2 = null;
		 while(actual.next() )
		 {
			 
			  arr2 = actual.getArray("number_status");
		 }
		 
		 
		 Assert.assertEquals(arr2.toString(),"unprovisioned");
		 
		 try{
			  stmpt.executeQuery(getNumbersQuery1);
			 }catch(Exception e){e.printStackTrace();};
		 
		 
		 
		 stmpt.close();
		 connection.close();
		 
		}
		catch(SQLException se)
		{
			se.printStackTrace();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally{
			try{
				if(connection!=null)
				connection.close();
			}
			catch(SQLException se)
			{se.printStackTrace();}
		} 
		
	}
	
	
	@Test(enabled=false)
	public void test6()
	{
		String str = "'"+"8149173416"+"'";
		
		String str1="SELECT count(*) as count FROM call WHERE tracking='3852931821' AND call_started>'2020-01-01 23:59'";
		
		System.out.println(str);
	}
	
	

	@Test(enabled=false)
	public void test7()
	{

		int count=6;
		
		
		for(int row=1;row<4;row++)
		{
			for(int i=1;i<count+1;i++)
			{
				if(row==1 && i==1 || row==2 && i>4 || row==3 && i<4)
				{System.out.print("*");}
				else{
				System.out.print("#");
				}
				
				 
			
			}
			System.out.println();
		}
		
		
	}
	 

	@Test(enabled=false)
	public void test8()
	{
		int star=5;
		int space=0;
		int row=5;
		int mid=(row/2);
		
		for(int i=1;i<row+1;i++)
		{
			for(int j=0;j<space;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<star+1;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		
			if(i<=mid){
			star=star-2;
			
			space++;
			}
			else{space--;
			star=star+2;}
			
		}
	}
	

	@Test(enabled=false)
	public void test9()
	{
		int star=1;
		int row=5;
		
		for(int i=1;i<row+1;i++)
		{
			for(int j=0;j<star;j++)
			{
				System.out.print("*");
			}

			star=star+2;
			System.out.println();		
		}
		
	}
	
	@Test(enabled=false)
	public void test10()
	{
		int star=5;
		int row=5;
		int mid=(row+1)/2;
		int space=0;
		
		for(int i=1;i<row+1;i++)
		{
			for(int j=0;j<space;j++)
			{
				System.out.print(" ");
			}
			for(int k=0;k<star;k++)
			{
				System.out.print("*");
			}
			System.out.println();
			
			if(i<mid)
			{
				star=star-2;
				space++;
			}
			else if(i>=mid)
			{
				star=star+2;
				space--;
			}
		}

		
	}
	

	@Test(enabled=false)
	public void test11()
	{
		int star=5;
		int row=5;
		int mid=(row+1)/2;
		int space=0;
		
		
		for(int i=1;i<row+1;i++)
		{
			for(int j=0;j<space;j++)
			{
				System.out.print(" ");
			}
			for(int k=0;k<star;k++)
			{
				System.out.print("*");
			}
			System.out.println();
			
			if(i<mid){
			space=space+2;
			star=star-2;
			}
			else if(i>=mid){
				space=space-2;
				star=star+2;
			}
		}
	}
	


	@Test(enabled=false)
	public void test12()
	{
		int star=5;
		int space=0;
		int rows=5;
		int mid=(rows+1)/2;
		
		for(int i=1;i<rows+1;i++)
		{
			for(int j=1;j<space+1;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<star+1;k++)
			{
				System.out.print("*");
			}
			System.out.println();
			if(i<mid)
			{
				space++;
				star=star=star-2;
			}
			else if (i>=
					mid)
			{
				star=star+2;
				space--;	
			}
		}
	}
	
	
	//pie chart
	@Test(enabled=false)
	public void test13()
	{
		int passed=400;
		int failed=90;
		int skipped=10;
		int total = passed + failed + skipped;
		int passed_percentage = (passed == 0) ? 0 : (passed * 100 / total);
		int failed_percentage = (failed == 0) ? 0 : (failed * 100 / total);
		int skipped_percentage = (skipped == 0) ? 0 : (skipped * 100 / total);
		Slice s1 = Slice.newSlice(passed_percentage, Color.BLUE, "Passed", "Passed");
		Slice s2 = Slice.newSlice(failed_percentage, Color.RED, "Failed", "Failed");
//		Slice s3 = Slice.newSlice(skipped_percentage, Color.newColor("CACACA"), "Skipped", "Skipped");
		Slice s3 = Slice.newSlice(skipped_percentage, Color.ORANGE, "Skipped", "Skipped");
		
		PieChart chart = GCharts.newPieChart(s1, s2, s3);
		chart.setTitle("CFA API Automation Result", Color.BLACK, 16);
		chart.setSize(500, 200);
		chart.setThreeD(true);
		String url = chart.toURLString();
		System.out.println("Pie chart is created");
		System.out.println(url); 
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\org.com.automation\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get(url);
		
	}
	
	

	//writing data into new excel sheet
	@Test(enabled=false,priority=1)
	public void test14() throws Exception
	{
		HSSFWorkbook workbook=new HSSFWorkbook();
		HSSFSheet sheet = workbook.createSheet("testdata");
		HSSFRow row;
		int rowid=0;
		
		Map<String,Object[]> map=new HashMap<String,Object[]>();
		
		
		
		map.put("1", new Object[]{"emp id","emp name","gender"});
		map.put("2", new Object[]{"1","sagar","m"});
		map.put("3", new Object[]{"2","kunal","m"});
		map.put("4", new Object[]{"3","chimo","fm"});
		map.put("5", new Object[]{"4","veda","f"});
		
		
		Set<String> keys = map.keySet();
		
		for(String key:keys)
		{
		    row = sheet.createRow(rowid++);
			
			Object[] objects = map.get(key);
			//this variable has to be declare here only
			int cellid=0;	
	
			for(Object object:objects)
			{
				HSSFCell cell = row.createCell(cellid++);
				
				cell.setCellValue((String)object);
				
			}
		}
		
		FileOutputStream fo=new FileOutputStream(".//Testdata.xls");
	
		workbook.write(fo);
		fo.close();
		
	}
	
	
	//writing data into existing excel sheet
	@Test(enabled=false,priority=2)
	public void test15() throws IOException 
	{
		FileInputStream input=new FileInputStream(new File(".\\Testdata.xls"));
		
		HSSFWorkbook workbook=new HSSFWorkbook(input);
		
		HSSFSheet sheet = workbook.getSheet("testdata");
		
		System.out.println("FirstRowNum is "+sheet.getFirstRowNum());
		System.out.println("LastRowNum is "+sheet.getLastRowNum());
		
		int rowcount = sheet.getLastRowNum()-sheet.getFirstRowNum();
		
		HSSFRow row = sheet.getRow(0);
		int newrowcount=rowcount+1;
//		HSSFRow newrow = sheet.createRow(rowcount+1);
//		int rowid = newrow.getRowNum();
		
		
        Map<String,Object[]> map=new HashMap<String,Object[]>();
			
		map.put("6", new Object[]{"5","tony","m"});
		map.put("7", new Object[]{"6","thor","m"});
		map.put("8", new Object[]{"7","capatainmarvel","f"});
		map.put("9", new Object[]{"8","spiderman","m"});
		map.put("10", new Object[]{"9","hulk","m"});
		
		
		Set<String> keys = map.keySet();
		
		

//        	Cell cell = newrow.createCell(j);
        	for(String key:keys)
    		{
        		HSSFRow newrow = sheet.createRow(rowcount++);    		   
    			Object[] objects = map.get(key);
    			
				int cellid=0;    			
    			for(Object object:objects)
    			{

					HSSFCell cell1 = newrow.createCell(cellid++);
    				cell1.setCellValue((String)object);
    				
    			}
    		}	
        	
        
        
	 
		
		
		 input.close();
		    //Create an object of FileOutputStream class to create write data in excel file
		    FileOutputStream outputStream = new FileOutputStream(".\\Testdata.xls");
		    //write data in the excel file
		    workbook.write(outputStream);
		    //close output stream
		    outputStream.close();    
	}
	
	
	

	@Test(enabled=false)
	public void test16()
	{
		int a=5;
		int b=10;
		
		boolean c=a<b ? true:false;
		
		System.out.println(c);
	}
	
	@Test(enabled=false)
	public void test17()
	{
		float[] vals={10.00f,20.00f,30.05f,40.50f};
		
		float sum=0;
		
		for(float val:vals)
		{
			sum +=val;
			
		}
		System.out.println(sum);
	}
	
	

	@Test(enabled=false)
	public void test18()
	{
		int ival;
		
		switch( ival=25%2)
		{
		
		case 0:
			System.out.println("ival is even");
		break;
			
		case 1:
			System.out.println("ival is odd");
			break;
			
			
			default:
			System.out.println("break the loop");
		}
	}
	
	
	

	@Test(enabled=false)
	public void test19()
	{
		int ival=100;
		
		
		do
		{
			ival++;
			System.out.println(ival);
			
		}
		while(ival<110);
	}
	
	
	@Test(enabled=false)
	public void test20()
	{
		String s1="i";
		s1=s1+" love java";
		
		String s2="i love";
		s2 +=" java";
		
		String s3=s1.intern();
		String s4=s2.intern();
		
	System.out.println(s3==s4);
	System.out.println(s3.equals(s4));
		
		
	}
	

	
	public static void square(int number)
	{
		int square=number*number;
		
		System.out.println(square);
		number++;
		if(number<9){
		square(number);
		}
	}
	
	@Test(enabled=false)
	public static void test21()
	{
	
		square(1);
	}
	
	public void run()
	{
		System.out.println("run() in super class..");
		
	}
	
	
	
	//url encoder
	@Test(enabled=false)
	public  void make_get_request() throws ClientProtocolException, IOException, URISyntaxException{
		String api_url = "stag-7-cfaapi-1.convirza.com";
		String path="/v2/callflow";

		String channel = "Linkedin: Paid";
		String[] operators = {"=","!="};
		String encoded_operator = "";
		for(String operator:operators){
			encoded_operator = java.net.URLEncoder.encode(operator, "UTF-8");
			List<NameValuePair> list = new ArrayList<NameValuePair>();
			list.add(new BasicNameValuePair("filter", "channel"+encoded_operator+channel));
			System.out.println("------------------------------------");
			
			 
			for(NameValuePair str:list)
			{
				System.out.println(str);
			}
			System.out.println("------------------------------------");
		URI uri = new URIBuilder()
        .setScheme("https")
        .setHost(api_url)
        .setPath(path)
        .addParameters(list)
        .build();
	
		System.out.println("------------------------------------");
		System.out.println(uri);
		System.out.println("------------------------------------");
		
	}	
	
	}
	
	
	
	@Test(enabled=false)
	public static void test22()
	{
		String str1="Object 1";
		String str2="Object 2";
		
		Assert.assertEquals(str1, str2,"str1 not matching with str2");
	}
	
	
	@Test(enabled=false) 
	public  void test23()
	{		
//		Random random=new Random();
//		int test = random.nextInt(1000);
	
		
		
		String str="Showing 1 - 20 of 20";
		
       System.out.println(str.indexOf('f')+2);
		
		
		
		
		
		
	}
	
	
	
	
	WebDriver driver ;
	WebDriverWait wait;
	
	String URL="https://convirza.awsapps.com/auth/?client_id=06919f4fd8ed324e&redirect_uri=https%3A%2F%2Fconvirza.awsapps.com%2Fconnect%2Fauth%2Fcode";

//	
//	@Parameters({"url","browser"})
//	@BeforeTest
	public  void test24(String url,String browser) throws InterruptedException
	{

		if(browser.contains("firefox")){
		System.setProperty("webdriver.gecko.driver", "D:\\New folder (3)\\geckodriver.exe");
		driver=new FirefoxDriver();
		}

		else if(browser.contains("chrome")){

		System.setProperty("webdriver.chrome.driver", ".//chromedriver.exe");
		driver=new ChromeDriver();
		}

		driver.manage().window().maximize();
		driver.get(URL);
//	driver.get("https://stag-5-cmo-1.convirza.com");
	wait= new WebDriverWait(driver,30);
	
	
	
	
	}
	
//@AfterTest
public void teardown(){
	driver.quit();
}
	

	
	
	@Test(enabled=false)
	public static void test25(String url,String browser) throws InterruptedException
	{
		WebDriver driver;
//		System.setProperty("webdriver.gecko.driver", "D:\\New folder (3)\\geckodriver.exe");
//		driver=new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver", ".//chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		WebDriverWait wait=new WebDriverWait(driver,40);
		

		
	driver.get("https://stag-5-cmo-1.convirza.com");
	WebElement username = driver.findElement(By.xpath("//input[@id='email']"));
	try{
		wait.until(ExpectedConditions.visibilityOf(username));
		Assert.assertTrue(username.isDisplayed());
	}
	catch(Exception e){
		e.printStackTrace();
	}

	JavascriptExecutor jse=(JavascriptExecutor)driver;
	
	//highlight
	jse.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 1px solid red;');", username);
	Thread.sleep(2000);
	//unhighlight
	jse.executeScript("arguments[0].setAttribute('style', 'background: white');", username);
	Thread.sleep(2000);
	driver.quit();
	
	
	
	}	

	

	@Test(enabled=false)
	public static void test26()
	{
		String[] Expected_Column_Picker_options_labels ={"Ad Source",
				"Call Value",
				"Campaign",
				"Campaign External ID",
				"Campaign Start",
				"Campaign End",
				"Campaign Status",
				"Custom Parameters",
				"Custom Source 1",
				"Custom Source 2",
				"Custom Source 3",
				"Custom Source 4",
				"Custom Source 5",
				"DNI",
				"DNI Type",
				"Host Domain",
				"HTML Class",
				"Play Disclaimer",
				"Pre-call Webhook",
				"Record Call",
				"Referring Website",
				"Repeat Interval",
				"Ring-to Phone Number",
				"Spam Guard",
				"Tracking Number",
				"Tracking Number Name",
				"Tracking Number Quantity",
				"Tracking Number Status",
				"Tracking Number Type",
				"Voice Prompt",
				"Voicemail",
				"Whisper Message"};

		String[] default_selected_Expected_Column_Picker_options ={
				"",
				"",
				"Campaign",
				"Campaign External ID",
				"Campaign Start",
				"Campaign End",
				"Campaign Status",
				"",
				"",
				"",
				"",
				"",
				"",
				"",
				"",
				"",
				"",
				"",
				"",
				"",
				"",
				"",
				"Ring-to Phone Number",
				"Spam Guard",
				"Tracking Number",
				"Tracking Number Name",
				"Tracking Number Quantity",
				"Tracking Number Status",
				"Tracking Number Type",
				"",
				"",
				""};


		
		for(int i=0;i<Expected_Column_Picker_options_labels.length;){
			for(int j=0;j<default_selected_Expected_Column_Picker_options.length;){
				if(Expected_Column_Picker_options_labels[i].equals(default_selected_Expected_Column_Picker_options[j])){
					System.out.println("matching");
					Assert.assertTrue(Expected_Column_Picker_options_labels[i].equals(default_selected_Expected_Column_Picker_options[j]));
					j++; 
				}
				else{System.out.println("not matching");  j++;;}
				i++;	
			}
			
		}
		
	}	
	

	@Test(enabled=false) 
	public static void test27(){ 
		int row=5;
		
		int mid=3;
		int count=1;
		int star=3;
		
		for(int i=1;i<row+1;i++){
			
               for(int k=3;k>=star;k--){
            	   System.out.print(k); 
   				            	   
               }	


			System.out.println();
			if(i<mid){
				count++;
				star--;
			}
			else{
				count--;
				star++;

			}
		}
	}
	
	
	@Test(enabled=false)
	public static void test28(){
		int rows=5;
		int count=1;
		int mid=3;
		
		for(int i=1;i<rows+1;i++){
			for(int j=1;j<count+1;j++){
				System.out.print(j);
			}
			System.out.println();
			
			if(i<mid){
				count++;
			}
			else{
				count--;
			}
		}
	}
	@Test(enabled=false)
	public static void test29(){
		
		String s1=new String("hello");
		String s2=new String("hello");
		String s3="hello";
		String s4="hello";
		

		
		System.out.println(s4);
		
	}	
	
	//wrong
	@Test(enabled=false)
	public static void test30(){
		int[] a={0,1,0,0,1,0,0,1,1,1,0};
		
		for(int i=0;i<a.length;i++){
			if(a[i]%2==0){
				System.out.print(a[i]);
			}
		}
		for(int i=0;i<a.length;i++){
			if(a[i]%2!=0){
				System.out.print(a[i]);
			}
		}
	
	}	

	@Test(enabled=false)
	public static void test31(){
		int a[]={7,2,4,1,3,5,6,8,2,10};
		for(int i=0;i<a.length;i++){
			if(a[i]%2==0){
				System.out.print(a[i]);
			}
		}
		for(int i=0;i<a.length;i++){
			if(a[i]%2!=0){
				System.out.print(a[i]);
			}
		}		
	} 
	
	@Test(enabled=false)	
	public static void getDate(){
		Date date=new Date();
		System.out.println("--------------------------------");
		System.out.println(date.getDate());
		System.out.println("--------------------------------");		
	}
	 
	@Test(enabled=false)
	public void test32() throws Exception{
		
//        Yaml yaml=new Yaml();
//		Properties property=new Properties();
//		
//		FileInputStream file=new FileInputStream(".\\config.yaml");
//		
//		 Object prop = property.load(file);
//		yaml.l
		
		
	}
	@Test(enabled=false)
	public void test33(){
		
DateFormat dateFormat = new SimpleDateFormat("YYYY-MM-dd");
		
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DATE, Integer.valueOf(-30));
	    
		Date todate1 = cal.getTime();
	    String date = dateFormat.format(todate1);

	    System.out.println(date);
	    

		
	}
	

	@Test(enabled=false)
	public void test34(){
		
		String tile_values="12 min 13 sec";

		int sec = 0;
		int min = Integer.valueOf(tile_values.substring(0,tile_values.indexOf('m')-1));
        if(min<=9){
        	sec = Integer.valueOf(tile_values.substring(6,8));    	
        }
        else{
        	sec = Integer.valueOf(tile_values.substring(7,9));    	        	
        }
        min=min*60;
		int final_count=sec+min;
		System.out.println(final_count);
		
		
	}
	
	
	public static void test35(String st2){
		
		String str2="java";
		String str1="java";
		
		System.out.println(str1.equals(st2));
		
	}
	
	
}


