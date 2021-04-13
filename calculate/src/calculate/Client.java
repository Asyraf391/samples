package calculate;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;


public class Client {
	 public static void main(String[] args) throws IOException {
		 
		 
		try {
    	Socket socket = new Socket (InetAddress.getLocalHost(), 4225);
        PrintStream PS = new PrintStream(socket.getOutputStream());
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string to count number of words : ");

       
        String inputStr = scanner.nextLine();

        System.out.println("Total number of words in the string : "+countWords(inputStr));


        InputStreamReader IR = new InputStreamReader(socket.getInputStream());
        BufferedReader BR = new BufferedReader(IR); 
        
        BR.close();
		socket.close();

    } catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
    }
}
	
	  private static int countWords(String input){
	       //6
	        if(input == null)
	            return 1;

	        //7
	        String[] words = input.split("\\s+");

	        //8
	        return words.length;
	    }
}