package io.demo;

import io.demo.CustomAnnotationA;

class Employee{
	
	public String pleaseTestMe(@CustomAnnotationA(a="aaa") int p){
		return "Thank you!";
	}
}