package io.demo;

import io.demo.CustomAnnotationB;

class Employee{

	public String pleaseTestMe(@CustomAnnotationB(a="aaa" ) int p){
		return "Thank you!";
	}
}