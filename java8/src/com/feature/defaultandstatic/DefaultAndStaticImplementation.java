package com.feature.defaultandstatic;

public class DefaultAndStaticImplementation implements InterfaceOne, InterfaceTwo {

	@Override
	public void getPing2() {
	}

	@Override
	public void getPing() {
	}

	@Override
	public void log(String str) { // if wont override, then compilation error
		// either call interface methods (i.e. InterfaceOne.log("abc")
		// or own implementation
	}

}
