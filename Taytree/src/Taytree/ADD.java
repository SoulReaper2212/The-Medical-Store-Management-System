package Taytree;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ADD extends JFrame
{

	private JPanel contentPane;
	//variable to hold the attributes of product
	private JTextField name;
	private JTextField amount;
	private JTextField pkr;
	private JTextField japan;
	public String Name;
	public int Amount;
	public int PKR;
	public int JYP=0;
	
	//MainFrame mf=new MainFrame();
	
	

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public ADD(String S[], int A[],int pk[],int jyp[],int ex,Frame2 frame) {//taking the arrays declared in the frame2() as following
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 608, 501);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		//text box to type the name and price and amount of product
		name = new JTextField();
		name.setBounds(50, 38, 216, 46);
		contentPane.add(name);
		name.setColumns(10);
		
		amount = new JTextField();
		amount.setBounds(50, 110, 216, 46);
		contentPane.add(amount);
		amount.setColumns(10);
		
		pkr = new JTextField();
		pkr.setBounds(50, 179, 216, 37);
		contentPane.add(pkr);
		pkr.setColumns(10);
		
		japan = new JTextField();
		japan.setBounds(50, 243, 216, 37);
		contentPane.add(japan);
		japan.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("NAME");
		lblNewLabel.setBounds(390, 38, 72, 37);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("AMOUNT");
		lblNewLabel_1.setBounds(390, 110, 72, 30);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("PRICE IN JYP (OPTIONAL)");
		lblNewLabel_2.setBounds(390, 243, 169, 25);
		contentPane.add(lblNewLabel_2);
		
		JButton added = new JButton("ADD");//clicking on add button
		added.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)//if the add button is clicked then we will 
			{
				//take the values from the text boxes and then add them in variable
				Name= name.getText().trim();
				Amount=Integer.parseInt(amount.getText().trim());
				PKR=Integer.parseInt(pkr.getText().trim());
				JYP=Integer.parseInt(japan.getText().trim());
				if(JYP == 0)//if the value is 0 then we use the exchange rate
				{
					JYP = PKR*ex;
				}
			    
				for(int i = 0 ; i < 30 ; i++)
				{
					if(S[i] == null)//if the array is null means entry is empty then add the current values
					{
						S[i]=Name;
						A[i]=Amount;
						pk[i]=PKR;
						jyp[i]=JYP;
						break;
					}
				}
				JOptionPane.showMessageDialog(null, "PRODUCT ADDED");//show the message is dialogue box
				
				frame.setVisible(true);
				dispose();
				return;
			}
		});
		added.setBounds(50, 338, 109, 46);
		contentPane.add(added);
		
		JLabel lblNewLabel_3 = new JLabel("PRICE IN PKR");
		lblNewLabel_3.setBounds(390, 190, 86, 14);
		contentPane.add(lblNewLabel_3);
		
		JButton btnNewButton = new JButton("BACK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(true);
				dispose();
				return;
			}
		});
		btnNewButton.setBounds(420, 338, 100, 46);
		contentPane.add(btnNewButton);
		
		
		
	}
}
