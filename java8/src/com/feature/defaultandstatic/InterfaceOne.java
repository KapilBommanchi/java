package com.feature.defaultandstatic;

/**
 * A sample functional interface, it contains only one and only one
 * unimplemented method
 * 
 * @author kapil
 *
 */

@FunctionalInterface
public interface InterfaceOne {
	public void getPing();
	
	default void log(String str){
		System.out.println("logging:: "+str);
	}
	
	static void ping(){
		System.out.println("From InterfaceOne :)");
	}

}
