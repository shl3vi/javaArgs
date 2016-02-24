package test.apps;

public class Calculator {

	public int add(int a, int b)
	{
		return a+b;
	}
	
	public int mul(int a, int b)
	{
		return a*b;
	}
	
	public int divide(int a, int b)
	{
		if (b== 0)
			throw new IllegalArgumentException();
		else if( b < 0){
			//Do nothing. just check how corbeture behaves.
			int c=b;
			c++;
			c = b;
		}
		
		return a/b;
	}
	
	public int sub(int a, int b)
	{
		return a-b;
	}
}
