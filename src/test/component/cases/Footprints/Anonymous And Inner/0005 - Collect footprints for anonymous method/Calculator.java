package io.demo;

public class Calculator {
	private static MathOperation addition;
	private static MathOperation subtraction;
	
	static{
		addition = (int a, int b) -> a + b;
		subtraction = (a, b) -> a - b;
	}
	
	public static int add(int a, int b)
	{
		return addition.execute(a, b);
	}
	
	public static int sub(int a, int b)
	{
		return subtraction.execute(a, b);
	}
	
	interface MathOperation {
		int execute(int a, int b);
	}
}