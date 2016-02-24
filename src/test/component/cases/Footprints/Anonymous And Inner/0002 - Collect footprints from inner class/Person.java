package io.demo;

public class Person {
	
	private Address address;
	public Person(){
		address = new Address();
	}
	
	public String getAddress(){
		return address.get();
	}
	
	class Address{
		public String get(){
			return "My address details";
		}
	}
}