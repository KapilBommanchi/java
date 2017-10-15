package com.features.type;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

/**
 * sample example for Iterable for each
 * 
 * @author kapil
 *
 */
public class IterableForEachExample {

	public static void main(String[] args) {
		/** 1. Foreach List Example **/
		// creating sample list
		List<Integer> myList = new ArrayList<Integer>();
		for (int i = 0; i <= 10; i++) {
			myList.add(i);
		}

		// traversing through forEach method of Iterable with anonymous class
		// reusable logic
		myList.forEach(new Consumer<Integer>() {
			@Override
			public void accept(Integer t) {
				// TODO Auto-generated method stub
				System.out.println("forEach class Value::" + t);
			}
		});

		// traversing with Consumer interface implementation
		MyConsumer action = new MyConsumer();
		myList.forEach(action);

		/** 2. traversing Map **/
		Map<String, Integer> myMap = new HashMap<>();
		for (int i = 0; i < 10; i++) {
			myMap.put("a" + i, i);
		}

		// printing map entry set (i.e. key and value) using forEach
		myMap.forEach((k, v) -> System.out.println("key:: " + k + " value:: " + v));
	}
}

// Consumer implementation that can be reused
class MyConsumer implements Consumer<Integer> {
	@Override
	public void accept(Integer t) {
	}
}
