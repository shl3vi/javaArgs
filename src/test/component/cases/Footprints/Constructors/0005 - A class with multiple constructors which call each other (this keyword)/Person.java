package io.demo;

class Person {
	private String name;
	private int age;
	
	public Person()
	{
		this("");
	}
	
	public Person(String name)
	{
		this(name, 20);
	}
	
	public Person(String name, int age)
	{
		this.name = name;
		this.age = age;
	}

	public void sayMyName(){
		System.out.println("Hello " + this.name);
	}
}