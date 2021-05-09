public class MultiPrinterApp {

public static void main(String[] args) {

	Runnable wordPrinter1 = new SuspendingThread();
	Runnable wordPrinter2 = new SuspendingThread();
	
	// Create objects of thread with name
	Thread printerThread1 = new Thread(wordPrinter1, "Word1");
	Thread printerThread2 = new Thread(wordPrinter2);
	printerThread2.setName("Word2");
	
	printerThread2.start();
	printerThread1.start();
	
}
}