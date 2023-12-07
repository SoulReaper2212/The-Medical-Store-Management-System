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

public class ADD_C extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public ADD_C(String S[], int A[],int pk[],int jyp[],String N_C[],String P_C[],int A_C[],int Pk_C[],int Jy_C[],Frame2 frame) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 580, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(49, 63, 212, 34);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(49, 121, 212, 34);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(49, 176, 212, 34);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnNewButton = new JButton("ADD");
		btnNewButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				String Name= textField.getText();
				String Name2= textField_1.getText().trim();
				int Amount=Integer.parseInt(textField_2.getText());
				int con=0;
				int i3=0;
				for(int i = 0 ; i < 30 ; i++)
				{
					if(S[i] != null && Name2.trim().compareTo(S[i])==0)
					{
						
						if(Amount <= A[i])
						{
							JOptionPane.showMessageDialog(null, "FOUND PRODUCT");
							i3=i;
							con=1;
							break;
						}
						else {
							JOptionPane.showMessageDialog(null, "Amount not suffiecient");
						}
					}
					
				}
				
				if(con == 1)
				{
					for(int i = 0 ; i < 30 ; i++)
					{
						if(N_C[i] == null)
						{
							N_C[i]=Name;
							P_C[i]=Name2;
							A_C[i]=Amount;
							int num = Amount * pk[i3];
							
							Pk_C[i]=num;
							 num = Amount * jyp[i3];
							Jy_C[i]=num;
							
							break;
						}
					}
				}
				else
				{
					JOptionPane.showMessageDialog(null, "THE PRODUCT NOT FOUND");
					
				}
				
				
				
			}
		});
		btnNewButton.setBounds(35, 319, 103, 34);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Close");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setBounds(431, 319, 103, 34);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("CUSTOMER NAME");
		lblNewLabel.setBounds(342, 63, 124, 24);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("PRODUCT NAME");
		lblNewLabel_1.setBounds(342, 120, 110, 24);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("AMOUNT ");
		lblNewLabel_2.setBounds(342, 176, 113, 24);
		contentPane.add(lblNewLabel_2);
	}
}
