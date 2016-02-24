package io.demo;

class DerivedClass extends BaseClass{

	public void doWork(){
		System.out.println("Doing some work :)");
	}
	
	@Override
	public void doMagic(){
		System.out.println("Overriding doMagic())");
	}
}