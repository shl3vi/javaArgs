package io.demo;

import io.demo.CustomAnnotationA;

class Employee{

	@CustomAnnotationA(a="bbb")
	private static String n = new String("Thank you!");

	public static String pleaseTestMe(){
		return n;
	}
}