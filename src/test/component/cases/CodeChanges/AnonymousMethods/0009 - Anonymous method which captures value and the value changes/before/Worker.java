package io.demo;

class Worker{
	
	public void invokeWork(){
		String captureValue = "Kuku";
		Runnable r = () -> System.out.println(captureValue);
		r.run();
	}
	
	
}

