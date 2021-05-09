
public class MultiPrinterApp {
	
	public static void main(String[] args) {
		
		Thread currentTimeThread1 = new CurrentTimeApp();
		Thread currentTimeThread2 = new CurrentTimeApp();
		
		currentTimeThread1.start();
		currentTimeThread2.start();

		}
}
