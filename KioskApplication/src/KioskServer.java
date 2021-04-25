import java.io.*;
import java.sql.*;
import java.net.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class KioskServer extends Thread {

    Statement stmt=null;
    Vector records = new Vector(10,10);
    ResultSet rs = null;
    ServerSocket server = null;
    Socket client = null;
    Connection con = null;
    ObjectOutputStream out =null;
    String str = null;
    Publisher pub = null;
    
    public KioskServer()
    {
        try {
            server = new ServerSocket(1400);
            System.out.println("Starting the Server");
            start();
        } catch (IOException ex) {
            Logger.getLogger(KioskServer.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void run()
    {
        while(true)
        {
            try {
                int CC;
                client = server.accept();
                System.out.println("Connection accepted");   
                out = new ObjectOutputStream(client.getOutputStream());
                System.out.println("OutputStream received");
                try {
                	  Class.forName("com.mysql.cj.jdbc.Driver");
                      con = DriverManager.getConnection("jdbc:mysql://localhost:3307/kioskappdb_dev","root","@Asyraf1997");
                      System.out.println("Remote DB connection established");
                                 
                    stmt = con.createStatement();
                    rs = stmt.executeQuery("select * from itemproduct");
                    records.removeAllElements();

            ResultSetMetaData RSMD = rs.getMetaData();
            CC = RSMD.getColumnCount();

                    while(rs.next())
                    {
                        pub = new Publisher();
                        pub.id = rs.getString(1);
                        pub.pname = rs.getString(2);
                        pub.price = rs.getString(3);
                        records.addElement(pub);
                        System.out.println("row returned");
                    }

                  out.writeObject(records);
                    out.close();
                    System.out.println("String returned");
                    
                    
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(KioskServer.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(KioskServer.class.getName()).log(Level.SEVERE, null, ex);
                }

            } catch (IOException ex) {
                Logger.getLogger(KioskServer.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }
    public static void main(String args[])
{
   new KioskServer(); 

}
}