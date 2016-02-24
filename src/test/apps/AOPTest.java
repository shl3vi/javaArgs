package io.tests;

import static org.junit.Assert.assertEquals;
import io.demo.App;

import org.junit.Test;

 // Unit test for simple App.
public class AppTest 
{
	public static void main(String[] args)
	{
		testLengthOfTheUniqueKey();
	}
	
    @Test
    public void testLengthOfTheUniqueKey() {

		App obj = new App();
		assertEquals(36, obj.generateUniqueKey().length());
	}
}
