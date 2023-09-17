package com.infy.insteps.dto;

import java.time.LocalDate;

public class candidateDTO {

	private Integer candidateId;
	private String emailId;
	private String alternateEmail;
	private String name;
//	private String qualification;
//	private LocalDate dateOfBirth;
//	private String gender;
	private String mobile;
	private String alternateMobile;
	private String workAuthCountry;
	private String internshipLocation;
	private String geoRegion;
	private String academicLevel;
	private Integer academicYear;
	private Integer cgpa;
	private String academicConcentration;
	private LocalDate expectedGraduationDate;
	private String keySkills;
	private String areaOfInterest;
	private String projectPreference;
	public String getAlternateEmail() {
		return alternateEmail;
	}
	public void setAlternateEmail(String alternateEmail) {
		this.alternateEmail = alternateEmail;
	}
	public String getAlternateMobile() {
		return alternateMobile;
	}
	public void setAlternateMobile(String alternateMobile) {
		this.alternateMobile = alternateMobile;
	}
	public String getWorkAuthCountry() {
		return workAuthCountry;
	}
	public void setWorkAuthCountry(String workAuthCountry) {
		this.workAuthCountry = workAuthCountry;
	}
	public String getInternshipLocation() {
		return internshipLocation;
	}
	public void setInternshipLocation(String internshipLocation) {
		this.internshipLocation = internshipLocation;
	}
	public String getGeoRegion() {
		return geoRegion;
	}
	public void setGeoRegion(String geoRegion) {
		this.geoRegion = geoRegion;
	}
	public String getAcademicLevel() {
		return academicLevel;
	}
	public void setAcademicLevel(String academicLevel) {
		this.academicLevel = academicLevel;
	}
	public Integer getAcademicYear() {
		return academicYear;
	}
	public void setAcademicYear(Integer academicYear) {
		this.academicYear = academicYear;
	}
	public Integer getCgpa() {
		return cgpa;
	}
	public void setCgpa(Integer cgpa) {
		this.cgpa = cgpa;
	}
	public String getAcademicConcentration() {
		return academicConcentration;
	}
	public void setAcademicConcentration(String academicConcentration) {
		this.academicConcentration = academicConcentration;
	}
	public LocalDate getExpectedGraduationDate() {
		return expectedGraduationDate;
	}
	public void setExpectedGraduationDate(LocalDate expectedGraduationDate) {
		this.expectedGraduationDate = expectedGraduationDate;
	}
	public String getKeySkills() {
		return keySkills;
	}
	public void setKeySkills(String keySkills) {
		this.keySkills = keySkills;
	}
	public String getAreaOfInterest() {
		return areaOfInterest;
	}
	public void setAreaOfInterest(String areaOfInterest) {
		this.areaOfInterest = areaOfInterest;
	}
	public String getProjectPreference() {
		return projectPreference;
	}
	public void setProjectPreference(String projectPreference) {
		this.projectPreference = projectPreference;
	}

	
	public Integer getCandidateId() {
		return candidateId;
	}
	public void setCandidateId(Integer candidateId) {
		this.candidateId = candidateId;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
//	public LocalDate getDateOfBirth() {
//		return dateOfBirth;
//	}
//	public void setDateOfBirth(LocalDate dateOfBirth) {
//		this.dateOfBirth = dateOfBirth;
//	}
//	public String getGender() {
//		return gender;
//	}
//	public void setGender(String gender) {
//		this.gender = gender;
//	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
//	public String getQualification() {
//		return qualification;
//	}
//	public void setQualification(String qualification) {
//		this.qualification = qualification;
//	}
	
}