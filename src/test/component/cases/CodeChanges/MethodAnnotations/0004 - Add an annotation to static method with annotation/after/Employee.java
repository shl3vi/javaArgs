package io.demo;

import io.demo.CustomAnnotationA;
import io.demo.CustomAnnotationB;

class Employee{
	
	@CustomAnnotationA(a="aaa")
	@CustomAnnotationB(b="bbb")
	public static String pleaseTestMe(){
		return "Thank you!";
	}
}