package tests;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.NameValuePair;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.message.BasicNameValuePair;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import pom.TestBase;

public class Test5 extends TestBase
{
	
	
	@Test(enabled=false)	
	public void test1()
	{
		test=extent.startTest("test1");
		test.log(LogStatus.PASS, "test1 running--first log", "first log");
		System.out.println("test 1 started.......");
		Assert.fail();
		test.log(LogStatus.FAIL, "Assertion error"); 
		System.out.println("--------------------------------");
	}
	
	
	public void test2(List nvps) throws URISyntaxException{
		
		URI uri = new URIBuilder()
				.setScheme("https")
				.setHost("stag-5-cfaapi-1.convirza.com")
				.setPath("/v2/customsource")
				.addParameters(nvps)
				.build();
		
		System.out.println(uri);
	}
	
	@Test(enabled=false)
	public void test3() throws URISyntaxException{
		
		List<NameValuePair> list = new ArrayList<NameValuePair>();
		list.add(new BasicNameValuePair("ouId", "70045"));
		list.add(new BasicNameValuePair("limit", "10"));
		
		test2(list);	
	}
	
	@Test(enabled=true)
	public void test4(){
		
	
		
		
	}
	
	
}
