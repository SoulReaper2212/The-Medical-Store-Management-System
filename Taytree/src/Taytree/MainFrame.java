package Taytree;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;


public class MainFrame extends JFrame //main class 
{

	private JPanel contentPane;
	private JTextField txtMedicalSoftware;
   
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
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
	public MainFrame()//main frame class
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//the window that is shown at the start and its attributes
		setBounds(100, 100, 604, 390);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("START");//start button
		btnNewButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) //clicking on the start button
			{
				
				Frame2 jff= new Frame2();//on clicking the button the new frame2 file is opened
				jff.show();//instance to show the frame
				dispose();//delete the current frame
			}
		});
		//start button attributes
		btnNewButton.setBackground(SystemColor.controlHighlight);
		btnNewButton.setForeground(Color.BLUE);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setBounds(239, 174, 115, 41);
		contentPane.add(btnNewButton);
		
		txtMedicalSoftware = new JTextField();//showing software
		txtMedicalSoftware.setEditable(false);
		txtMedicalSoftware.setBackground(SystemColor.menu);
		txtMedicalSoftware.setForeground(new Color(255, 51, 51));
		txtMedicalSoftware.setText("MEDICAL SOFTWARE");//showing the name of the software
		txtMedicalSoftware.setFont(new Font("Times New Roman", Font.BOLD, 24));
		txtMedicalSoftware.setBounds(160, 75, 273, 41);
		contentPane.add(txtMedicalSoftware);
		txtMedicalSoftware.setColumns(10);
	}
}
