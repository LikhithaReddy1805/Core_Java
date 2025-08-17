package com.tnsif.packageone;

public class Executor {

	public static void main(String[] args) {
		Base b=new Base();
		b.varDefault=12;
		b.varProtected=13;
		b.varPublic=14;
		b.methodProtected();
		b.methodPublic();
		b.methodDefault();

	}

}