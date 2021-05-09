public class WordPrinter implements Runnable {

public void printWords (String currentThread)  {
	
	String[] word = { "It ", "is ", "recommended ", "to ", "use ", "Calendar ", "class" };
	//String phrase = String.join("", words);

	for (String text : word) {
		
	    System.out.println(currentThread + "->"+ text);
	}
}
	
@Override
public void run() {
	
	Thread currentThread = Thread.currentThread();
	printWords( currentThread.getName());
}
}