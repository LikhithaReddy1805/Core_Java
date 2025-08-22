package com.tnsif.exceptionhandling;

public class ThrowsDemo {

	public static void main(String[] args) {
		StudentInfo s = new StudentInfo();
		s.setName("Bhagya");
		s.setRollNum(2);
		s.setPerc(88.0f);

		s.show();
		
		VoterInfo v1=new VoterInfo();
		v1.setName("Rahul");
		v1.setAge(19);
		System.out.println(v1);
	}

}