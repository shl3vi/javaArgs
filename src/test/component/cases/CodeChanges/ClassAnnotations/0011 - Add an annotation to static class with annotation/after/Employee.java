package io.demo;

import io.demo.CustomAnnotationA;
import io.demo.CustomAnnotationB;

class  Employee{
	@CustomAnnotationA(a="aaa")
	@CustomAnnotationB(b="bbb")
	public static class Employee1{

	}	

	public void createFootPrintInStaticClassConstructor(){
		Employee1 e = new Employee1();
	}	
}