package com.tnsif.constructorexample;

public class Student {
	private int sid;
	private String name;
	
	public Student() {
		this.sid = 100;
		this.name ="MohanKumar";
	}
	
	public Student(int Sid, String Name) {
		this.sid = Sid;
		this.name = Name;
	}
	
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + "]";
	}
	

}
