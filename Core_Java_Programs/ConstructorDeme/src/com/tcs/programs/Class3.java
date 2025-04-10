package com.tcs.programs;

interface Class3 {

	

	void first();
	
	 default void begin() {
	  System.out.println("default interface method");
	  }
	 static void end(){
		 System.out.println("static interface method");
		 }
	

}
