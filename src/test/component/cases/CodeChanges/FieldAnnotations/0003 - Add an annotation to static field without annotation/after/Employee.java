package io.demo;

import io.demo.CustomAnnotationB;

class Employee{

	@CustomAnnotationB(b="bbb")
	private static String n = new String("Thank you!");

	public static String pleaseTestMe(){
		return n;
	}
}