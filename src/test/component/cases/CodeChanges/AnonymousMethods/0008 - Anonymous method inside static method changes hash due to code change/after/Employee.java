package io.demo;

class Employee{
	
	public static int getSalary(){
		MathOperation addition = (int a, int b) -> a * b;
		return addition.operation(100, 200);
	}
	
	interface MathOperation {
      int operation(int a, int b);
	}
}

