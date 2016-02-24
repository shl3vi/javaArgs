package io.demo;

import io.demo.Person;

class Employee extends Person{

	@Override()
	public void sayHello(){
		String a = "Employee is overriding Person's implementation. Yessssssssss!";
		super.sayHello();
	}
}