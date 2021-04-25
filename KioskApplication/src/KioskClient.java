import java.net.*;
import java.io.*;
import java.awt.*;
import java.util.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class KioskClient extends JFrame {
    
    String str;
    ResultSet rs;
    Vector records;
    GridBagLayout gb1;
    GridBagConstraints gbc;
    JScrollPane sp;
    JTextArea result;
    JLabel label;
    JFrame f;
    Publisher pub;
    int i=0;
    ObjectInputStream br = null;
    Socket clientSocket = null;
    
    public KioskClient()
    {
    	
        label = new JLabel("Product Details");
        result = new JTextArea(20,60);
        str = "";
        pub = null;
        records = new Vector();
        gb1 = new GridBagLayout();
        gbc = new GridBagConstraints();
        getContentPane().setLayout(gb1);
        gbc.gridx = 0;
        gbc.gridy = 0;
        getContentPane().add(label,gbc);
          gbc.gridx = 0;
        gbc.gridy = 1;
        sp = new JScrollPane(result);
        getContentPane().add(sp,gbc);
         
   
            try {
                clientSocket = new Socket("localhost",1400);
                  br = new ObjectInputStream(clientSocket.getInputStream());
                  records =(Vector)br.readObject();
                  br.close();
                  result.setText("");
                  int i =0;
                  
                  result.append("ID\tPName\t\tPrice");
                  result.append("\n-----------------------------------------------------------------------\n");
                  
                  
                  while(i < records.size())
                  {
                      pub = (Publisher)records.elementAt(i);
                      str = pub.id;
                      result.append(str + "\t");
                         str = pub.pname;
                      result.append(str + "\t\t");
                           str = pub.price;
                      result.append(str + "\n"); 
                      i++;
                      
            
                      
                  }
                  records.removeAllElements();
                  
                  
                    
            } catch (IOException ex) {
                Logger.getLogger(KioskClient.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
            Logger.getLogger(KioskClient.class.getName()).log(Level.SEVERE, null, ex);
        }
           
        
    }
    public static void main(String[ ] args)
	{
		KioskClient server1=new KioskClient();
      
                server1.setSize(500, 300); 
                server1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                server1.pack(); 
                server1.setVisible(true); 
                
	     }
}