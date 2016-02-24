package io.demo;

import io.demo.IDoWork;

class Program{
	public static void main(String[] args){
		IDoWork dw = new IDoWork(){
			@Override
			public void doWork(){
				System.out.println("Doing some work in my anonymous class");
			}
		};
		
		IDoWork dw2 = new IDoWork(){
			@Override
			public void doWork(){
				System.out.println("This is another doWork() method");
			}
		};
		
		dw.doWork();
		dw2.doWork();
		foo();
	}
	
	static void foo(){
		System.out.println("This is foo()");
	}
}