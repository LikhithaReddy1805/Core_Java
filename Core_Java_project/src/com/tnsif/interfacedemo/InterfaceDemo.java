package com.tnsif.interfacedemo;

import com.tnsif.packageone.Person;

public class InterfaceDemo implements Demo, Demo1 {

	@Override
	public void m2() {
		
	}

	@Override
	public void m1() {
			
	}
public static void main(String args[]) {
	Demo d=new InterfaceDemo();
}
}