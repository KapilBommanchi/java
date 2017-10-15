package com.exception.type;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * sample example for concurrent modification over collection
 * 
 * @author kapil
 *
 */
public class ConcurrentModificationExample {
	public static void main(String args[]) {
		/** List Example **/
		List<String> str_list = new ArrayList<String>();
		str_list.add("abc");
		str_list.add("efg");
		str_list.add("hij");
		str_list.add("klm");
		str_list.add("nop");

		Iterator<String> itr = str_list.iterator();
		while (itr.hasNext()) {
			String value = itr.next();
			System.out.println("List Value:" + value);
			if (value.equals("efg")) {
				str_list.remove(value); // throws exception after this step
				// use iterator remove in avoiding above exception
			}
		}

		/** Map Example **/
		Map<String, String> str_map = new HashMap<String, String>();
		str_map.put("1", "1");
		str_map.put("2", "2");
		str_map.put("3", "3");

		Iterator<String> it1 = str_map.keySet().iterator();
		while (it1.hasNext()) {
			String key = it1.next();
			System.out.println("Map Value:" + str_map.get(key));
			if (key.equals("2")) {
				str_map.put("1", "4"); // throws exception after iteration all
										// the first 3 elements iterated
			}
		}

	}
}
