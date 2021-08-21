package coding.concurrency.executor.framework;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

public class FutureTaskMain {
	public static void main(String[] args) {
		MultiplyingTask multiplyingTask1 = new MultiplyingTask(10, 20, 2000l);
		MultiplyingTask multiplyingTask2 = new MultiplyingTask(20, 40, 4000l);

		FutureTask<Integer> futureTask1 = new FutureTask<>(multiplyingTask1);
		FutureTask<Integer> futureTask2 = new FutureTask<>(multiplyingTask2);

		ExecutorService executor = Executors.newFixedThreadPool(2);
		executor.submit(futureTask1);
		executor.submit(futureTask2);

		while (true) {
			try {
				if (!futureTask1.isDone()) {
					System.out.println("FutureTask1 output=" + futureTask1.get());
				}
				if (!futureTask2.isDone()) {
					System.out.println("Waitng for futureTask2 for completion");
					System.out.println("FutureTask2 output=" + futureTask2.get());
				}
				if (futureTask1.isDone() && futureTask2.isDone()) {
					System.out.println("Completed both the FutureTasks, shutting down the executors");
					executor.shutdown();
					return;
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			} catch (ExecutionException e) {
				e.printStackTrace();
			}
		}

	}
}