package coding.concurrency.general;

public class WaitThreadBookReader implements Runnable {

	Book book;

	public WaitThreadBookReader(Book book) {
		super();
		this.book = book;
	}

	@Override
	public void run() {
		synchronized (book) {
			System.out.println(
					Thread.currentThread().getName() + " is waiting for the book to be completed: " + book.getTitle());
			try {
				book.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + ": Book has been completed now!! you can read it");
		}
	}
}