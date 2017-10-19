package com.feature.defaultandstatic;

/**
 * A sample functional interface
 * 
 * @author kapil
 *
 */

@FunctionalInterface
public interface InterfaceTwo {
	public void getPing2();
	
	default void log(String str){
		System.out.println("logging:: "+str);
	}

	static void ping2(){
		System.out.println("From InterfaceOne :)");
	}

}
