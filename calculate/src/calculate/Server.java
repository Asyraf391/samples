package calculate;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;


public class Server {


    public static void main(String[] args) throws IOException{
    	
    	ServerSocket serverSocket=null;
    	
    	try {
    		int portNo = 4225;
    		serverSocket = new ServerSocket(portNo);
    		System.out.println("Waiting for request");
    		
    		while (true) {
    			
    		Socket clientSocket = serverSocket.accept();
    		InputStreamReader IR = new InputStreamReader(clientSocket.getInputStream());
            BufferedReader BR = new BufferedReader(IR);
            
    	}


    } catch (IOException ioe) {
    	if (serverSocket != null)
			serverSocket.close();
		
		ioe.printStackTrace();
	
	}

    }

}

