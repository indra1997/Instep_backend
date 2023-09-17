package com.infy.insteps.entity;

import java.time.LocalDate;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name= "project")
public class Project {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer projectId;
	private String title;
	private String description;
	private String requiredSkills;
	private String location;
	private String status;
	private Integer mentorId;
	private Integer mentorsAllocated;
	
	

	@ManyToMany(mappedBy = "projectsM")
	Set<Mentor> mentr;
	
	public Integer getMentorsAllocated() {
		return mentorsAllocated;
	}
	public void setMentorsAllocated(Integer mentorsAllocated) {
		this.mentorsAllocated = mentorsAllocated;
	}
	public Integer getMentorId() {
		return mentorId;
	}
	public void setMentorId(Integer mentorId) {
		this.mentorId = mentorId;
	}
	
	public Set<Mentor> getMentr() {
		return mentr;
	}
	public void setMentr(Set<Mentor> mentr) {
		this.mentr = mentr;
	}
	public Integer getProjectId() {
		return projectId;
	}
	public void setProjectId(Integer projectId) {
		this.projectId = projectId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getRequiredSkills() {
		return requiredSkills;
	}
	public void setRequiredSkills(String requiredSkills) {
		this.requiredSkills = requiredSkills;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	public void addMentor(Mentor mentor) {
		this.mentr.add(mentor);
	}
}
