package com.tnsif.exceptionhandling;

public class VoterInfo {
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		
		try {
		AgeValidator.validateAge(age);
		this.age=age;
		}
		
		catch(InvalidAgeException ae) {
			System.out.println(ae.getMessage());
		}
	}
	@Override
	public String toString() {
		return "VoterInfo [name=" + name + ", age=" + age + "]";
	}
	
}