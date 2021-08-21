package coding.concurrency.general;

public class Sample2Main {
	public static void main(String[] args) {
		Sample2 st = new Sample2();
		Thread t = new Thread(st);
		t.start();
	}
}