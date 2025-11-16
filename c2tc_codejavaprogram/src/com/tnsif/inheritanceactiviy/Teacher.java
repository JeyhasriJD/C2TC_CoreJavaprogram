package com.tnsif.inheritanceactiviy;

public class Teacher extends Person {
		private int id;
		private String Designation;
		private String Sesssion;
		
		public Teacher(String name, int age, String city, int id, String designation, String sesssion) {
			super(name, age, city);
			this.id = id;
			Designation = designation;
			Sesssion = sesssion;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getDesignation() {
			return Designation;
		}
		public void setDesignation(String designation) {
			Designation = designation;
		}
		public String getSesssion() {
			return Sesssion;
		}
		public void setSesssion(String sesssion) {
			Sesssion = sesssion;
		}
		@Override
		public String toString() {
			return "Teacher [id=" + id + ", Designation=" + Designation + ", Sesssion=" + Sesssion + "]";
		}
		
}
