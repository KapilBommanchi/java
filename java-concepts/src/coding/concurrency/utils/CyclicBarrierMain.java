package coding.concurrency.utils;

import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierMain {
	public static void main(String[] args) {
		/*
		 * Create CountDownLatch with 3 parties, when all 3 parties will reach common
		 * barrier point CyclicBarrrierFinishEvent will be triggered
		 */
		CyclicBarrier cyclicBarrier = new CyclicBarrier(3, new CyclicBarrierFinishEvent());

		CyclicBarrierRunnableTask runnableTask1 = new CyclicBarrierRunnableTask(cyclicBarrier, 1000);
		CyclicBarrierRunnableTask runnableTask2 = new CyclicBarrierRunnableTask(cyclicBarrier, 2000);
		CyclicBarrierRunnableTask runnableTask3 = new CyclicBarrierRunnableTask(cyclicBarrier, 3000);

		// Create and start 3 threads
		new Thread(runnableTask1, "Thread-1").start();
		new Thread(runnableTask2, "Thread-2").start();
		new Thread(runnableTask3, "Thread-3").start();

		/*
		 * We are reusing cyclic barrier using below threads
		 */
		CyclicBarrierRunnableTask runnableTask4 = new CyclicBarrierRunnableTask(cyclicBarrier, 4000);
		CyclicBarrierRunnableTask runnableTask5 = new CyclicBarrierRunnableTask(cyclicBarrier, 5000);
		CyclicBarrierRunnableTask runnableTask6 = new CyclicBarrierRunnableTask(cyclicBarrier, 6000);

		// Create and start 3 more threads
		new Thread(runnableTask4, "Thread-4").start();
		new Thread(runnableTask5, "Thread-5").start();
		new Thread(runnableTask6, "Thread-6").start();

	}
}