package coding.concurrency.concurrent.exception;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ConcurrentModificationEx {
	public static void main(String[] args) {

		List<String> names = new ArrayList<>();
		names.add("A");
		names.add("B");
		names.add("C");
		names.add("D");
		names.add("E");

// for (String val : names) {
// System.out.println(val);
// names.remove("B");
// }

		Iterator<String> iterator = names.iterator();

		while (iterator.hasNext()) {
			String val = iterator.next();
			if ("C".equals(val)) {
				iterator.remove();
			}
		}
		names.add("F");
		System.out.println(names);




		List<String> listOfBooks = new ArrayList<>();
		listOfBooks.add("Programming Pearls");
		listOfBooks.add("Clean Code");
		listOfBooks.add("Effective Java");
		listOfBooks.add("Code Complete");

		System.out.println("List before : " + listOfBooks);
		for (int i = 0; i < listOfBooks.size(); i++) {
			String book = listOfBooks.get(i);
			if (book.contains("Programming")) {
				System.out.println("Removing " + book);
				listOfBooks.remove(i); // will not throw CME, because we are using generic for loop
			}
		}

		for (String book : listOfBooks) {
			if (book.contains("Code")) {
				listOfBooks.remove(book); // will throw CME, because we are using foreach
			}
		}
		System.out.println("List after : " + listOfBooks);
	}
}
