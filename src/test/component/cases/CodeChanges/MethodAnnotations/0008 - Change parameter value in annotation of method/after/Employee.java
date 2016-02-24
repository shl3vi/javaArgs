package io.demo;

import io.demo.CustomAnnotationA;

class Employee{

	@CustomAnnotationA(a="bbb")
	public String pleaseTestMe(){
		return "Thank you!";
	}
}