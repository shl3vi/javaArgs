package io.demo;

import io.demo.CustomAnnotationB;

class Employee{

	@CustomAnnotationB(b="aaa")
	private String n = new String("Thank you!");
	
	public String pleaseTestMe(){
		return this.n;
	}
}