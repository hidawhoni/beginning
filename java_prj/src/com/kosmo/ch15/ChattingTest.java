package com.kosmo.ch15;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.FlowLayout;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.UIManager;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.DropMode;

public class ChattingTest {

	private JFrame frmChatting;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChattingTest window = new ChattingTest();
					window.frmChatting.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ChattingTest() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmChatting = new JFrame();
		frmChatting.getContentPane().setFont(new Font("맑은 고딕", Font.BOLD, 12));
		frmChatting.setBackground(UIManager.getColor("Button.highlight"));
		frmChatting.setTitle("채팅방");
		frmChatting.setForeground(UIManager.getColor("Button.foreground"));
		frmChatting.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		frmChatting.getContentPane().setBackground(SystemColor.window);
		frmChatting.setBounds(100, 100, 450, 300);
		frmChatting.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	
		
		JPanel panel = new JPanel();
		frmChatting.getContentPane().add(panel, BorderLayout.SOUTH);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		textField = new JTextField();
		textField.setBackground(new Color(255, 255, 255));
		textField.setToolTipText("");
		panel.add(textField);
		textField.setColumns(27);
		
		JButton Button = new JButton("보내기");
		Button.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		Button.setBackground(new Color(255, 182, 193));
		Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel.add(Button);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		frmChatting.getContentPane().add(panel_1, BorderLayout.CENTER);
		
		textField_1 = new JTextField();
		textField_1.setForeground(new Color(0, 0, 0));
		textField_1.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		textField_1.setBackground(UIManager.getColor("activeCaption"));
		textField_1.setPreferredSize(new Dimension(900, 210));
		panel_1.add(textField_1);
		textField_1.setColumns(27);
		
		JPanel panel_2 = new JPanel();
		frmChatting.getContentPane().add(panel_2, BorderLayout.EAST);
		
		JScrollPane scrollPane = new JScrollPane();
		panel_2.add(scrollPane);
	}

}
