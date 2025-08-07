package com.tnsif.inheritance.slinheritance;

public class Student extends Citizen{
	private int rollNo;
	private String collegeName;
	
	
	public Student(String name, String address, long adharNumber, long phNo,int rollNo,String collegeName) {
		super(name, address, adharNumber, phNo);
		this.rollNo=rollNo;
		this.collegeName=collegeName;
	}
	
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", collegeName=" + collegeName + ", Name=" + getName()
				+ ", Address(" + getAddress() + ", AdharNumber=" + getAdharNumber() + ", PhNo="
				+ getPhNo() + "]";
	}
	
}