package coding.concurrency.utils;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchJobMain {
	public static void main(String[] args) {
		try {
			CountDownLatch latch = new CountDownLatch(3);
			CountDownLatchJob1 job1 = new CountDownLatchJob1(latch);
			CountDownLatchJob2 job2 = new CountDownLatchJob2(latch);
			CountDownLatchJob3 job3 = new CountDownLatchJob3(latch);

			Thread job1Thread = new Thread(job1);
			job1Thread.start();

			Thread job2Thread = new Thread(job2);
			job2Thread.start();

			Thread job3Thread = new Thread(job3);
			job3Thread.start();

			// Main thread will wait until above threads get completed
			latch.await();

			System.out.println("Jobs has been completed, main thread can proceed now");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}