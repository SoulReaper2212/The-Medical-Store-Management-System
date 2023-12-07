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

public class DELETE_ORDER extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public DELETE_ORDER(String S[], int A[],int pk[],int jyp[],String N_C[],String P_C[],int A_C[],int Pk_C[],int Jy_C[],Frame2 frame)
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 779, 403);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		// a text box that takes name of the customer and the product
		textField = new JTextField();
		textField.setBounds(65, 37, 225, 49);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(65, 134, 225, 49);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("DELETE");// if the button is clicke the text box value is taken and stored in variables
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
            String T=textField.getText().trim();
            String T1=textField_1.getText().trim();
            int con = 0;
				
				for(int i = 0 ; i < 30 ; i++)
				{
					String s=N_C[i];
					
					if(s != null && T.trim().compareTo(s) == 0)// first we find the customer 
					{
						if(P_C[i] != null && T1.trim().compareTo(P_C[i]) == 0)//then we check for the order
						{
							JOptionPane.showMessageDialog(null, "ORDER DELETED");// if matched then the system makes the value at that place null
							N_C[i]=null;
							P_C[i]=null;
							A_C[i]=0;
							Pk_C[i]=0;
							Jy_C[i]=0;
							con = 1;
							break;
						}
						
					}
					
				}
				
				if(con == 1)
				{
					
				}
				else
				{
					JOptionPane.showMessageDialog(null, "ORDER NOT FOUND");
				}
				frame.setVisible(true);
				dispose();
				return;
				
			}
		});
		btnNewButton.setBounds(65, 258, 89, 39);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("NAME CUSTOMER");
		lblNewLabel.setBounds(373, 37, 147, 31);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("PRODUCT NAME");
		lblNewLabel_1.setBounds(373, 143, 89, 31);
		contentPane.add(lblNewLabel_1);
	}

}
