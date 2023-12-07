package Taytree;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.awt.event.ActionEvent;

public class Frame2 extends JFrame {//frame2 class

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public String[] PRODUCTS = new String[30];//a array to add products
	public int[] AMOUNTS=new int[30];//a array to add amount of products
	public int[] PKRS=new int[30];// a array to add the pakistani currency 
	public int[] JYPS=new int[30];// a array to add the japanese currency
	
	public String[] NAME_C = new String[30];// a array to hold the name of the customer
	public String[] PRODUCT_C=new String[30];// a array to hold the name of the product a customer order
	public int[] AMOUNTS_C=new int[30];// a array to hold the amount of total product of the customer
	public int[] PKR_C=new int[30];//pkr amount of customer order
	public int[] JYP_C=new int[30];//pkr amount of customer order
	private JTextField textField;
	public int exchange_rate=2;
	static Frame2 frame = new Frame2();
	
	
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
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
	public Frame2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//main window attributes
		setBounds(100, 100, 760, 570);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		  File myfile = new File("C:\\Users\\SOULREAPER\\Desktop\\productdata.txt");//read products from the file

	        Scanner sc1 = null;
	        try {
	            sc1 = new Scanner(myfile);
	        }
	        catch (FileNotFoundException e) {
	            e.printStackTrace();
	        }

	        int l=-1;
	        int k=-1;
	        while (sc1.hasNextLine()) {
	            String data = sc1.nextLine();
	            
	            if(data.equals("medicine"))
	            {
	            	l=l+1;
	            	data = sc1.nextLine();
	            	PRODUCTS[l]=data;
	            	data = sc1.nextLine();
	            	AMOUNTS[l]=Integer.parseInt(data);
	            	data = sc1.nextLine();
	            	PKRS[l]=Integer.parseInt(data);
	            	data = sc1.nextLine();
	            	JYPS[l]=Integer.parseInt(data);
	            }
	        }
	        
	        
	        
	        
	        File myfile1 = new File("C:\\Users\\SOULREAPER\\Desktop\\customerdata.txt");//read customer from the file

	        Scanner sc2 = null;
	        try {
	            sc2 = new Scanner(myfile1);
	        }
	        catch (FileNotFoundException e) {
	            e.printStackTrace();
	        }

	        
	        while (sc2.hasNextLine()) {
	            String data = sc2.nextLine();
	            
	            if(data.equals("customer"))
	            {
	            	k=k+1;
	            	data = sc2.nextLine();
	            	NAME_C[k]=data;
	            	data = sc2.nextLine();
	            	PRODUCT_C[k]=data;
	            	data = sc2.nextLine();
	            	AMOUNTS_C[k]=Integer.parseInt(data);
	            	data = sc2.nextLine();
	            	PKR_C[k]=Integer.parseInt(data);
	            	data = sc2.nextLine();
	            	JYP_C[k]=Integer.parseInt(data);
	            }
	        }

		
		
		
		JLabel lblNewLabel = new JLabel("MENU");// a text box that shows the menu written on it and it attributes
		lblNewLabel.setForeground(new Color(255, 69, 0));
		lblNewLabel.setFont(new Font("Stencil", Font.BOLD, 21));
		lblNewLabel.setBounds(336, 35, 69, 59);
		contentPane.add(lblNewLabel);
		
		
		
		JButton addproduct = new JButton("ADD PRODUCT");
		addproduct.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e)
			{
				ADD jfa = new ADD(PRODUCTS, AMOUNTS, PKRS, JYPS,exchange_rate,frame);
				setVisible(false);
			    jfa.show();
			    
			    
    
			
				
				
				
			}
		});
		addproduct.setBounds(218, 144, 128, 50);
		contentPane.add(addproduct);
		
		JButton btnNewButton = new JButton("SHOW PRODUCT");// a button on which show product is written on
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				SHOW jfs = new SHOW(PRODUCTS, AMOUNTS, PKRS, JYPS,frame);// if the button is clicked then the click() file is executed
				setVisible(false);
				jfs.show();
			}
		});
		btnNewButton.setBounds(218, 215, 128, 50);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("DELETE PRODUCT");// a button on which delete product is written on
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				DELETEP jfdp = new DELETEP(PRODUCTS, AMOUNTS, PKRS, JYPS,frame);// if the button is clicked then the deletep() file is executed
				setVisible(false);
				jfdp.show();
			}
		});
		btnNewButton_1.setBounds(218, 276, 128, 50);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("EDIT PRODUCT");// a button on which edit product is written on
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				EDITp jfep = new EDITp(PRODUCTS, AMOUNTS, PKRS, JYPS,exchange_rate,frame);// if the button is clicked then the EDITp() file is executed
				setVisible(false);
				jfep.show();
				
			}
		});
		btnNewButton_2.setBounds(218, 337, 128, 50);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("ORDER ADD");// a button on which edit product is written on
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ADD_C jfac = new ADD_C(PRODUCTS, AMOUNTS, PKRS, JYPS,NAME_C,PRODUCT_C,AMOUNTS_C,PKR_C,JYP_C,frame);// if the button is clicked then the EDITp() file is executed
				setVisible(false);
				jfac.show();
				
			}
		});
		btnNewButton_3.setBounds(408, 144, 128, 50);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("SHOW ORDERS");// a button on which show orders is written on
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				SHOW_ORDER jfso = new SHOW_ORDER(PRODUCTS, AMOUNTS, PKRS, JYPS,NAME_C,PRODUCT_C,AMOUNTS_C,PKR_C,JYP_C,frame);
				setVisible(false);
				jfso.show();
			}
		});
		btnNewButton_4.setBounds(408, 215, 128, 50);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("DELETE ORDER");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DELETE_ORDER jfsdo = new DELETE_ORDER(PRODUCTS, AMOUNTS, PKRS, JYPS,NAME_C,PRODUCT_C,AMOUNTS_C,PKR_C,JYP_C,frame);
				setVisible(false);
				jfsdo.show();
			}
		});
		btnNewButton_5.setBounds(408, 276, 128, 50);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("TOTAL PRICE");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				totalp jtp = new totalp(PKR_C,JYP_C);
				jtp.show();
			}
		});
		btnNewButton_6.setBounds(408, 337, 128, 50);
		contentPane.add(btnNewButton_6);
		//setting a text filed in which exchange rate is written
		textField = new JTextField();
		textField.setText("2");//default set as 2 
		textField.setBounds(190, 424, 156, 38);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton_7 = new JButton("SET EXCHANGE RATE");//a button to set the exchange rate
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {// on clicking the number enter in the text field is taken and set as the exhange rate
			    exchange_rate= Integer.parseInt(textField.getText());
			}
		});
		btnNewButton_7.setBounds(409, 424, 173, 38);
		contentPane.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("save/quit");//quit button that write the data on the file
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String data="";
				
				for(int i = 0 ; i <30;i++) {//reading the products in file
					
					if(PRODUCTS[i] != null )
					{
						data=data+"medicine\n";
						data=data+PRODUCTS[i]+"\n";
						data=data+Integer.toString(AMOUNTS[i])+"\n";
						data=data+Integer.toString(PKRS[i])+"\n";
						data=data+Integer.toString(JYPS[i])+"\n";
					
						
					}
				}
				
				try {
                    FileWriter myWriter = new FileWriter("C:\\Users\\SOULREAPER\\Desktop\\productdata.txt");
                    myWriter.write(data);
                    myWriter.close();
                    System.out.println("Successfully wrote to the file.");
                } catch (IOException f) {
                    System.out.println("An error occurred.");
                    f.printStackTrace();
                }
				
				
				data="";
                for(int i = 0 ; i <30;i++) {//reading the customer in file
					
					if(NAME_C[i] != null )
					{
						data=data+"customer\n";
						data=data+NAME_C[i]+"\n";
						data=data+PRODUCT_C[i]+"\n";
						data=data+Integer.toString(AMOUNTS_C[i])+"\n";
						data=data+Integer.toString(PKR_C[i])+"\n";
						data=data+Integer.toString(JYP_C[i])+"\n";
					
						
					}
				}
				
				try {
                    FileWriter myWriter = new FileWriter("C:\\Users\\SOULREAPER\\Desktop\\customerdata.txt");
                    myWriter.write(data);
                    myWriter.close();
                    System.out.println("Successfully wrote to the file.");
                } catch (IOException f) {
                    System.out.println("An error occurred.");
                    f.printStackTrace();
                }
				
				setVisible(false);
				return;
			}
		});
		btnNewButton_8.setBackground(Color.RED);
		btnNewButton_8.setForeground(Color.WHITE);
		btnNewButton_8.setBounds(40, 337, 128, 50);
		contentPane.add(btnNewButton_8);
		
		
	}
}

