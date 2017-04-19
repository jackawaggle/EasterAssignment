package visuals;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Study extends JFrame  
	{

	/**
	 * @param args
	 */
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
		  setLayout(new FlowLayout());
		  label = new JLabel("Enter Date");
		  label.setPreferredSize(new Dimension(60, 25));
		  add(label);
		  textfield = new JTextField("Enter Text Here");
		  add(textfield);
		  button1 = new JButton("Click me");
		  add(button1);
		  setVisible(true);
   }
   
   	
   	private void displaySpent(long time)
   	{
   		JLabel label1 = new JLabel("Display Time Spent");
   		label1.setPreferredSize(new Dimension(60, 25));
   	}
}

