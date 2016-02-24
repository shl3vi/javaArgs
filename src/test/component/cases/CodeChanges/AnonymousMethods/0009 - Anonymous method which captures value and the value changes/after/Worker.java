package io.demo;

class Worker{
	
	public void invokeWork(){
		String captureValue = "Different value!!";
		Runnable r = () -> System.out.println(captureValue);
		r.run();
	}
	
	
}

