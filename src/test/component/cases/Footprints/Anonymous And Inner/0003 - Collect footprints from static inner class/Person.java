package io.demo;

public class Person {
	
	public String getAddress(){
		return Address.create("Sesame street", 2);
	}
	
	static class Address{
		public static String create(String street, int number){
			return street + " " +number;
		}
	}
}