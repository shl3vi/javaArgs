package io.demo;

import io.demo.CustomAnnotationB;

class Employee{

	@CustomAnnotationB(b="bbb")
	public String pleaseTestMe(){
		return "Thank you!";
	}
}