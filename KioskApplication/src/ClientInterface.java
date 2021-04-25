import javax.swing.*;
import java.awt.Color;
import java.awt.Font;  

public class ClientInterface  extends javax.swing.JFrame
{
	private JTextField txtPay;
	private JTextField txtBal;
	private JTextField textField;
     ClientInterface(){  
        JFrame f= new JFrame("CheckBox Example");
        f.setSize(917,581);  
        f.getContentPane().setLayout(null);
        
        JLabel lblNewLabel_1 = new JLabel("Qty");
        lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblNewLabel_1.setBounds(559, 238, 45, 21);
        f.getContentPane().add(lblNewLabel_1);
        
        JSpinner TxtQty = new JSpinner();
        TxtQty.setBounds(657, 241, 70, 20);
        f.getContentPane().add(TxtQty);
        
        JLabel lblNewLabel_2 = new JLabel("Item Name");
        lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblNewLabel_2.setBounds(557, 147, 103, 13);
        f.getContentPane().add(lblNewLabel_2);
        
        txtPay = new JTextField();
        txtPay.setBounds(657, 146, 96, 19);
        f.getContentPane().add(txtPay);
        txtPay.setColumns(10);
        
        txtBal = new JTextField();
        txtBal.setBounds(657, 202, 96, 19);
        f.getContentPane().add(txtBal);
        txtBal.setColumns(10);
        
        JLabel lblNewLabel_3 = new JLabel("Price");
        lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblNewLabel_3.setBounds(559, 203, 70, 13);
        f.getContentPane().add(lblNewLabel_3);
        
        JButton btnNewButton_1 = new JButton("Print Receipt");
        btnNewButton_1.setBounds(639, 353, 99, 59);
        f.getContentPane().add(btnNewButton_1);
        
        textField = new JTextField();
        textField.setBounds(657, 284, 96, 19);
        f.getContentPane().add(textField);
        textField.setColumns(10);
        
        JLabel lblNewLabel_4 = new JLabel("Total");
        lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblNewLabel_4.setBounds(559, 287, 45, 13);
        f.getContentPane().add(lblNewLabel_4);
        
        JButton btnNewButton_2 = new JButton("McChicken");
        btnNewButton_2.setBounds(42, 173, 85, 21);
        f.getContentPane().add(btnNewButton_2);
        
        JButton btnNewButton_3 = new JButton("Ayam goreng McD Spicy (2pcs)");
        btnNewButton_3.setBounds(42, 222, 175, 21);
        f.getContentPane().add(btnNewButton_3);
        
        JButton btnNewButton = new JButton("Ayam Goreng McD Spicy (5pcs)");
        btnNewButton.setBounds(42, 282, 153, 21);
        f.getContentPane().add(btnNewButton);
        
        JButton btnNewButton_4 = new JButton("Chicken McNuggets (6pcs)");
        btnNewButton_4.setBounds(42, 333, 163, 21);
        f.getContentPane().add(btnNewButton_4);
        
        JPanel panel = new JPanel();
        panel.setBackground(Color.CYAN);
        panel.setBounds(10, 10, 883, 85);
        f.getContentPane().add(panel);
        
        JLabel lblNewLabel = new JLabel("Food Ordering System");
        panel.add(lblNewLabel);
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
        f.setVisible(true);  
     }  
public static void main(String args[])  
    {  
    new ClientInterface();  
    }	
}  