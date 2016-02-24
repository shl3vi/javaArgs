package io.demo;

import io.demo.CustomAnnotationA;

class Employee{

	@CustomAnnotationA(a="aaa")
	public String pleaseTestMe(){
		return "Thank you!";
	}
}