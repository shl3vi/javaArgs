package io.demo;
import java.util.function.Supplier;
class Worker{
	
	public void invokeWork(){
		StringSupplier s = () -> "Modified Value!!";
		s.get();
	}
	
	static interface StringSupplier extends Supplier<String>{
		@Override
		String get();
	}
	
}

