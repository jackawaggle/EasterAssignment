package EasterAssignment;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Study extends JFrame  
	{

	JCheckBox checkbox;
   JButton button1;
   JButton button2;  
   JTextField textfield;
   JLabel label;
   
   // constructor
   	Study(String title)
   	{
		  super(title);
		  setSize(300,300);
		  getContentPane().setLayout(new FlowLayout());
		  label = new JLabel("Enter time spent studying");
		  label.setPreferredSize(new Dimension(150, 25));
		  getContentPane().add(label);
		  textfield = new JTextField("");
		  getContentPane().add(textfield);
		  textfield.setPreferredSize(new Dimension(50, 25));
		  button1 = new JButton("Evaluate");
		  button1.addActionListener(new ActionListener() {
		  	public void actionPerformed(ActionEvent e) {
		  		if(Integer.parseInt(textfield.getText())<30)
		  		{
		  			int cal=30-Integer.parseInt(textfield.getText());
		  			JOptionPane.showMessageDialog(null, "I need to spend another "+cal+" hours studying at home");
		  		}
		  	}
		  });
		  getContentPane().add(button1);
		  setVisible(true);
   }
   
   	
   	private void displaySpent(long time)
   	{
   		JLabel label1 = new JLabel("Display Time Spent");
   		label1.setPreferredSize(new Dimension(60, 25));
   	}
   	
   	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Study frame = new Study("Study");
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
   	}
}
//contains all the information from the study class
