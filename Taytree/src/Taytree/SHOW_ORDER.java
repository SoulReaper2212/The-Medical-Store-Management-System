package Taytree;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.JLabel;

public class SHOW_ORDER extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	int iterator=0;// the iterator to travers the arrays 

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public SHOW_ORDER(String S[], int A[],int pk[],int jyp[],String N_C[],String P_C[],int A_C[],int Pk_C[],int Jy_C[],Frame2 frame) {//the arrays that we pass 
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 879, 485);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(10, 57, 102, 44);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(122, 57, 295, 44);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(427, 57, 142, 44);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(579, 57, 138, 42);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(727, 57, 126, 42);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		String p="",a="",r1="",r2="";
	    for (int i = 0 ; i < 30 ; i++)
	    {
	    	if(N_C[i] != null && N_C[iterator].trim().compareTo(N_C[i].trim()) == 0)
	    	{
	    		p = p + P_C[i];
	    		p = p + " - ";
	    		a = a + Integer.toString(A_C[i]);
	    		a = a + " - ";
	    		r1 = r1 + Integer.toString(Pk_C[i]);
	    		r1 = r1 + " - ";
	    		r2 = r2 + Integer.toString(Jy_C[i]);
	    		r2 = r2 + " - ";
	    	}
	    }
		textField.setText(N_C[iterator]);
		textField_1.setText(p);
		textField_2.setText(a);
		textField_3.setText(r1);
		textField_4.setText(r2);
		
		JButton btnNewButton = new JButton("close");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBounds(26, 367, 110, 39);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("previous");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 iterator=iterator-1;
				  if(iterator < 0)
				  {
					  iterator=iterator+1;
				  }
				  else
				  {
					  String p="",a="",r1="",r2="";
					    for (int i = 0 ; i < 30 ; i++)
					    {
					    	if(N_C[i] != null && N_C[iterator].trim().compareTo(N_C[i].trim()) == 0)
					    	{
					    		p = p + P_C[i];
					    		p = p + " - ";
					    		a = a + Integer.toString(A_C[i]);
					    		a = a + " - ";
					    		r1 = r1 + Integer.toString(Pk_C[i]);
					    		r1 = r1 + " - ";
					    		r2 = r2 + Integer.toString(Jy_C[i]);
					    		r2 = r2 + " - ";
					    	}
					    }
						textField.setText(N_C[iterator]);
						textField_1.setText(p);
						textField_2.setText(a);
						textField_3.setText(r1);
						textField_4.setText(r2);
				  }
				
			}
		});
		btnNewButton_1.setBounds(642, 364, 102, 44);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("next");// if the next button is pressed then the iterator get ++ and the rest of values is shown
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				 iterator=iterator+1;
				  if(N_C[iterator]==null)
				  {
					  System.out.print("ni");
					  iterator = iterator-1;
				  }
				  else
				  {
					  String p="",a="",r1="",r2="";
					    for (int i = 0 ; i < 30 ; i++)
					    {
					    	if(N_C[i] != null && N_C[iterator].trim().compareTo(N_C[i].trim()) == 0)
					    	{
					    		p = p + P_C[i];
					    		p = p + " - ";
					    		a = a + Integer.toString(A_C[i]);
					    		a = a + " - ";
					    		r1 = r1 + Integer.toString(Pk_C[i]);
					    		r1 = r1 + " - ";
					    		r2 = r2 + Integer.toString(Jy_C[i]);
					    		r2 = r2 + " - ";
					    	}
					    }
						textField.setText(N_C[iterator]);
						textField_1.setText(p);
						textField_2.setText(a);
						textField_3.setText(r1);
						textField_4.setText(r2);
				  }
			}
		});
		btnNewButton_2.setBounds(755, 365, 98, 42);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel = new JLabel("Customer name");
		lblNewLabel.setBounds(10, 32, 102, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Product name");
		lblNewLabel_1.setBounds(223, 27, 126, 24);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Amount");
		lblNewLabel_2.setBounds(469, 32, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Pkr ");
		lblNewLabel_3.setBounds(628, 32, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Jyp");
		lblNewLabel_4.setBounds(773, 32, 46, 14);
		contentPane.add(lblNewLabel_4);
	}
}
