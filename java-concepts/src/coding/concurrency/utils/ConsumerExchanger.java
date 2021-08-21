package coding.concurrency.utils;

import java.util.concurrent.Exchanger;

public class ConsumerExchanger implements Runnable {
	Exchanger<Country> ex;

	ConsumerExchanger(Exchanger<Country> ex) {
		this.ex = ex;
	}

	@Override
	public void run() {
		for (int i = 0; i < 2; i++) {
			try {
				// Getting Country object from producer thread
				// giving dummy country object in return
				Country country = ex.exchange(new Country("Dummy"));
				System.out.println("Got country object from Producer thread : " + country.getCountryName());

			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
	}
}
