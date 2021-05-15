package org.com.automation.practise;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class C2 {
 

	@Test
	public void test2(){
		 
		
		System.out.println("campaign_id "+C1.campaign_id);
		
		C1.setCampaign_id("248");
		
		C1.test(); 
		
	}

}
