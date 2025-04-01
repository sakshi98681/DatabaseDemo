package com.tka.entity;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity

public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private int studid;

	public Student() {

	}

	@Override
	public String toString() {
		return "Student [studid=" + studid + ", name=" + name + ", course=" + course + "]";
	}

	public int getStudid() {
		return studid;
	}

	public void setStudid(int studid) {
		this.studid = studid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public Student(int studid, String name, String course) {
		super();
		this.studid = studid;
		this.name = name;
		this.course = course;
	}

	private String name;
	private String course;

}
