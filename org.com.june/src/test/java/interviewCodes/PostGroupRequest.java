package interviewCodes;

import java.util.LinkedHashMap;
import java.util.Map;

import org.apache.commons.lang3.builder.ToStringBuilder;


public class PostGroupRequest {
	
	private Integer group_id;
	private String group_ext_id;
	private String group_name;
	private Integer group_parent_id;
	private Integer top_group_id;
	private Integer billing_id;
	private String address;
	private String city;
	private String state;
	private String zip;
	private String phone_number;
	private Integer industry_id;
	public Integer getGroup_id() {
		return group_id;
	}
	public void setGroup_id(Integer group_id) {
		this.group_id = group_id;
	}
	public String getGroup_ext_id() {
		return group_ext_id;
	}
	public void setGroup_ext_id(String group_ext_id) {
		this.group_ext_id = group_ext_id;
	}
	public String getGroup_name() {
		return group_name;
	}
	public void setGroup_name(String group_name) {
		this.group_name = group_name;
	}
	public Integer getGroup_parent_id() {
		return group_parent_id;
	}
	public void setGroup_parent_id(Integer group_parent_id) {
		this.group_parent_id = group_parent_id;
	}
	public Integer getTop_group_id() {
		return top_group_id;
	}
	public void setTop_group_id(Integer top_group_id) {
		this.top_group_id = top_group_id;
	}
	public Integer getBilling_id() {
		return billing_id;
	}
	public void setBilling_id(Integer billing_id) {
		this.billing_id = billing_id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}
	public Integer getIndustry_id() {
		return industry_id;
	}
	public void setIndustry_id(Integer industry_id) {
		this.industry_id = industry_id;
	}
	
	
	
	
	@Override
	public String toString() {
		return new ToStringBuilder(this).append("group_ext_id", group_ext_id).append("group_name", group_name).append("group_parent_id", group_parent_id).append("top_group_id", top_group_id).append("billing_id", billing_id).append("address", address).append("city", city).append("state", state).append("zip", zip).append("phone_number", phone_number).append("industry_id", industry_id).toString();
	}
	
	public Map<String, Object> getMapObject() {
		Map<String,Object> map = new LinkedHashMap<String, Object>();
		map.put("group_id", group_id);
		map.put("group_ext_id", group_ext_id);
		map.put("group_name", group_name);
		map.put("group_parent_id", group_parent_id);
		map.put("top_group_id", top_group_id);
		map.put("billing_id", billing_id);
		map.put("address", address);
		map.put("city", city);
		map.put("state", state);
		map.put("zip", zip);
		map.put("phone_number", phone_number);
		map.put("industry_id", industry_id);	
		return map;
	}

}
