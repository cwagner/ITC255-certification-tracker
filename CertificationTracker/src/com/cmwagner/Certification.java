package com.cmwagner;

import java.util.ArrayList;

public class Certification {
	private String certificationName;
	private ArrayList<String> requiredCourses;
	
	public Certification(String certificationName) {
		this.certificationName = certificationName;
		setRequiredCourses(new ArrayList<String>());
	}
	public String getCertificationName() {
		return certificationName;
	}
	public void setCertificationName(String certificationName) {
		this.certificationName = certificationName;
	}
	public ArrayList<String> getRequiredCourses() {
		return requiredCourses;
	}
	public void setRequiredCourses(ArrayList<String> requiredCourses) {
		this.requiredCourses = requiredCourses;
	}
	public void addRequiredCourse(String courseName) {
		requiredCourses.add(courseName);
	}
}
