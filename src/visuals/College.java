package visuals;
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

public class College extends JFrame {

	private JPanel contentPane;
	private JTextField labtxt;
	private JTextField lecturetxt;
	private JTextField tutorialtxt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					College frame = new College();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public College() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("College Lab");
		lblNewLabel.setBounds(28, 47, 98, 14);
		contentPane.add(lblNewLabel);
		
		labtxt = new JTextField();
		labtxt.setBounds(136, 41, 86, 20);
		labtxt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		contentPane.add(labtxt);
		labtxt.setColumns(10);
		
		JButton btnNewButton = new JButton("Evaluate");
		btnNewButton.setBounds(109, 227, 89, 23);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Evaluation shows you need to spend more time in college");
			
			}
		});
		contentPane.add(btnNewButton);
		
		JLabel lblCollegeLecture = new JLabel("College Lecture");
		lblCollegeLecture.setBounds(28, 87, 98, 14);
		contentPane.add(lblCollegeLecture);
		
		lecturetxt = new JTextField();
		lecturetxt.setBounds(136, 84, 86, 20);
		lecturetxt.setColumns(10);
		contentPane.add(lecturetxt);
		
		tutorialtxt = new JTextField();
		tutorialtxt.setBounds(136, 129, 86, 20);
		tutorialtxt.setColumns(10);
		contentPane.add(tutorialtxt);
		
		JLabel lblCollegeTutorial = new JLabel("College Tutorial");
		lblCollegeTutorial.setBounds(28, 132, 98, 14);
		contentPane.add(lblCollegeTutorial);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(0, 0, 6, 20);
		contentPane.add(textPane);
	}
}
