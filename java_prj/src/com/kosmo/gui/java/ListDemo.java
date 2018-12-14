package com.kosmo.gui.java;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

import com.kosmo.gui.sw.FrameSwitchTest;

/* ListDemo.java requires no other files. */
public class ListDemo extends JPanel
implements ListSelectionListener {
	
	private JList list;
	private DefaultListModel listModel;

	
	private JButton fireButton;
	private JTextField employeeName;
	//우리가 추가
	private JFrame frame;
	JButton hireButton;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ListDemo window = new ListDemo();
					window.frame.setVisible(true);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public ListDemo() {

		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//        JComponent newContentPane = new ListDemo();
		//        newContentPane.setOpaque(true); //content panes must be opaque
		//        frame.setContentPane(newContentPane);
		// 
		//        frame.pack();
		//        frame.setVisible(true);


		listModel = new DefaultListModel();
		listModel.addElement("Jane Doe");
		listModel.addElement("John Smith");
		listModel.addElement("Kathy Green");
		
		String[] data = {"lee","kim","park"};
		list = new JList(listModel);

		
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list.setSelectedIndex(0);
		list.addListSelectionListener(this);
		list.setVisibleRowCount(5);//영역크기
		
		JScrollPane listScrollPane = new JScrollPane(list);

		frame.getContentPane().add(listScrollPane, BorderLayout.CENTER);


		hireButton = new JButton("고용");
		HireListener hireListener = new HireListener(hireButton);
		hireButton.setActionCommand("고용");
		hireButton.addActionListener(hireListener);
		hireButton.setEnabled(false);

		fireButton = 	new JButton("퇴직");
		fireButton.setActionCommand("퇴직");
		fireButton.addActionListener(new FireListener());

		employeeName = new JTextField(10);
		employeeName.addActionListener(hireListener);
		employeeName.getDocument().addDocumentListener(hireListener);
		String name = listModel.getElementAt(
				list.getSelectedIndex()).toString();

		//Create a panel that uses BoxLayout.
		JPanel buttonPane = new JPanel();
		buttonPane.setLayout(new BoxLayout(buttonPane,
				BoxLayout.LINE_AXIS));
		buttonPane.add(fireButton);
		buttonPane.add(Box.createHorizontalStrut(5));
		buttonPane.add(new JSeparator(SwingConstants.VERTICAL));
		buttonPane.add(Box.createHorizontalStrut(5));
		buttonPane.add(employeeName);
		buttonPane.add(hireButton);
		buttonPane.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));

		//        
		//        add(listScrollPane, BorderLayout.CENTER);
		//        add(buttonPane, BorderLayout.PAGE_END);
		frame.getContentPane().add(buttonPane, BorderLayout.PAGE_END);
	}

	class FireListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			//This method can be called only if
			//there's a valid selection
			//so go ahead and remove whatever's selected.
			int index = list.getSelectedIndex();
			listModel.remove(index);

			int size = listModel.getSize();

			if (size == 0) { //Nobody's left, disable firing.
				fireButton.setEnabled(false);

			} else { //Select an index.
				if (index == listModel.getSize()) {
					//removed item in last position
					index--;//위로 두번올라가게 해줌.
				}

				list.setSelectedIndex(index);
				list.ensureIndexIsVisible(index);
			}
		}
	}

	//This listener is shared by the text field and the hire button.
	class HireListener implements ActionListener, DocumentListener {
		private boolean alreadyEnabled = false;
		private JButton button;

		public HireListener(JButton button) {
			this.button = button;
		}

		//Required by ActionListener.
		public void actionPerformed(ActionEvent e) {
			String name = employeeName.getText();

			//User didn't type in a unique name...
			if (name.equals("") || listModel.contains(name)) {
				Toolkit.getDefaultToolkit().beep();
				employeeName.requestFocusInWindow();
				employeeName.selectAll();
				return;
			}

			int index = list.getSelectedIndex(); //get selected index
			if (index == -1) { //no selection, so insert at beginning
				index = 0;
			} else {           //add after the selected item
				index++;
			}
			//어떤데이터를 어떻게 넣어주는지
			listModel.insertElementAt(employeeName.getText(), index);
			//If we just wanted to add to the end, we'd do this:
			//listModel.addElement(employeeName.getText());

			//Reset the text field.
			employeeName.requestFocusInWindow();
			employeeName.setText("");

			//Select the new item and make it visible.
			list.setSelectedIndex(index);
			list.ensureIndexIsVisible(index);
		}

	
		//Required by DocumentListener.
		public void insertUpdate(DocumentEvent e) {
			enableButton();
		}

		//Required by DocumentListener.
		public void removeUpdate(DocumentEvent e) {
			handleEmptyTextField(e);
		}

		//Required by DocumentListener.
		public void changedUpdate(DocumentEvent e) {
			if (!handleEmptyTextField(e)) {
				enableButton();
			}
		}

		private void enableButton() {
			if (!alreadyEnabled) {
				button.setEnabled(true);
			}
		}

		private boolean handleEmptyTextField(DocumentEvent e) {
			if (e.getDocument().getLength() <= 0) {
				button.setEnabled(false);
				alreadyEnabled = false;
				return true;
			}
			return false;
		}
	}

	//This method is required by ListSelectionListener.
	public void valueChanged(ListSelectionEvent e) {
		if (e.getValueIsAdjusting() == false) {

			if (list.getSelectedIndex() == -1) {
				//No selection, disable fire button.
				fireButton.setEnabled(false);

			} else {
				//Selection, enable the fire button.
				fireButton.setEnabled(true);
			}
		}
	}

	/**
	 * Create the GUI and show it.  For thread safety,
	 * this method should be invoked from the
	 * event-dispatching thread.
	 */
	private static void createAndShowGUI() {

	}


}