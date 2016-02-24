package io.demo;

import io.demo.IDoWork;
import io.demo.IDoAdditionalWork;

class Employee implements IDoWork, IDoAdditionalWork{
		public void doWork(){
			int a= 10;
		}
		
		public void doAdditionalWork(int a, String s){
			a++;
			s = "Total:" + a;
		}
}