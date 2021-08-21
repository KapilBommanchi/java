package coding.concurrency.general;

public class SampleThreadSleep {
	public static void main(String[] args) throws InterruptedException {
		long start = System.currentTimeMillis();
		System.out.println("Main thread is going to sleep");
		Thread.sleep(2000);
		System.out.println("Sleep time in ms = " + (System.currentTimeMillis() - start));
	}
}