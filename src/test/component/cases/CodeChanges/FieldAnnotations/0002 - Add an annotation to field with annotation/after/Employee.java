package io.demo;

import io.demo.CustomAnnotationA;
import io.demo.CustomAnnotationB;

class Employee{
	
	@CustomAnnotationA(a="aaa")
	@CustomAnnotationB(b="bbb")
	private String n = new String("Thank you!");
	
	public String pleaseTestMe(){
		return this.n;
	}
}