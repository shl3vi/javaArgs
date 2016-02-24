package io.demo;

import io.demo.CustomAnnotationB;

class Employee{
	
	public String pleaseTestMe(@CustomAnnotationB(b="bbb") int p){
		return "Thank you!";
	}
}