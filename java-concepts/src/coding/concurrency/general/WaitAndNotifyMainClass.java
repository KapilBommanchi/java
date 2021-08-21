package coding.concurrency.general;

public class WaitAndNotifyMainClass {
	public static void main(String args[]) {
		// Book object on which wait and notify method will be called
		Book book = new Book("The Alchemist");
		WaitThreadBookReader johnReader = new WaitThreadBookReader(book);
		WaitThreadBookReader arpitReader = new WaitThreadBookReader(book);

		// BookReader threads which will wait for completion of book
		Thread johnThread = new Thread(johnReader, "John");
		Thread arpitThread = new Thread(arpitReader, "Arpit");

		arpitThread.start();
		johnThread.start();

		// To ensure both readers started waiting for the book
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		// BookWriter thread which will notify once book get completed
		NotifyThreadBookWriter bookWriter = new NotifyThreadBookWriter(book);
		Thread bookWriterThread = new Thread(bookWriter);
		bookWriterThread.start();

	}
}