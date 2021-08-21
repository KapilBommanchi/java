package coding.concurrency.utils;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchJob3 implements Runnable {
	CountDownLatch latch;

	CountDownLatchJob3(CountDownLatch latch) {
		this.latch = latch;
	}

	@Override
	public void run() {
		System.out.println("CountDownLatchJob3");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Done with CountDownLatchJob3");
		latch.countDown();
	}
}
