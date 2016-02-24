package io.demo;

class Person {
	private String name;
	private int age;
	
	//Instance initializer
	{
		name = "Anonymous";
		age = 18;
	}
	
	//Parameterless constructor
	public Person()
	{
		age = age + 2;
		name = name + " " + age; 
	}
	
}