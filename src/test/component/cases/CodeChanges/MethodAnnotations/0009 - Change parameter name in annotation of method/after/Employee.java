package io.demo;

import io.demo.CustomAnnotationA;

class Employee{

	@CustomAnnotationA(b="aaa")
	public String pleaseTestMe(){
		return "Thank you!";
	}
}