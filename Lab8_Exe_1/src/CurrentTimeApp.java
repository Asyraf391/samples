import java.util.Date;

public class CurrentTimeApp extends Thread  {
	
	public void printCurrentTime () {
	
		Date today = new Date();
	
		for (int counter = 0; counter < 5; counter++) {

			Date currentTime = new java.sql.Time(today.getTime()); System.out.println("current time: " + currentTime);
		}
	}

	public void run() {
	
		printCurrentTime();
	}

}
