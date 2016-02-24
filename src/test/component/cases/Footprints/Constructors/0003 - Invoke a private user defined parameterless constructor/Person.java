package io.demo;

class Person {
	private Person(){
		int a = 7;
		a++;
	}
	
	public static Person createPerson(){
		return new Person();
	}
}