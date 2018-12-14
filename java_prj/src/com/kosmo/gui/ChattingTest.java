package com.kosmo.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.SystemColor;
import javax.swing.JScrollBar;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;

public class ChattingTest extends JFrame {

	private JPanel contentPane;
	private JTextField ID;
	JPanel Cpanel;
	private JTextField CText;
	String uid;
	private JTextArea IDArea;
	private JTextArea Clog;


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChattingTest frame = new ChattingTest();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public ChattingTest() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
				JPanel panel = new JPanel();
				
						panel.setBounds(0, 0, 434, 261);
						contentPane.add(panel);
						panel.setLayout(null);
						
								JLabel lblNewLabel = new JLabel("닉네임");
								lblNewLabel.setFont(new Font("맑은 고딕", Font.PLAIN, 13));
								lblNewLabel.setBounds(74, 86, 53, 23);
								panel.add(lblNewLabel);
								
								
								
										JButton JoinButton = new JButton("접속하기");
										JoinButton.setBackground(new Color(255, 182, 193));
										JoinButton.setFont(new Font("맑은 고딕", Font.BOLD, 18));
										JoinButton.addActionListener(new ActionListener() {
											public void actionPerformed(ActionEvent e) {

												panel.setVisible(false);
												Cpanel.setVisible(true);
												uid = ID.getText();
												IDArea.setText(uid);






											}
										});
										
										
												JoinButton.setBounds(231, 86, 150, 49);
												panel.add(JoinButton);
												ID = new JTextField();
												ID.setBounds(74, 112, 145, 23);
												ID.setColumns(10);
												panel.add(ID);
												
														ID.addKeyListener(new KeyAdapter() {
															public void keyPressed(KeyEvent e) {
																if(e.getKeyCode() == KeyEvent.VK_ENTER) {
																	panel.setVisible(false);
																	Cpanel.setVisible(true);
																	uid = ID.getText();
																	IDArea.setText(uid);
																}
															}
														});

		Cpanel = new JPanel();
		Cpanel.setBackground(Color.WHITE);
		Cpanel.setBounds(12, 10, 410, 241);
		contentPane.add(Cpanel);
		Cpanel.setLayout(null);
		Cpanel.setVisible(false);


		JButton tsButton = new JButton("보내기");
		tsButton.setBackground(new Color(255, 182, 193));
		tsButton.setFont(new Font("맑은 고딕", Font.BOLD, 13));
		tsButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Clog.append(uid + " : " + CText.getText() + "\n");
				CText.setText("");
			}
		});

		tsButton.setBounds(313, 218, 97, 23);
		Cpanel.add(tsButton);

		CText = new JTextField();
		CText.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		CText.setBackground(new Color(255, 192, 203));
		CText.setBounds(0, 220, 313, 21);
		Cpanel.add(CText);
		CText.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
					Clog.append(uid + " : " + CText.getText() + "\n");

					CText.setText("");
				}
			}
		});

		

		IDArea = new JTextArea();
		IDArea.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		IDArea.setBackground(new Color(192, 192, 192));
		IDArea.setBounds(313, 0, 97, 220);
		Cpanel.add(IDArea);





	


		Clog = new JTextArea();
		Clog.setBounds(0, 0, 313, 220);
		Cpanel.add(Clog);
		
		

		JScrollPane scrollPane = new JScrollPane(Clog);
		scrollPane.setBounds(0, 0, 313, 220);
		Cpanel.add(scrollPane);
	}
}