package com.kosmo.project;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingConstants;

public class Checkilst1 extends JFrame {

	private JPanel contentPane;
	JLabel BLabel_1;
	JLabel BLabel_2;
	JLabel BLabel_3;
	JLabel BLabel_4;
	JLabel ML1;
	JLabel ML2;
	JLabel ML3;
	JLabel ML4;
	
	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					Checkilst1 frame = new Checkilst1();
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
	public Checkilst1(ProjectVO projectvo) {
		
		setResizable(false);		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(210, 180, 140));
		
		contentPane.add(panel, BorderLayout.CENTER);
		
		JLabel CtLabel = new JLabel("1.바삭한정도(Crispy)");
		CtLabel.setFont(new Font("맑은 고딕", Font.BOLD, 25));
		
		
		
		BLabel_1 = new JLabel("");
		BLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//바삭코딩
				BLabel_1.setIcon(new ImageIcon("C:\\Users\\kosmo_22\\Desktop\\프로젝트 이미지\\달걀바삭.png"));
				BLabel_2.setIcon(new ImageIcon("C:\\Users\\kosmo_22\\Desktop\\프로젝트 이미지\\바삭달걀.png"));
				BLabel_3.setIcon(new ImageIcon("C:\\Users\\kosmo_22\\Desktop\\프로젝트 이미지\\바삭달걀.png"));
				BLabel_4.setIcon(new ImageIcon("C:\\Users\\kosmo_22\\Desktop\\프로젝트 이미지\\바삭달걀.png"));
				projectvo.setCrispy(1);
				
				
			}
			
		});
		BLabel_1.setIcon(new ImageIcon("C:\\Users\\kosmo_22\\Desktop\\프로젝트 이미지\\바삭달걀.png"));
		
		BLabel_2 = new JLabel("");
		BLabel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//바사삭코딩
				BLabel_2.setIcon(new ImageIcon("C:\\Users\\kosmo_22\\Desktop\\프로젝트 이미지\\병아리바사삭.png"));
				BLabel_1.setIcon(new ImageIcon("C:\\Users\\kosmo_22\\Desktop\\프로젝트 이미지\\바삭달걀.png"));
				BLabel_3.setIcon(new ImageIcon("C:\\Users\\kosmo_22\\Desktop\\프로젝트 이미지\\바삭달걀.png"));
				BLabel_4.setIcon(new ImageIcon("C:\\Users\\kosmo_22\\Desktop\\프로젝트 이미지\\바삭달걀.png"));
				projectvo.setCrispy(2);
			}
		});
		BLabel_2.setIcon(new ImageIcon("C:\\Users\\kosmo_22\\Desktop\\프로젝트 이미지\\바삭달걀.png"));
		
		BLabel_3 = new JLabel("");
		BLabel_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//바사사삭코딩
				BLabel_3.setIcon(new ImageIcon("C:\\Users\\kosmo_22\\Desktop\\프로젝트 이미지\\닭바사삭.png"));
				BLabel_1.setIcon(new ImageIcon("C:\\Users\\kosmo_22\\Desktop\\프로젝트 이미지\\바삭달걀.png"));
				BLabel_2.setIcon(new ImageIcon("C:\\Users\\kosmo_22\\Desktop\\프로젝트 이미지\\바삭달걀.png"));
				BLabel_4.setIcon(new ImageIcon("C:\\Users\\kosmo_22\\Desktop\\프로젝트 이미지\\바삭달걀.png"));
				projectvo.setCrispy(3);
			}
		});
		BLabel_3.setIcon(new ImageIcon("C:\\Users\\kosmo_22\\Desktop\\프로젝트 이미지\\바삭달걀.png"));
		
		BLabel_4 = new JLabel("");
		BLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		BLabel_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				BLabel_4.setIcon(new ImageIcon("C:\\Users\\kosmo_22\\Desktop\\프로젝트 이미지\\오븐치킨.png"));
				BLabel_1.setIcon(new ImageIcon("C:\\Users\\kosmo_22\\Desktop\\프로젝트 이미지\\바삭달걀.png"));
				BLabel_2.setIcon(new ImageIcon("C:\\Users\\kosmo_22\\Desktop\\프로젝트 이미지\\바삭달걀.png"));
				BLabel_3.setIcon(new ImageIcon("C:\\Users\\kosmo_22\\Desktop\\프로젝트 이미지\\바삭달걀.png"));
				projectvo.setCrispy(4);
			}
		});
		BLabel_4.setIcon(new ImageIcon("C:\\Users\\kosmo_22\\Desktop\\프로젝트 이미지\\바삭달걀.png"));
		
		JLabel BTLabel1 = new JLabel("");
		BTLabel1.setIcon(new ImageIcon("C:\\Users\\kosmo_22\\Desktop\\프로젝트 이미지\\바삭글씨.png"));
		
		JLabel BTLabel2 = new JLabel("");
		BTLabel2.setIcon(new ImageIcon("C:\\Users\\kosmo_22\\Desktop\\프로젝트 이미지\\바사삭글씨.png"));
		
		JLabel BTLabel3 = new JLabel("");
		BTLabel3.setIcon(new ImageIcon("C:\\Users\\kosmo_22\\Desktop\\프로젝트 이미지\\바사사삭글씨.png"));
		
		JLabel PriceLabel = new JLabel("2.가격(Price)");
		PriceLabel.setFont(new Font("맑은 고딕", Font.BOLD, 25));
		
		ML1 = new JLabel("");
		ML1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//9-15
				ML1.setIcon(new ImageIcon("C:\\Users\\kosmo_22\\Desktop\\프로젝트 이미지\\영수증.png"));
				ML2.setIcon(new ImageIcon("C:\\Users\\kosmo_22\\Desktop\\프로젝트 이미지\\돈.png"));
				ML3.setIcon(new ImageIcon("C:\\Users\\kosmo_22\\Desktop\\프로젝트 이미지\\돈.png"));
				ML4.setIcon(new ImageIcon("C:\\Users\\kosmo_22\\Desktop\\프로젝트 이미지\\돈.png"));
				projectvo.setPrice(1);
			}
		});
		ML1.setIcon(new ImageIcon("C:\\Users\\kosmo_22\\Desktop\\프로젝트 이미지\\돈.png"));
		
		ML2 = new JLabel("");
		ML2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//16-18
				ML2.setIcon(new ImageIcon("C:\\Users\\kosmo_22\\Desktop\\프로젝트 이미지\\영수증.png"));
				ML1.setIcon(new ImageIcon("C:\\Users\\kosmo_22\\Desktop\\프로젝트 이미지\\돈.png"));
				ML3.setIcon(new ImageIcon("C:\\Users\\kosmo_22\\Desktop\\프로젝트 이미지\\돈.png"));
				ML4.setIcon(new ImageIcon("C:\\Users\\kosmo_22\\Desktop\\프로젝트 이미지\\돈.png"));
				projectvo.setPrice(2);
			}
		});
		ML2.setIcon(new ImageIcon("C:\\Users\\kosmo_22\\Desktop\\프로젝트 이미지\\돈.png"));
		
		ML3 = new JLabel("");
		ML3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//19-21
				ML3.setIcon(new ImageIcon("C:\\Users\\kosmo_22\\Desktop\\프로젝트 이미지\\영수증.png"));
				ML1.setIcon(new ImageIcon("C:\\Users\\kosmo_22\\Desktop\\프로젝트 이미지\\돈.png"));
				ML2.setIcon(new ImageIcon("C:\\Users\\kosmo_22\\Desktop\\프로젝트 이미지\\돈.png"));
				ML4.setIcon(new ImageIcon("C:\\Users\\kosmo_22\\Desktop\\프로젝트 이미지\\돈.png"));
				projectvo.setPrice(3);
			}
		});
		ML3.setIcon(new ImageIcon("C:\\Users\\kosmo_22\\Desktop\\프로젝트 이미지\\돈.png"));
		
		ML4 = new JLabel("");
		ML4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//22-25
				ML4.setIcon(new ImageIcon("C:\\Users\\kosmo_22\\Desktop\\프로젝트 이미지\\영수증.png"));
				ML1.setIcon(new ImageIcon("C:\\Users\\kosmo_22\\Desktop\\프로젝트 이미지\\돈.png"));
				ML2.setIcon(new ImageIcon("C:\\Users\\kosmo_22\\Desktop\\프로젝트 이미지\\돈.png"));
				ML3.setIcon(new ImageIcon("C:\\Users\\kosmo_22\\Desktop\\프로젝트 이미지\\돈.png"));
				projectvo.setPrice(4);
			}
		});
		ML4.setIcon(new ImageIcon("C:\\Users\\kosmo_22\\Desktop\\프로젝트 이미지\\돈.png"));
		
		JLabel Label_915 = new JLabel("");
		Label_915.setIcon(new ImageIcon("C:\\Users\\kosmo_22\\Desktop\\프로젝트 이미지\\첫번째 가격.png"));
		
		JLabel Label_1618 = new JLabel("");
		Label_1618.setIcon(new ImageIcon("C:\\Users\\kosmo_22\\Desktop\\프로젝트 이미지\\두번째가격.png"));
		
		JLabel Label_1921 = new JLabel("");
		Label_1921.setIcon(new ImageIcon("C:\\Users\\kosmo_22\\Desktop\\프로젝트 이미지\\세번째가격.png"));
		
		JLabel Label_2225 = new JLabel("");
		Label_2225.setIcon(new ImageIcon("C:\\Users\\kosmo_22\\Desktop\\프로젝트 이미지\\네번째가격.png"));
		
		JLabel ALabel = new JLabel("");
		ALabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Checkilst2 frame = new Checkilst2(projectvo);
				frame.setVisible(true);
				Checkilst1.this.setVisible(false);
				
			}
		});
		ALabel.setIcon(new ImageIcon("C:\\Users\\kosmo_22\\Desktop\\프로젝트 이미지\\화살표.png"));
		if(projectvo.getCrispy()==1) {
			BLabel_1.setIcon(new ImageIcon("C:\\Users\\kosmo_22\\Desktop\\프로젝트 이미지\\달걀바삭.png"));
			
		}else if(projectvo.getCrispy()==2){
			BLabel_2.setIcon(new ImageIcon("C:\\Users\\kosmo_22\\Desktop\\프로젝트 이미지\\병아리바사삭.png"));

			
		}else if(projectvo.getCrispy()==3) {
			BLabel_3.setIcon(new ImageIcon("C:\\Users\\kosmo_22\\Desktop\\프로젝트 이미지\\닭바사삭.png"));
			
		}else if(projectvo.getCrispy()==4) {
			BLabel_4.setIcon(new ImageIcon("C:\\Users\\kosmo_22\\Desktop\\프로젝트 이미지\\오븐치킨.png"));
			
		}
		
		if(projectvo.getPrice()==1) {
			ML1.setIcon(new ImageIcon("C:\\Users\\kosmo_22\\Desktop\\프로젝트 이미지\\영수증.png"));
			
		}else if(projectvo.getPrice()==2) {
			ML2.setIcon(new ImageIcon("C:\\Users\\kosmo_22\\Desktop\\프로젝트 이미지\\영수증.png"));

		}else if(projectvo.getPrice()==3) {
			ML3.setIcon(new ImageIcon("C:\\Users\\kosmo_22\\Desktop\\프로젝트 이미지\\영수증.png"));

		}else if(projectvo.getPrice()==3) {
			ML4.setIcon(new ImageIcon("C:\\Users\\kosmo_22\\Desktop\\프로젝트 이미지\\영수증.png"));
		}
		
		
		JLabel NextLabel = new JLabel("");
		NextLabel.setIcon(new ImageIcon("C:\\Users\\kosmo_22\\Desktop\\프로젝트 이미지\\자다음글씨.png"));
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\kosmo_22\\Desktop\\프로젝트 이미지\\훈제글씨.png"));
		
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel.createSequentialGroup()
									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_panel.createSequentialGroup()
											.addGap(9)
											.addComponent(ML1))
										.addGroup(gl_panel.createSequentialGroup()
											.addGap(16)
											.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
												.addComponent(BTLabel1)
												.addComponent(BLabel_1))))
									.addGap(67)
									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_panel.createSequentialGroup()
											.addGap(13)
											.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
												.addComponent(BLabel_2)
												.addComponent(BTLabel2)))
										.addComponent(ML2))
									.addPreferredGap(ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
										.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
											.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
												.addComponent(Label_1921)
												.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
													.addComponent(ML3)
													.addComponent(BTLabel3)))
											.addGap(57))
										.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
											.addComponent(BLabel_3)
											.addGap(101))))
								.addGroup(gl_panel.createSequentialGroup()
									.addComponent(CtLabel)
									.addPreferredGap(ComponentPlacement.RELATED)))
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED, 5, Short.MAX_VALUE)
									.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
										.addGroup(gl_panel.createSequentialGroup()
											.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
												.addComponent(Label_2225)
												.addComponent(ML4))
											.addGap(37))
										.addGroup(gl_panel.createSequentialGroup()
											.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
												.addComponent(ALabel)
												.addComponent(NextLabel))
											.addGap(21))))
								.addGroup(gl_panel.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
										.addComponent(lblNewLabel)
										.addComponent(BLabel_4))
									.addContainerGap())))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(Label_915)
							.addGap(41)
							.addComponent(Label_1618))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(PriceLabel)
							.addContainerGap(625, Short.MAX_VALUE))))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap()
							.addComponent(BLabel_3))
						.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING, false)
							.addGroup(gl_panel.createSequentialGroup()
								.addGap(22)
								.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
									.addGroup(gl_panel.createSequentialGroup()
										.addComponent(CtLabel)
										.addGap(16))
									.addGroup(gl_panel.createSequentialGroup()
										.addComponent(ALabel)
										.addPreferredGap(ComponentPlacement.RELATED)))
								.addComponent(NextLabel)
								.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
									.addComponent(BLabel_1)
									.addComponent(BLabel_2)))
							.addGroup(gl_panel.createSequentialGroup()
								.addGap(111)
								.addComponent(BLabel_4))))
					.addGap(28)
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
							.addComponent(lblNewLabel)
							.addComponent(BTLabel3))
						.addComponent(BTLabel2)
						.addComponent(BTLabel1))
					.addGap(35)
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(PriceLabel)
							.addGap(31)
							.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
								.addComponent(ML2)
								.addComponent(ML1)))
						.addComponent(ML4)
						.addComponent(ML3))
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(Label_915)
						.addComponent(Label_1618)
						.addComponent(Label_2225)
						.addComponent(Label_1921))
					.addGap(23))
		);
		panel.setLayout(gl_panel);
	}
}
