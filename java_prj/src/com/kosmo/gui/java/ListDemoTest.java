package com.kosmo.gui.java;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;

public class ListDemoTest extends JFrame
implements ListSelectionListener {
	
	private DefaultListModel listModel;
	private JPanel contentPane;
	JList list;
	private JPanel buttonPanel;
	private JButton NewButton;
	private JTextField nameField;
	private JButton btnNewButton_1;
	private JPanel panel;
	private JTextField another;
	private JButton btnNewButton;
	private JTextPane textPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ListDemoTest frame = new ListDemoTest();
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
	public ListDemoTest() {
		
		
		setBounds(100, 100, 450, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		
		listModel = new DefaultListModel();
		listModel.addElement("아무개");
		listModel.addElement("홍길동");
		listModel.addElement("박다훈");
		
		JScrollPane listScrollPane = new JScrollPane();
		contentPane.add(listScrollPane, BorderLayout.CENTER);
		
		
		list = new JList(listModel);
		list.addListSelectionListener(this);
		contentPane.add(list, BorderLayout.CENTER);
		buttonPanel = new JPanel();
		contentPane.add(buttonPanel, BorderLayout.SOUTH);
		buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.X_AXIS));
		
		NewButton = new JButton("삭제");
		NewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int index = list.getSelectedIndex();
				listModel.remove(index);

				int size = listModel.getSize();

				if (size == 0) { //Nobody's left, disable firing.
					NewButton.setEnabled(false);

				} else { //Select an index.
					if (index == listModel.getSize()) {
						//removed item in last position
						index--;//위로 두번올라가게 해줌.
					}

					list.setSelectedIndex(index);
					list.ensureIndexIsVisible(index);
				}
				

			}
		});
		NewButton.setActionCommand("삭제");
		
		
		
		buttonPanel.add(NewButton);
		
		nameField = new JTextField(10);
		
		
		buttonPanel.add(nameField);
		nameField.setColumns(10);
		
		btnNewButton_1 = new JButton("등록");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int index = list.getSelectedIndex(); //get selected index
				if (index == -1) { //no selection, so insert at beginning
					index = 0;
				} else {           //add after the selected item
					index++;
				}
				
				listModel.insertElementAt(nameField.getText(), index);
				
			}
		});
		buttonPanel.add(btnNewButton_1);
		
		btnNewButton = new JButton("보내기");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int index = list.getSelectedIndex();
				String name = list.getSelectedValue().toString();
				another.setText(index +","+name);
				
			}
		});
		buttonPanel.add(btnNewButton);
		
		panel = new JPanel();
		contentPane.add(panel, BorderLayout.EAST);
		
		textPane = new JTextPane();
		panel.add(textPane);
		
		another = new JTextField();
		panel.add(another);
		another.setColumns(10);
	}

	@Override
	public void valueChanged(ListSelectionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
		
		
