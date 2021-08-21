package coding.concurrency.utils;

import java.util.concurrent.BlockingQueue;

public class ConsumerBlockingQueue implements Runnable {
	BlockingQueue queue = null;

	public ConsumerBlockingQueue(BlockingQueue queue) {
		super();
		this.queue = queue;
	}

	@Override
	public void run() {
		while (true) {
			try {
				System.out.println("Consumed " + queue.take());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
