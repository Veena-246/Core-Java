package com.tnsif.daysix.encapsulation;

public class Student {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
		private int stu_id;
		private String name;
		private char grade;

		public int getStu_id() {
			return stu_id;
		}
		public void setStu_id(int stu_id) {
			this.stu_id=stu_id;
		

	}
		public String getName() {
		     return name;   

}
		public void setName(String name) {
			this.name=name;
		}
		public char getGrade() {
			return grade;
		}
		public void setGrade(char grade) {
			this.grade=grade;
		}
}
