package io.demo;

import io.demo.CustomAnnotationA;

class  Employee{
	@CustomAnnotationA(a="aaa")
	public static class Employee1{

	}	

	public void createFootPrintInStaticClassConstructor(){
		Employee1 e = new Employee1();
	}	
}