package coding.concurrency.executor.framework;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class NewCachedThreadPoolMain {
	public static void main(String args[]) {
		// Getting instance of ThreadPoolExecutor using Executors.newCachedThreadPool
		// factory method
		ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) Executors.newCachedThreadPool();

		for (int i = 1; i <= 10; i++) {
			FetchDataFromFile fdff = new FetchDataFromFile("File :" + i);
			System.out.println("A new file has been added to read : " + fdff.getFileName());
			threadPoolExecutor.execute(fdff);
		}
		threadPoolExecutor.shutdown();
	}
}