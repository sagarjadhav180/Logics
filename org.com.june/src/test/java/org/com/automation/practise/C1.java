package org.com.automation.practise;

public class C1 {
	
	
	public static String campaign_id="46";
	
	public static String getCampaign_id() {
		return campaign_id;
	}

	public static void setCampaign_id(String campaign_id) {
		C1.campaign_id = campaign_id;
	}

	public static void test(){
		System.out.println("campaign Id is "+campaign_id);
	}

}
