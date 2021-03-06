package EasterAssignment;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.JTextPane;

public class Work extends JFrame {

	private JPanel contentPane;
	private JTextField earntxt;
	private JTextField workedhourstxt;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Work frame = new Work();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	 // Create the frame.
	 
	public Work() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Euros Earned");
		lblNewLabel.setBounds(79, 131, 98, 14);
		contentPane.add(lblNewLabel);
		
		workedhourstxt = new JTextField();
		workedhourstxt.setBounds(238, 65, 86, 20);
		workedhourstxt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		contentPane.add(workedhourstxt);
		workedhourstxt.setColumns(10);
		
		JButton btnNewButton = new JButton("Evaluate");
		btnNewButton.setBounds(150, 184, 89, 23);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Integer.parseInt(workedhourstxt.getText())<24)
				{
					int hoursLeft=24-Integer.parseInt(workedhourstxt.getText());
					earntxt.setText(String.valueOf((Integer.parseInt(workedhourstxt.getText())*18)));
		  			JOptionPane.showMessageDialog(null, "I need to spend another "+hoursLeft+" hours working to earn my expected wages");
		  		}
			}
		});
		contentPane.add(btnNewButton);
		
		JLabel lblhours = new JLabel("Worked Hours");
		lblhours.setBounds(79, 68, 98, 14);
		contentPane.add(lblhours);
		
		earntxt = new JTextField();
		earntxt.setBounds(238, 128, 86, 20);
		earntxt.setColumns(10);
		contentPane.add(earntxt);
		
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(0, 0, 6, 20);
		contentPane.add(textPane);
	}
}
