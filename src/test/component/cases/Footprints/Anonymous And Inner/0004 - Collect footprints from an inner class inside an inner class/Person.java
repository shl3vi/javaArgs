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
		
		private Street street;
		Address(){
			street = new Street("2/4");
		}
		
		public String get(){
			return street.get() +", Arad";
		}
		
		class Street{
			String number;
			public Street(String houseNumber){
				this.number = houseNumber;
			}
			public String get(){
				return "Sesame street, " + this.number;
			}
		}
	}
}