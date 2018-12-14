package com.kosmo.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CardLayoutTest extends JFrame {

	private JPanel contentPane;
	CardLayout cardLayout;
	JPanel cardpanel;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CardLayoutTest frame = new CardLayoutTest();
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
	public CardLayoutTest() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel buttonOpen = new JPanel();
		buttonOpen.setLayout(new FlowLayout(FlowLayout.CENTER,5,5));
		
		
		contentPane.add(buttonOpen, BorderLayout.NORTH);
		
		JButton buttonA = new JButton("buttonA");
		buttonA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardpanel.setVisible(true);
				cardLayout.show(cardpanel,"add_name_AAAA");
			}
		});
		buttonOpen.add(buttonA);
		
		
		JButton buttonB = new JButton("buttonB");
		buttonB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardpanel.setVisible(true);
				cardLayout.show(cardpanel,"add_name_BBBB");
			}
		});
		buttonOpen.add(buttonB);
		
		JButton btnButtonopen = new JButton("buttonOpen");
		buttonOpen.add(btnButtonopen);
		
		cardpanel = new JPanel();
		cardLayout= new CardLayout(0, 0);
		cardpanel.setLayout(cardLayout);
		cardpanel.setVisible(false);
		contentPane.add(cardpanel, BorderLayout.CENTER);
		
		JPanel panelA = new JPanel();
		panelA.setBackground(Color.YELLOW);
		
		cardpanel.add(panelA, "add_name_AAAA");
		
		JPanel panelB = new JPanel();
		panelB.setBackground(Color.RED);
		panelB= new MyPanelClass();
		cardpanel.add(panelB, "add_name_BBBB");
	}

}
