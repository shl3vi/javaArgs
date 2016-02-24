package io.demo;
import java.util.function.Supplier;
class Worker{
	
	public void invokeWork(){
		StringSupplier s = () -> "Kuku";
		s.get();
	}
	
	static interface StringSupplier extends Supplier<String>{
		@Override
		String get();
	}
	
}

