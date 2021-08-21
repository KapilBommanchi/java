package coding.concurrency.executor.framework;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolExecutorUsingConstructorMain {
	public static void main(String args[]) {

		// Wait queue is used to store waiting task
		BlockingQueue queue = new LinkedBlockingQueue(4);

		// Thread factory to create new threads
		ThreadFactory threadFactory = Executors.defaultThreadFactory();

		// Rejection handler in case task get rejected
		RejectTaskHandler rth = new RejectTaskHandler();
		// ThreadPoolExecutor constructor to create its instance
		ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 2, 10L, TimeUnit.MILLISECONDS, queue,
				threadFactory, rth);
		for (int i = 1; i <= 10; i++) {
			FetchDataFromFile fdff = new FetchDataFromFile("File " + i);
			System.out.println("A new file has been added to read : " + fdff.getFileName());
			// Submitting task to executor
			threadPoolExecutor.execute(fdff);
			threadPoolExecutor.submit(fdff);
		}
		threadPoolExecutor.shutdown();
	}
}