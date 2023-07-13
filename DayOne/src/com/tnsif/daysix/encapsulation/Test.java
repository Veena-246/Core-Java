package com.tnsif.daysix.encapsulation;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student();
		s.setName("veena");
		//System.out.println(s.getName());
		s.setStu_id(100);
		//System.out.println(s.getStu_id());
		s.setGrade('A');
		System.out.println(s.getName()+" "+s.getGrade()+" "+s.getStu_id());

	}

}
