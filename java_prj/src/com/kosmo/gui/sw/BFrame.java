package com.kosmo.gui.sw;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;
import javax.swing.ImageIcon;
import java.awt.event.KeyAdapter;

public class BFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					BFrame frame = new BFrame();
//					frame.setVisible(true);//버튼이 눌렸을 때 보여줘
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 */
	//AFrame aframeNewAddr = new AFrame();
	//a.add()
	public BFrame(AFrame aframeNewAddr) {
		//Frame 크기설정
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(120, 120, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		ImageIcon icon = new ImageIcon(BFrame.class.getResource("/com/kosmo/gui/switc/imge/save-icon.png"));
		ImageIcon resizeicon = new ImageIcon(icon.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH));
		mnFile.setIcon(resizeicon);
		mnFile.setMnemonic('F');
		menuBar.add(mnFile);
		
		
		
		JMenuItem mntmOpen = new JMenuItem("Open");
		
		ImageIcon icono = new ImageIcon(BFrame.class.getResource("/com/kosmo/gui/switc/imge/다운로드.jpg"));
		ImageIcon resizeicono = new ImageIcon(icono.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH));
		mntmOpen.setIcon(resizeicono);
		mntmOpen.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, InputEvent.CTRL_MASK));
		mntmOpen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Open");
			}
		});
	
		mnFile.add(mntmOpen);
		
		
		JMenuItem mntmS = new JMenuItem("Save");
		mntmS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Save");
			}
		});
		
		
		mntmS.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_MASK));
		mnFile.add(mntmS);
		
		JMenuItem mntmClose = new JMenuItem("Close");
		mntmClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//System.exit(1);
				BFrame.this.setVisible(false); //이렇게하면 보이는 창만닫힘
			}
		});
		mntmClose.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, InputEvent.CTRL_MASK));
		mnFile.add(mntmClose);
		
		JMenu mnEdit = new JMenu("Edit");
		mnEdit.setMnemonic('E');
		menuBar.add(mnEdit);
		//JPanel 설정
		contentPane = new JPanel();
		contentPane.setBackground(Color.RED);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		//Frame에 JPanel 올리기
		
		setContentPane(contentPane);
		
		JButton btnNewButton = new JButton("BFrame"+aframeNewAddr.applTextStr);
		contentPane.add(btnNewButton, BorderLayout.WEST);
		
		
		
	}

}
