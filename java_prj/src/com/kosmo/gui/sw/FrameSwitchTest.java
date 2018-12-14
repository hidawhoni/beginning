package com.kosmo.gui.sw;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Window;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class FrameSwitchTest extends JFrame {

	private JPanel basicPanel;
	JTextField textField;
	JPanel bpanel;
	JPanel apanel;
	boolean toggle = false;
	private JButton btnOpenbutton;
	private JButton btnSendbutton;
	private JButton button;
	
	
	
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameSwitchTest frame = new FrameSwitchTest();
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
	public FrameSwitchTest() {
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		basicPanel = new JPanel();
		basicPanel.setBackground(Color.RED);
		basicPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		basicPanel.setLayout(new BorderLayout(0, 0));
		setContentPane(basicPanel);
		
		apanel = new Apanel();
		apanel.setPreferredSize(new Dimension(450,100));
		basicPanel.add(apanel, BorderLayout.CENTER);
		
		
		
		
		bpanel = new BPanel();
		bpanel.setPreferredSize(new Dimension(450,100));
		basicPanel.add(bpanel, BorderLayout.SOUTH);
		
		JPanel Northpanel = new JPanel();
		basicPanel.add(Northpanel, BorderLayout.NORTH);
		Northpanel.setLayout(new BorderLayout(0, 0));
		
		textField = new JTextField();
		Northpanel.add(textField, BorderLayout.CENTER);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("basic>north>button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				apanel.setVisible(false);
				if(toggle == false) {
					toggle = true;
					apanel.setVisible(false);
				}else if(toggle == true){
					toggle = false;
					apanel.setVisible(true);
				}
				
				
			}
		});
		Northpanel.add(btnNewButton, BorderLayout.EAST);
		
		btnOpenbutton = new JButton("openButton");
		btnOpenbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				AFrame aframe = new AFrame(bb);
//				aframe.setVisible(true);
				
				ApplicationSwitchTest appl = new ApplicationSwitchTest(FrameSwitchTest.this);
				appl.aframe.setVisible(true);
				
			}
		});
		Northpanel.add(btnOpenbutton, BorderLayout.WEST);
		
		btnSendbutton = new JButton("sendButton");
		btnSendbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AFrame aa = new AFrame(FrameSwitchTest.this);
				aa.setVisible(true);
			}
			
		});
		Northpanel.add(btnSendbutton, BorderLayout.SOUTH);
		
	
	}
	
}


				
				
				
				





				
				
				
				
