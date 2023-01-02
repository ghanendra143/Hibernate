package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="StudentRecords")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int studId;
	private String studName;
	private String course;
	private int studAge;
	
	public int getStudId() {
		return studId;
	}
	public void setStudId(int studId) {
		this.studId = studId;
	}
	public String getStudName() {
		return studName;
	}
	public void setStudName(String studName) {
		this.studName = studName;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public int getStudAge() {
		return studAge;
	}
	public void setStudAge(int studAge) {
		this.studAge = studAge;
	}
	
	public Student(int studId, String studName, String course, int studAge) {
		super();
		this.studId = studId;
		this.studName = studName;
		this.course = course;
		this.studAge = studAge;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [studId=" + studId + ", studName=" + studName + ", course=" + course + ", studAge=" + studAge
				+ "]";
	}
	
}
