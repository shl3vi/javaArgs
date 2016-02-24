package io.demo;

class Employee{
	
	
	
	
	
	
	
	
	private MathOperation addition = (int a, int b) -> a + b;
	
	public int getSalary(){
		return addition.operation(100, 200);
	}
	
	interface MathOperation {
      int operation(int a, int b);
	}
}

