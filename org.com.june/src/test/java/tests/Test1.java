package tests;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import pom.TestBase;

public class Test1 
{
	public String str1;
	
	@Test
	public   String run1() 
	{


//		test=extent.startTest("testing logs");
		str1="Object 1";		
         System.out.println(str1);
		String str2="Object 1";
		return str1;
		
//		Assert.assertEquals(str1, str2,"str1 not matching with str2");
//		test.log(LogStatus.PASS, "String objects matching");
	
	
		
		
	}

}
 