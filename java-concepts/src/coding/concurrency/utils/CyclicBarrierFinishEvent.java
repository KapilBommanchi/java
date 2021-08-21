package coding.concurrency.utils;

public class CyclicBarrierFinishEvent implements Runnable {

	@Override
	public void run() {
		System.out.println(
				"As 3 threads have reached common barrier point " + ", CyclicBarrrierFinishEvent has been triggered");
		System.out.println("You can update shared variables if any");
	}

}
