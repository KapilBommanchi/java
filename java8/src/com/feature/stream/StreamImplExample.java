package com.feature.stream;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StreamImplExample {
	
	public static void main(String[] args) {
		List<Integer> intList = new ArrayList<>();
		
		for(int i=1; i<=100; i++) intList.add(i);
		
		/** display odd numbers using sequential stream **/
//		Stream<Integer> seqStream = intList.stream().filter(x -> x % 2 != 0);
//		seqStream.forEach(y -> System.out.println("Odd num ::"+y));
		System.out.println(new Date().getTime());
		intList.stream().filter(x -> x % 2 != 0).forEach(x -> System.out.println("val :: "+x));
		System.out.println(new Date().getTime());
		
		/** display odd numbers using parallel stream **/
		System.out.println(new Date().getTime());
		intList.parallelStream().filter(x -> x % 2 != 0).forEach(x -> System.out.println("val :: "+x));
		System.out.println(new Date().getTime());
	}

}
