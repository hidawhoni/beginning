package com.kosmo.gui;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MyPanelClass extends JPanel {
	private JTextField txtFsfs;

	/**
	 * Create the panel.
	 */
	public MyPanelClass() {
		
		setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		add(panel, BorderLayout.SOUTH);
		
		JTextArea textArea = new JTextArea();
		
		textArea.setText("panel panel");
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setPreferredSize(new Dimension(100,220));
		add(scrollPane, BorderLayout.CENTER);
		
		txtFsfs = new JTextField();
		txtFsfs.setText("FSFS");
		scrollPane.setViewportView(txtFsfs);
		txtFsfs.setColumns(10);
		
		
		

	}

}
