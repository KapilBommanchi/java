package coding.concurrency.utils;

import java.util.concurrent.BlockingQueue;

public class ProducerBlockingQueue implements Runnable {
	BlockingQueue queue = null;

	public ProducerBlockingQueue(BlockingQueue queue) {
		super();
		this.queue = queue;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("Produced item " + i);
			try {
				queue.put("item " + i);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}
}
