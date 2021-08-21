package coding.concurrency.utils;

import java.util.concurrent.Exchanger;

public class ExchangerMain {
	public static void main(String[] args) {
		Exchanger<Country> exchanger = new Exchanger<>();
		// Starting two threads
		new Thread(new ProducerExchanger(exchanger)).start();
		new Thread(new ConsumerExchanger(exchanger)).start();
	}
}
