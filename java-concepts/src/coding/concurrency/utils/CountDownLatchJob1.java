package coding.concurrency.utils;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchJob1 implements Runnable {
	CountDownLatch latch;

	CountDownLatchJob1(CountDownLatch latch) {
		this.latch = latch;
	}

	@Override
	public void run() {
		System.out.println("CountDownLatchJob1");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Done with CountDownLatchJob1");
		latch.countDown();
	}
}