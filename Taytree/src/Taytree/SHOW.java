package Taytree;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JScrollBar;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JLabel;

public class SHOW extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	int iterator=0;// a varible act as index to traverse arrays
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */


	/**
	 * Create the frame.
	 */
	public SHOW(String S[], int A[],int pk[],int jyp[],Frame2 frame)// taking the array as the reference from frame2
	{
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 651, 423);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(48, 43, 199, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(48, 91, 199, 26);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		

		textField_2 = new JTextField();
		textField_2.setBounds(48, 136, 199, 26);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(48, 181, 199, 26);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		 textField.setText(S[iterator]);
		 textField_1.setText(Integer.toString(A[iterator]));
		 textField_2.setText(Integer.toString(pk[iterator]));
		 textField_3.setText(Integer.toString(jyp[iterator]));
		
		JButton btnNewButton = new JButton("previous");// on the button clicking on previous button show the --iterator
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				//cout content of the array
				  iterator=iterator-1;
				  if(iterator < 0)
				  {
					  iterator=iterator+1;
				  }
				  else
				  {
					  textField.setText(S[iterator]);
					  textField_1.setText(Integer.toString(A[iterator]));
					  textField_2.setText(Integer.toString(pk[iterator]));
					  textField_3.setText(Integer.toString(jyp[iterator]));
				  }
				 
							
			}
		});
		btnNewButton.setBounds(429, 321, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("next");
		btnNewButton_1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
			  
			  iterator=iterator+1;
			  if(pk[iterator] == 0)
			  {
				  iterator = iterator-1;
			  }
			  else
			  {
				  textField.setText(S[iterator]);
				  textField_1.setText(Integer.toString(A[iterator]));
				  textField_2.setText(Integer.toString(pk[iterator]));
				  textField_3.setText(Integer.toString(jyp[iterator]));
							
			  }
			 
				
				
			}
		});
		btnNewButton_1.setBounds(528, 321, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("close");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(true);
				dispose();
				return;
			}
		});
		btnNewButton_2.setBounds(325, 321, 89, 23);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel = new JLabel("NAME");
		lblNewLabel.setBounds(368, 43, 66, 20);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Quantity");
		lblNewLabel_1.setBounds(368, 91, 46, 20);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("PKR");
		lblNewLabel_2.setBounds(368, 148, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("JPY");
		lblNewLabel_3.setBounds(368, 193, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		
		
	}
}
