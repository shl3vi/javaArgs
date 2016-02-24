package io.demo;

class DerivedClass extends BaseClass{

	@Override
	public void doMagic(){
		System.out.println("Overriding doMagic())");
		super.doMagic();
	}
}