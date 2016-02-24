package io.demo;

import io.demo.CustomAnnotationA;

class Employee{

	public String pleaseTestMe(@CustomAnnotationA(a="bbb" ) int p){
		return "Thank you!";
	}
}