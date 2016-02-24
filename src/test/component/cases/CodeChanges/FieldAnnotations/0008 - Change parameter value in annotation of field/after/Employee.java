package io.demo;

import io.demo.CustomAnnotationA;

class Employee{
	
	@CustomAnnotationA(a="bbb")
	private String n = new String("Thank you!");
	
	public String pleaseTestMe(){
		return this.n;
	}
}