package coding.concurrency.utils;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumerBlockingQueueMain {
	public static void main(String args[]) {
		BlockingQueue queue = new ArrayBlockingQueue(5);
		ProducerBlockingQueue producer = new ProducerBlockingQueue(queue);
		ConsumerBlockingQueue consumer = new ConsumerBlockingQueue(queue);
		new Thread(producer).start();
		new Thread(consumer).start();
	}
}
