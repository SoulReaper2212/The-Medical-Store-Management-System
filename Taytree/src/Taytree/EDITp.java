package Taytree;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EDITp extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public EDITp(String S[], int A[],int pk[],int jyp[],int ex,Frame2 frame) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//makin the text box for the values
		setBounds(100, 100, 450, 491);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(28, 28, 141, 32);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(28, 126, 141, 32);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(28, 169, 141, 32);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(28, 212, 141, 32);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(28, 255, 141, 32);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JButton btnNewButton = new JButton("close");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBounds(28, 409, 89, 32);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Edit");// do all the below after clicking the button
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				//get the values fromt he text box and then store them in the array
				String Name= textField.getText();
				String Name2= textField_1.getText().trim();
				int Amount=Integer.parseInt(textField_2.getText().trim());
				int PKR=Integer.parseInt(textField_3.getText().trim());
				int JYP=Integer.parseInt(textField_4.getText().trim());
			    int con = 0;
				for(int i = 0 ; i < 30 ; i++)
				{
					
					if(S[i] != null && Name.trim().compareTo(S[i])==0)//compare the name of product and the name of product that was in the array
					{
						S[i]=Name2;// the values is sem then change values
						A[i]=Amount;
						pk[i]=PKR;
						jyp[i]=PKR*ex;
						con = 1;
						break;
					}
				}
				
				if(con == 1)
				{
					JOptionPane.showMessageDialog(null, "PRODUCT EDITED");
				}
				else {
					JOptionPane.showMessageDialog(null, "PRODUCT NOT FOUND");
				}
				
			}
		});
		btnNewButton_1.setBounds(127, 409, 89, 32);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("PRODUCT NAME YOU WANT TO CHANGE");
		lblNewLabel.setBounds(208, 33, 216, 23);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setBounds(202, 131, 116, 23);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("amount");
		lblNewLabel_2.setBounds(202, 169, 98, 23);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("PKR");
		lblNewLabel_3.setBounds(202, 212, 79, 23);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("JYP");
		lblNewLabel_4.setBounds(202, 260, 84, 23);
		contentPane.add(lblNewLabel_4);
	}

}
