package com.collectionEx;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {
	private String stud_name;
	private List<String> subjects;
	private Set<String> phones;
	private Map<String,String> courses;
	
	public String getStud_name() {
		return stud_name;
	}
	public void setStud_name(String stud_name) {
		this.stud_name = stud_name;
	}
	public List<String> getSubjects() {
		return subjects;
	}
	public void setSubjects(List<String> subjects) {
		this.subjects = subjects;
	}
	public Set<String> getPhones() {
		return phones;
	}
	public void setPhones(Set<String> phones) {
		this.phones = phones;
	}
	public Map<String, String> getCourses() {
		return courses;
	}
	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}
	
	public Student(String stud_name, List<String> subjects, Set<String> phones, Map<String, String> courses) {
		super();
		this.stud_name = stud_name;
		this.subjects = subjects;
		this.phones = phones;
		this.courses = courses;
	}
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Student [stud_name=" + stud_name + ", subjects=" + subjects + ", phones=" + phones + ", courses="
				+ courses + "]";
	}
	
}
