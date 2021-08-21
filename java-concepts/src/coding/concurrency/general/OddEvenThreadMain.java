package coding.concurrency.general;

public class OddEvenThreadMain {
	public static void main(String[] args) {

		OddEvenThread oddRunnable = new OddEvenThread(1);
		OddEvenThread evenRunnable = new OddEvenThread(0);

		Thread t1 = new Thread(oddRunnable, "Odd");
		Thread t2 = new Thread(evenRunnable, "Even");

		t1.start();
		t2.start();

	}
}
