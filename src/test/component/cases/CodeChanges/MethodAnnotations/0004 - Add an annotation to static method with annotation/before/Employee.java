package io.demo;

import io.demo.CustomAnnotationA;

class Employee{

	@CustomAnnotationA(a="aaa")
	public static String pleaseTestMe(){
		return "Thank you!";
	}
}