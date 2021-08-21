package coding.concurrency.executor.framework;

public class ExecutorServiceNewFixedThreadPool implements Runnable {
	private String loopTaskName;

	public ExecutorServiceNewFixedThreadPool(String loopTaskName) {
		super();
		this.loopTaskName = loopTaskName;
	}

	@Override
	public void run() {
		System.out.println("Starting " + loopTaskName);
		for (int i = 1; i <= 10; i++) {
			System.out.println("Executing " + loopTaskName + " with " + Thread.currentThread().getName() + "====" + i);
		}
		System.out.println("Ending " + loopTaskName);
	}
}