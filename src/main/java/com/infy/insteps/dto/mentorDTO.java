package com.infy.insteps.dto;



public class mentorDTO {
	
	private Integer mentorId;
	private String name;
	private String password;
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	private String emailId;
	private String location;
	private String unit;
	private Integer noOfProjectsMentoring;
	public Integer getMentorId() {
		return mentorId;
	}
	public void setMentorId(Integer mentorId) {
		this.mentorId = mentorId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	public Integer getNoOfProjectsMentoring() {
		return noOfProjectsMentoring;
	}
	public void setNoOfProjectsMentoring(Integer noOfProjectsMentoring) {
		this.noOfProjectsMentoring = noOfProjectsMentoring;
	}
	
	
}
