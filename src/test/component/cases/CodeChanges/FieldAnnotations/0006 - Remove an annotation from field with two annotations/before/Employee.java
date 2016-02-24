package io.demo;

import io.demo.CustomAnnotationB;
import io.demo.CustomAnnotationA;

class Employee{

	@CustomAnnotationB(b="aaa")
	@CustomAnnotationA(a="aaa")
	private String n = new String("Thank you!");
	
	public String pleaseTestMe(){
		return this.n;
	}
}