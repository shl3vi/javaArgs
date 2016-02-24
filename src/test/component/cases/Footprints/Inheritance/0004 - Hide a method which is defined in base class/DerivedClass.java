package io.demo;

class DerivedClass extends BaseClass{
	
	public static void methodToHide() {
        System.out.println("The static method in DerivedClass");
    }
}