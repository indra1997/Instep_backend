package com.infy.insteps.entity;

import java.time.LocalDate;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name= "mentor")
public class Mentor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer mentorId;
	private String name;
	private String password;
	private String emailId;
	private String location;
	private String unit;
	private Integer noOfProjectsMentoring;
	
	@ManyToMany
	@JoinTable(
	  name = "projects_mentoring", 
	  joinColumns = @jakarta.persistence.JoinColumn(name = "mentor_id"), 
	  inverseJoinColumns = @jakarta.persistence.JoinColumn(name = "project_id"))
	Set<Project> projectsM;
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
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
	
	public void addProject(Project project) {
		this.projectsM.add(project);
	}
	
	
}
