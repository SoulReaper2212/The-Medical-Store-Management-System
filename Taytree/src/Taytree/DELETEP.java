package Taytree;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DELETEP extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public DELETEP(String S[], int A[],int pk[],int jyp[],Frame2 frame)// reference of the array declare in the frame2()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 574, 405);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(69, 41, 170, 39);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Delete");// if the delete button is clicked then
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				String T=textField.getText().trim();
				int con = 0;
				
				for(int i = 0 ; i < 30 ; i++)// loop through array
				{
					String s=S[i];
					
					if(s != null && T.trim().compareTo(s) == 0)//usign the compare fucntion to comapre the entry value and the value stored in array if the value is equal
					{
						JOptionPane.showMessageDialog(null, "PRODUCT DELETED");// then remove the values from the array
						S[i]=null;
						A[i]=0;
						pk[i]=0;
						jyp[i]=0;
						con = 1;
						break;
					}
				}
				
				if(con == 1)
				{
					
				}
				else if (con == 0){
					JOptionPane.showMessageDialog(null, "PRODUCT NOT FOUND");
				}
				
				return;
				
			}
		});
		btnNewButton.setBounds(69, 132, 89, 39);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("close");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setBounds(69, 194, 89, 39);
		contentPane.add(btnNewButton_1);
	}

}
