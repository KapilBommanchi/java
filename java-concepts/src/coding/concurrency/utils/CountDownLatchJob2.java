package coding.concurrency.utils;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchJob2 implements Runnable {
	CountDownLatch latch;

	CountDownLatchJob2(CountDownLatch latch) {
		this.latch = latch;
	}

	@Override
	public void run() {
		System.out.println("CountDownLatchJob2");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Done with CountDownLatchJob2");
		latch.countDown();
	}
}