package com.kosmo.project;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Scrollbar;
import javax.swing.JSpinner;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.List;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Checkilst2 extends JFrame {

	private JPanel contentPane;
//	private JPanel buttonPanel;
	
	JLabel PLabel_1;
	JLabel PLabel_2;
	JLabel PLabel_3;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					Checkilst2 frame = new Checkilst2();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}
	/**
	 * Create the frame.
	 */
	public Checkilst2(ProjectVO projectvo) {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(210, 180, 140));
		contentPane.add(panel, BorderLayout.NORTH);
		
		JLabel TLabel = new JLabel("3.양(몇명기준)");
		TLabel.setFont(new Font("맑은 고딕", Font.BOLD, 25));
		
		PLabel_1 = new JLabel("");
		PLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//한사람
				PLabel_1.setIcon(new ImageIcon("C:\\Users\\kosmo_22\\Desktop\\프로젝트 이미지\\한마리.png"));
				PLabel_2.setIcon(new ImageIcon("C:\\Users\\kosmo_22\\Desktop\\프로젝트 이미지\\두사람.png"));
				PLabel_3.setIcon(new ImageIcon("C:\\Users\\kosmo_22\\Desktop\\프로젝트 이미지\\다수.png"));
				projectvo.setAmount(1);
				
			}
		});
		PLabel_1.setIcon(new ImageIcon("C:\\Users\\kosmo_22\\Desktop\\프로젝트 이미지\\한사람.png"));
		
		PLabel_2 = new JLabel("");
		PLabel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//두사람
				PLabel_2.setIcon(new ImageIcon("C:\\Users\\kosmo_22\\Desktop\\프로젝트 이미지\\두마리.png"));
				PLabel_1.setIcon(new ImageIcon("C:\\Users\\kosmo_22\\Desktop\\프로젝트 이미지\\한사람.png"));
				PLabel_3.setIcon(new ImageIcon("C:\\Users\\kosmo_22\\Desktop\\프로젝트 이미지\\다수.png"));
				projectvo.setAmount(2);
			}
		});
		PLabel_2.setIcon(new ImageIcon("C:\\Users\\kosmo_22\\Desktop\\프로젝트 이미지\\두사람.png"));
		
		PLabel_3 = new JLabel("");
		PLabel_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//다수
				PLabel_3.setIcon(new ImageIcon("C:\\Users\\kosmo_22\\Desktop\\프로젝트 이미지\\세마리.png"));
				PLabel_1.setIcon(new ImageIcon("C:\\Users\\kosmo_22\\Desktop\\프로젝트 이미지\\한사람.png"));
				PLabel_2.setIcon(new ImageIcon("C:\\Users\\kosmo_22\\Desktop\\프로젝트 이미지\\두사람.png"));
				projectvo.setAmount(3);
			}
		});
		PLabel_3.setIcon(new ImageIcon("C:\\Users\\kosmo_22\\Desktop\\프로젝트 이미지\\다수.png"));
		
		JLabel lblNewLabel = new JLabel("4.순살/뼈");
		lblNewLabel.setFont(new Font("맑은 고딕", Font.BOLD, 25));
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\kosmo_22\\Desktop\\프로젝트 이미지\\4번첫번째글씨.png"));
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\kosmo_22\\Desktop\\프로젝트 이미지\\4번두번째글씨수정.png"));
		
		
		String[] combo = {"   ","   순살","    뼈"};
		JComboBox comboBox = new JComboBox(combo);
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				  JComboBox cb = (JComboBox) e.getSource(); // 콤보박스 알아내기

                  int index = cb.getSelectedIndex();// 선택된 아이템의 인덱스
                  projectvo.setType(index);
                  
			}
		});
		comboBox.setFont(new Font("맑은 고딕", Font.BOLD, 31));
		
		
		
		
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\kosmo_22\\Desktop\\프로젝트 이미지\\자,결과.png"));
		
		JLabel lblNewLabel_5 = new JLabel("5.종류");
		lblNewLabel_5.setFont(new Font("맑은 고딕", Font.BOLD, 25));
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon("C:\\Users\\kosmo_22\\Desktop\\프로젝트 이미지\\양념.png"));
		
		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setIcon(new ImageIcon("C:\\Users\\kosmo_22\\Desktop\\프로젝트 이미지\\후라이드.png"));
		
		JLabel lblNewLabel_8 = new JLabel("");
		lblNewLabel_8.setIcon(new ImageIcon("C:\\Users\\kosmo_22\\Desktop\\프로젝트 이미지\\시즈닝.png"));
		
		JLabel lblNewLabel_9 = new JLabel("");
		lblNewLabel_9.setIcon(new ImageIcon("C:\\Users\\kosmo_22\\Desktop\\프로젝트 이미지\\간장.png"));
		
		JRadioButton 양념 = new JRadioButton("");
		양념.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				projectvo.setKind(1);
			}
		});
		
		양념.setBackground(new Color(210, 180, 140));
		
		JRadioButton 후라이드 = new JRadioButton("");
		후라이드.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				projectvo.setKind(2);
			}
		});
		후라이드.setBackground(new Color(210, 180, 140));
		
		JRadioButton 시즈닝 = new JRadioButton("");
		시즈닝.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				projectvo.setKind(3);
			}
		});
		시즈닝.setBackground(new Color(210, 180, 140));
		
		JRadioButton 간장 = new JRadioButton("");
		간장.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				projectvo.setKind(4);
				
			}
		});
		
		간장.setBackground(new Color(210, 180, 140));
		
		JRadioButton 갈릭 = new JRadioButton("");
		갈릭.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				projectvo.setKind(5);
			}
		});
		
		갈릭.setBackground(new Color(210, 180, 140));
		
		ButtonGroup  group = new ButtonGroup();
		group.add(양념);
		group.add(후라이드);
		group.add(시즈닝);
		group.add(간장);
		group.add(갈릭);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ResultFrame frame = new ResultFrame(projectvo);
				frame.setVisible(true);
				Checkilst2.this.setVisible(false);
			}
		});
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\kosmo_22\\Desktop\\프로젝트 이미지\\화살표.png"));
		
		JLabel returnLabel_10 = new JLabel("");
		returnLabel_10.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Checkilst1 frame = new Checkilst1(projectvo);
				frame.setVisible(true);
				Checkilst2.this.setVisible(false);	
				
				
			}
		});
		returnLabel_10.setIcon(new ImageIcon("C:\\Users\\kosmo_22\\Desktop\\프로젝트 이미지\\왼쪽화살표.png"));
		
		JLabel lblNewLabel_11 = new JLabel("");
		lblNewLabel_11.setIcon(new ImageIcon("C:\\Users\\kosmo_22\\Desktop\\프로젝트 이미지\\다시글씨.png"));
		
		JLabel lblNewLabel_10 = new JLabel("");
		lblNewLabel_10.setIcon(new ImageIcon("C:\\Users\\kosmo_22\\Desktop\\프로젝트 이미지\\갈릭글씨.png"));
		
		
		
//		list.addListSelectionListener(this);
//		contentPane.add(list, BorderLayout.CENTER);
//		buttonPanel = new JPanel();
//		contentPane.add(buttonPanel, BorderLayout.SOUTH);
//		buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.X_AXIS));
		


		
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblNewLabel_5))
						.addGroup(gl_panel.createSequentialGroup()
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel.createSequentialGroup()
									.addContainerGap()
									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_panel.createSequentialGroup()
											.addComponent(lblNewLabel_6)
											.addGap(42)
											.addComponent(lblNewLabel_7))
										.addGroup(gl_panel.createSequentialGroup()
											.addGap(28)
											.addComponent(양념)
											.addGap(135)
											.addComponent(후라이드))))
								.addGroup(gl_panel.createSequentialGroup()
									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
										.addGroup(gl_panel.createSequentialGroup()
											.addContainerGap()
											.addComponent(TLabel)
											.addGap(176))
										.addGroup(gl_panel.createSequentialGroup()
											.addGap(26)
											.addComponent(PLabel_1)
											.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
											.addComponent(PLabel_2)
											.addGap(50)))
									.addComponent(PLabel_3)
									.addPreferredGap(ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
									.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
										.addComponent(returnLabel_10)
										.addComponent(lblNewLabel_11))
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
										.addComponent(lblNewLabel_4)
										.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)))
								.addGroup(gl_panel.createSequentialGroup()
									.addGap(15)
									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
										.addComponent(lblNewLabel)
										.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
											.addGroup(gl_panel.createSequentialGroup()
												.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
													.addGroup(gl_panel.createSequentialGroup()
														.addGap(54)
														.addComponent(시즈닝))
													.addGroup(gl_panel.createSequentialGroup()
														.addPreferredGap(ComponentPlacement.RELATED)
														.addComponent(lblNewLabel_8)))
												.addGap(11)
												.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
													.addGroup(gl_panel.createSequentialGroup()
														.addGap(49)
														.addComponent(lblNewLabel_9)
														.addGap(48)
														.addComponent(lblNewLabel_10, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE))
													.addGroup(gl_panel.createSequentialGroup()
														.addGap(78)
														.addComponent(간장)
														.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
														.addComponent(갈릭)
														.addGap(38))))
											.addGroup(gl_panel.createSequentialGroup()
												.addComponent(lblNewLabel_1)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 141, GroupLayout.PREFERRED_SIZE)
												.addGap(12)
												.addComponent(lblNewLabel_2))))))
							.addGap(109)))
					.addContainerGap())
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap()
							.addComponent(TLabel)
							.addGap(31)
							.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
								.addComponent(PLabel_1)
								.addComponent(PLabel_3)
								.addComponent(PLabel_2))
							.addGap(38)
							.addComponent(lblNewLabel))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(20)
							.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
								.addComponent(returnLabel_10)
								.addComponent(lblNewLabel_3))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_11)
								.addComponent(lblNewLabel_4))))
					.addPreferredGap(ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_2)
						.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
							.addComponent(lblNewLabel_1)
							.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING, false)
						.addGroup(gl_panel.createSequentialGroup()
							.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_panel.createSequentialGroup()
									.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
										.addComponent(lblNewLabel_7)
										.addGroup(gl_panel.createSequentialGroup()
											.addComponent(lblNewLabel_5)
											.addGap(18)
											.addComponent(lblNewLabel_6))
										.addComponent(lblNewLabel_8))
									.addGap(18))
								.addGroup(gl_panel.createSequentialGroup()
									.addComponent(lblNewLabel_9, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)))
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
										.addComponent(양념)
										.addComponent(후라이드))
									.addComponent(시즈닝))
								.addComponent(간장)))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(lblNewLabel_10)
							.addGap(18)
							.addComponent(갈릭)
							.addPreferredGap(ComponentPlacement.RELATED)))
					.addGap(36))
		);
		panel.setLayout(gl_panel);
	}
}
