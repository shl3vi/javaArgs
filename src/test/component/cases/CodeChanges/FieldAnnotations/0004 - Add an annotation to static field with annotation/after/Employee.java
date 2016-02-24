package io.demo;

import io.demo.CustomAnnotationA;
import io.demo.CustomAnnotationB;

class Employee{

	@CustomAnnotationA(a="bbb")
	@CustomAnnotationB(b="bbb")
	private static String n = new String("Thank you!");

	public static String pleaseTestMe(){
		return n;
	}
}