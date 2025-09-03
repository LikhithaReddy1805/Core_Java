package com.tnsif.collections;

public class Student implements Comparable  {

	private int rollNo;
	private String name;
	private float per;
	
	public Student() {
		
	}

	public Student(int rollNo, String name, float per) {
		this.rollNo = rollNo;
		this.name = name;
		this.per = per;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPer() {
		return per;
	}

	public void setPer(float per) {
		this.per = per;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", per=" + per + "]";
	}

	@Override
	public int compareTo(Object o) {
		Student s2=(Student) o;
		return this.name.compareTo(s2.name);
		//return (int) (this.rollNo - s2.rollNo);

	}
	
	
}