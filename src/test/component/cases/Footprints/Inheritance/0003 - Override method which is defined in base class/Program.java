package io.demo;

import io.demo.BaseClass;
import io.demo.DerivedClass;

class Program{
	public static void main(String[] args){
		BaseClass dc = new DerivedClass();
		dc.doMagic();
	}
}