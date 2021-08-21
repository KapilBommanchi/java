package coding.concurrency.executor.framework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceNewFixedThreadPoolMain {
	public static void main(String args[]) {
		ExecutorService es = Executors.newFixedThreadPool(3);

		for (int i = 1; i <= 6; i++) {
			ExecutorServiceNewFixedThreadPool loopTask = new ExecutorServiceNewFixedThreadPool("LoopTask " + i);
			es.submit(loopTask);
		}
		es.shutdown();
	}
}