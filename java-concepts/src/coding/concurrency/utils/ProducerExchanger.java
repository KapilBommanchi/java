package coding.concurrency.utils;

import java.util.concurrent.Exchanger;

public class ProducerExchanger implements Runnable {

	Exchanger<Country> ex;

	ProducerExchanger(Exchanger<Country> ex) {
		this.ex = ex;
	}

	@Override
	public void run() {
		for (int i = 0; i < 2; i++) {
			Country country = null;
			if (i == 0)
				country = new Country("India");
			else
				country = new Country("Bhutan");

			try {
				// exchanging with an dummy Country object
				Country dummyCountry = ex.exchange(country);
				System.out.println("Got country object from Consumer thread : " + dummyCountry.getCountryName());
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
	}
}
