package io.demo;

import io.demo.CustomAnnotationA;

class Employee{

	public String pleaseTestMe(@CustomAnnotationA(b="aaa" ) int p){
		return "Thank you!";
	}
}