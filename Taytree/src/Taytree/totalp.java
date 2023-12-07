package Taytree;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class totalp extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public totalp(int Pk_C[],int Jy_C[]) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(23, 28, 129, 35);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(23, 105, 129, 35);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		int amount1=0;
		int amount2=0;
		
		for(int i=0;i<30;i++)
		{
			amount1=Pk_C[i]+amount1;
		}
		
		for(int i=0;i<30;i++)
		{
			amount2=Jy_C[i]+amount2;
		}
		
		textField.setText(Integer.toString(amount1));
		textField_1.setText(Integer.toString(amount2));
		JButton btnNewButton = new JButton("close");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton.setBounds(23, 204, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("PKR");
		lblNewLabel.setBounds(242, 28, 72, 35);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("JYP");
		lblNewLabel_1.setBounds(240, 105, 62, 35);
		contentPane.add(lblNewLabel_1);
	}

}
