package com.tnsif.interfacedemo;

public interface Demo {
  int X=10;
  
   void m1();
   
   default void m3() {
	   
   }
   
   static void m4() {
	   
   }
   
   interface IONE{
	  
	   default void m3() {
		   
	   }
	   
   }
   
}