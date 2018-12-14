package com.kosmo.gui.sw;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class ApplicationSwitchTest {

//	private JFrame frame;
	AFrame aframe;
	BFrame bframe; //extends JFrame
	
	

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					ApplicationSwitchTest window = new ApplicationSwitchTest();
//					//window.frame.setVisible(true);메인에다가 해도되고 밑에다 해도됨.
//							//frame.setVisible(true); 프레임일땐 이렇게만.
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the application.
	 */
	public ApplicationSwitchTest(FrameSwitchTest frmADDR) {
			
//			frame = new JFrame();///프레임이 아니기 때문에 frame을 new해준다.
//			frame.setBounds(100, 100, 450, 300);
//			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			
		
			
			
//			JButton btnNewButton = new JButton("BFrame 실행");//B프레임만 실행해라
//			btnNewButton.addActionListener(new ActionListener() {
//				public void actionPerformed(ActionEvent e) {
//					aframe.setVisible(false);//BFrame 버튼 눌렀을때 없어짐.
//					
//					
//					bframe = new BFrame();
//					bframe.setVisible(true);//버튼이 눌렸을 때 보여줘
//					//어플리케이션은 하나인데 프레임이 여러개있음
//				}
//			});
			
			//frame.getContentPane() --> 패널 .add()/ Container.window.jcomponenet.add()
//			frame.getContentPane().add(btnNewButton, BorderLayout.WEST);
			
			//frame.add(panel)
			//setContentPane(contentPane);
			aframe= new AFrame(frmADDR);
			aframe.setVisible(true);
		}

	}
	


