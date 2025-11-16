package com.tnsif.day5.inheritanceexample;

public class Student extends College {
	private int Sid;
	private String Sname;
	private String Course;
	
	public Student(String collegeName, String location, int sid, String sname, String course) {
		super(collegeName, location);
		Sid = sid;
		Sname = sname;
		Course = course;
	}
	
	public int getSid() {
		return Sid;
	}
	public void setSid(int sid) {
		Sid = sid;
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
		return "Student [Sid=" + Sid + ", Sname=" + Sname + ", Course=" + Course + ", CollegeName:" + super.getCollegeName() + ", Location:" + super.getLocation() +"]";
	}
	

}
