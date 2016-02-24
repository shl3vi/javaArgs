package io.demo;

import io.demo.CustomAnnotationA;

class Employee{
	
	@CustomAnnotationA(b="aaa")
	private String n = new String("Thank you!");
	
	public String pleaseTestMe(){
		return this.n;
	}
}