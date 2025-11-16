package com.tnsif.inheritanceactiviy;

public class Student extends Person {
	private int sid;
	private String Sname;
	private String Course;
	
	public Student(String name, int age, String city, int sid, String sname, String course) {
		super(name, age, city);
		this.sid = sid;
		Sname = sname;
		Course = course;
	}
	
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return Sname;
	}
	public void setSname(String sname) {
		Sname = sname;
	}
	public String getCourse() {
		return Course;
	}
	public void setCourse(String course) {
		Course = course;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", Sname=" + Sname + ", Course=" + Course + "]";
	}
	
}
