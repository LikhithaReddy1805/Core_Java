package com.tnsif.exceptionhandling;

public class StudentInfo {
  private int rollNum;
  private String name;
  private float perc;
public int getRollNum() {
	return rollNum;
}
public void setRollNum(int rollNum) {
	this.rollNum = rollNum;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public float getPerc() {
	return perc;
}
public void setPerc(float perc) {
	this.perc = perc;
}
  
public void show()
{
	try
	{
		PercentageValidator.isValidPercentage(perc);
		System.out.println("Student details : ");
		System.out.println("RollNo : "+rollNum+"\tName : "+name+"\tPer : "+perc);
	}
	catch(ArithmeticException e)
	{
		System.out.println("Invalid Percentage");
		System.out.println(e.getMessage());
	}
}

  
}