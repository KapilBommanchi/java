package coding.concurrency.concurrent.exception;

public class CpuIntensiveTask implements Runnable {

	@Override
	public void run() {
		System.out.println("Thread is : " + Thread.currentThread().getName());
	}

}
