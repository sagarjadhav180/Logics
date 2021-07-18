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


public class T2 {

	@Test
	public void run() {
		
		int[] arr = {2,12,14,10,4,7,6,8,5,3};
		
		System.out.println("before "+Arrays.toString(arr));
		
		int leftindex = 0;
		int rightindex = arr.length-1;
		
		
		for(int i=0;i<arr.length;i++) {
			while(arr[rightindex]%2==0 && rightindex>=0) {
				rightindex--;	
			}
			while((isNumberPrime(arr[leftindex])==true) && leftindex<arr.length) {
				leftindex++;
			}
			
			if(leftindex<rightindex) {
				int temp = arr[leftindex];
				arr[leftindex] = arr[rightindex];
				arr[rightindex] = temp;
				
			}
		}
		
		System.out.println("after "+Arrays.toString(arr));

	}
	
	public Boolean isNumberPrime(int num) {
		
		int counter = 0;
		Boolean primeNumber = null;
		
		for(int i=num;i>0;i--) {
			if(num%i==0)
				counter++;
		}
		if(counter<=2) {
			primeNumber = true;
		}else 
			primeNumber = false;
		return primeNumber;
		
	}
	
}
