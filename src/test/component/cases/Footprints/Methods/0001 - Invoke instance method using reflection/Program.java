package io.demo;

import io.demo.Person;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class Program{
	public static void main(String[] args){
		Person p = new Person();
		
		try{
			Method method = p.getClass().getMethod("myInstanceMethod");
			method.invoke(p);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}