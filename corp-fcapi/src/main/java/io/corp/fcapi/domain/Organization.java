package io.corp.fcapi.domain;

import java.util.HashMap;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Organization {

	private String name;
	
	private String founded;
	private Integer approxEmployees;
	private List<String> keywords;
	private HashMap<String, Object> contactInfo;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFounded() {
		return founded;
	}
	public void setFounded(String founded) {
		this.founded = founded;
	}
	public Integer getApproxEmployees() {
		return approxEmployees;
	}
	public void setApproxEmployees(Integer approxEmployees) {
		this.approxEmployees = approxEmployees;
	}
	public List<String> getKeywords() {
		return keywords;
	}
	public void setKeywords(List<String> keywords) {
		this.keywords = keywords;
	}
	public HashMap<String, Object> getContactInfo() {
		return contactInfo;
	}
	public void setContactInfo(HashMap<String, Object> contactInfo) {
		this.contactInfo = contactInfo;
	}
	
	

}
