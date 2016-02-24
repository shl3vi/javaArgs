package io.demo;

import io.demo.CustomAnnotationA;

class Employee{

	private String n = new String("Thank you!");
	
	public String pleaseTestMe(){
		String myString = new String((@CustomAnnotationA(info = "aaa") String) n);

		return myString;
	}
} 