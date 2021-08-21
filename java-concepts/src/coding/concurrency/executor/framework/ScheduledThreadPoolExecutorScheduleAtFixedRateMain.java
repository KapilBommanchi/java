package coding.concurrency.executor.framework;

import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledThreadPoolExecutorScheduleAtFixedRateMain {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Current Time = " + new Date());
		// Created ScheduledThreadPoolExecutor object
		ScheduledExecutorService scheduledThreadPool = Executors.newScheduledThreadPool(3);

		for (int i = 1; i <= 3; i++) {
			Thread.sleep(2000);
			ScheduledThreadPoolExecutor task = new ScheduledThreadPoolExecutor("Task " + i);
			scheduledThreadPool.scheduleAtFixedRate(task, 5, 10, TimeUnit.SECONDS);
		}

		// Adding some delay
		Thread.sleep(15000);

		scheduledThreadPool.shutdown();
		while (!scheduledThreadPool.isTerminated()) {
			// wait for all tasks to finish
		}
		System.out.println("Completed all threads");
	}
}
