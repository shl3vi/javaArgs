package io.demo;

class Person extends Human {
	private String name;
	private int age;
	
	public Person(String _name, int _age, Gender _gender)
	{
		suprt(_gender);
		this.age = _age;
		this.name = _name;
	}
	
}