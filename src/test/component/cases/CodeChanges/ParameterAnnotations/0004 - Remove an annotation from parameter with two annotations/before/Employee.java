package io.demo;

import io.demo.CustomAnnotationA;
import io.demo.CustomAnnotationB;

class Employee{
	
	public String pleaseTestMe(@CustomAnnotationA(a="aaa") @CustomAnnotationB(b="bbb") int p){
		return "Thank you!";
	}
}