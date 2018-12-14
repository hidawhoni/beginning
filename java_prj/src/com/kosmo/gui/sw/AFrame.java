package com.kosmo.gui.sw;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Component;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AFrame extends JFrame {

	private JPanel contentPane;
	JTextField applTestField;
	String applTextStr;
	AFrame aa;
	
	

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					AFrame frame = new AFrame();
//					frame.setVisible(true);//에이프레임 보여주는것
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 */
	public AFrame(FrameSwitchTest frmADDR) {
		aa= this;
				
		//setDefaultCloseOperation(AFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		contentPane = new JPanel();
		contentPane.setBackground(Color.YELLOW);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		
		
	
		
		applTestField = new JTextField();
		applTestField.setText(frmADDR.textField.getText());
		applTestField.setColumns(10);
		contentPane.add(applTestField, BorderLayout.SOUTH);
		
		
		JButton btnAframe = new JButton("AFrame");
		btnAframe.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			applTextStr = applTestField.getText();
			BFrame bframe = new BFrame(aa);
			bframe.setVisible(true);
			
		
			
		}
	});
		
		contentPane.add(btnAframe, BorderLayout.WEST);
		
		
		
		
		
		
	}

}
