package com.tnsif.packageone;

public  class Person {
private String personName;
private String personCity;
private int personAge;

public String getPersonName() {
	return personName;
}
public void setPersonName(String personName) {
	this.personName = personName;
}
public String getPersonCity() {
	return personCity;
}
public void setPersonCity(String personCity) {
	this.personCity = personCity;
}
public int getPersonAge() {
	return personAge;
}
public void setPersonAge(int personAge) {
	this.personAge = personAge;
}
@Override
public String toString() {
	return "Person [personName=" + personName + ", personCity=" + personCity + ", personAge=" + personAge + "]";
}
public Person() {
	
}
public Person(String personName, String personCity, int personAge) {
	this.personName = personName;
	this.personCity = personCity;
	this.personAge = personAge;
}

	
}