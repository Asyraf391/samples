
public class SuspendingThread implements Runnable {
	
	public void printWords (String currentThread)  {
		try {
		
		String[] word = { "It ", "is ", "recommended ", "to ", "use ", "Calendar ", "class" };
		
		for (String text : word) {
			
		    System.out.println(currentThread + "->"+ text);
		    
		    //suspending thread
		    Thread.sleep(5000);

		}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	@Override
	public void run() {
		
		Thread currentThread = Thread.currentThread();
		printWords( currentThread.getName());
	}
	}


