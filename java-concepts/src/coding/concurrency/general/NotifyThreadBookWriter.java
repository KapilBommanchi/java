package coding.concurrency.general;

public class NotifyThreadBookWriter implements Runnable {

	Book book;

	public NotifyThreadBookWriter(Book book) {
		super();
		this.book = book;
	}

	@Override
	public void run() {
		synchronized (book) {
			System.out.println("Author is Starting book : " + book.getTitle());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			book.setCompleted(true);
			System.out.println("Book has been completed now");

			book.notify();
			System.out.println("notify one reader");

		}
	}
}
