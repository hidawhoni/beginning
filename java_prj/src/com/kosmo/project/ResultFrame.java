package com.kosmo.project;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ResultFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					
//					ResultFrame frame = new ResultFrame();
//					frame.setVisible(true);
//					
//					
//					
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 */
	public ResultFrame(ProjectVO projectvo) {
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
		panel.setLayout(null);
		
		JLabel cpLabel = new JLabel("");
		cpLabel.setHorizontalAlignment(SwingConstants.CENTER);
		cpLabel.setBounds(96, 55, 582, 369);
		panel.add(cpLabel);
		
		JLabel cnameLabel = new JLabel("");
		cnameLabel.setFont(new Font("맑은 고딕", Font.BOLD, 30));
		cnameLabel.setHorizontalAlignment(SwingConstants.CENTER);
		cnameLabel.setBounds(35, 434, 699, 62);
		panel.add(cnameLabel);
		
		JLabel onemoreLabel = new JLabel("");
		onemoreLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Project frame = new Project();
				frame.setVisible(true);
				ResultFrame.this.setVisible(false);

			}
		});
		onemoreLabel.setIcon(new ImageIcon("C:\\Users\\kosmo_22\\Desktop\\프로젝트 이미지\\return.png"));
		onemoreLabel.setBounds(673, 20, 78, 76);
		panel.add(onemoreLabel);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\kosmo_22\\Desktop\\프로젝트 이미지\\tryagain.png"));
		lblNewLabel.setBounds(661, 106, 101, 20);
		panel.add(lblNewLabel);
		
		ProjectDBImpl projectimpl= new ProjectDBImpl();
		try {
		ArrayList<ProjectVO> list = projectimpl.chickenList(projectvo);
		
		ProjectVO pjv = (ProjectVO)list.get(0);
		
		String cph=pjv.getCname();
		if(cph.equals("bhc뿌링클")) {
			cpLabel.setIcon(new ImageIcon("C:\\Users\\kosmo_22\\Desktop\\프로젝트 이미지\\bhc뿌링클.png"));
			cnameLabel.setText("bhc뿌링클"+" "+"17000원");
		}
		else if(cph.equals("처갓집 슈프림와락")) {
			cpLabel.setIcon(new ImageIcon("C:\\Users\\kosmo_22\\Desktop\\프로젝트 이미지\\처갓집슈프림+와락.png"));
			cnameLabel.setText("처갓집 슈프림와락"+" "+"20000원(반반세트)");
		}
		else if(cph.equals("처갓집 슈프림")) {
			cpLabel.setIcon(new ImageIcon("C:\\Users\\kosmo_22\\Desktop\\프로젝트 이미지\\처갓집슈프림양념.png"));
			cnameLabel.setText("처갓집 슈프림"+" "+"18000원");
		}
		else if(cph.equals("처갓집 와락")) {
			cpLabel.setIcon(new ImageIcon("C:\\Users\\kosmo_22\\Desktop\\프로젝트 이미지\\처갓집와락치킨.png"));
			cnameLabel.setText("처갓집 와락"+" "+"18000원");
		
	}
		else if(cph.equals("네네치킨쇼킹핫반크리미언반")) {
			cpLabel.setIcon(new ImageIcon("C:\\Users\\kosmo_22\\Desktop\\프로젝트 이미지\\네네크리미쇼킹반.png"));
			cnameLabel.setText("네네치킨쇼킹핫반크리미언반"+" "+"18000원");
}
		else if(cph.equals("네네치킨 오리엔탈파닭")) {
			cpLabel.setIcon(new ImageIcon("C:\\Users\\kosmo_22\\Desktop\\프로젝트 이미지\\네네파닭.png"));
			cnameLabel.setText("네네치킨 오리엔탈파닭"+" "+"17000원");
		
}
		else if(cph.equals("호식이두마리 양념간장")) {
			cpLabel.setIcon(new ImageIcon("C:\\Users\\kosmo_22\\Desktop\\프로젝트 이미지\\호식이두마리치킨세트.png"));
			cnameLabel.setText("호식이두마리 양념간장"+" "+"23000원(두마리세트)");
		
}	
		else if(cph.equals("굽네치킨 갈비천왕")) {
			cpLabel.setIcon(new ImageIcon("C:\\Users\\kosmo_22\\Desktop\\프로젝트 이미지\\굽네갈비천왕.png"));
			cnameLabel.setText("굽네치킨 갈비천왕"+" "+"17000원");
}		
		else if(cph.equals("굽네치킨 오리지널")) {
			cpLabel.setIcon(new ImageIcon("C:\\Users\\kosmo_22\\Desktop\\프로젝트 이미지\\굽네오리지널.png"));
			cnameLabel.setText("굽네치킨 오리지널"+" "+"15000원");
}		
		else if(cph.equals("굽네치킨 볼케이노")) {
			cpLabel.setIcon(new ImageIcon("C:\\Users\\kosmo_22\\Desktop\\프로젝트 이미지\\굽네볼케이노.png"));
			cnameLabel.setText("굽네치킨 볼케이노"+" "+"17000원");
}		
		else if(cph.equals("굽네치킨 오리지널반볼케이노반")) {
			cpLabel.setIcon(new ImageIcon("C:\\Users\\kosmo_22\\Desktop\\프로젝트 이미지\\굽네오리지널볼케반.png"));
			cnameLabel.setText("굽네치킨 오리지널반볼케이노반"+" "+"17000원");
}		
		else if(cph.equals("교촌 허니콤보")) {
			cpLabel.setIcon(new ImageIcon("C:\\Users\\kosmo_22\\Desktop\\프로젝트 이미지\\교촌허니콤보.png"));
			cnameLabel.setText("교촌 허니콤보"+" "+"18000원");
}	
		else if(cph.equals("교촌 레드콤보")) {
			cpLabel.setIcon(new ImageIcon("C:\\Users\\kosmo_22\\Desktop\\프로젝트 이미지\\교촌레드콤보.png"));
			cnameLabel.setText("교촌 레드콤보"+" "+"18000원");
}	
		else if(cph.equals("교촌 콤보반반")) {
			cpLabel.setIcon(new ImageIcon("C:\\Users\\kosmo_22\\Desktop\\프로젝트 이미지\\교촌반반콤보.png"));
			cnameLabel.setText("교촌 콤보반반"+" "+"18000원");
}	
		else if(cph.equals("노랑통닭 순살반반치킨")) {
			cpLabel.setIcon(new ImageIcon("C:\\Users\\kosmo_22\\Desktop\\프로젝트 이미지\\노랑통닭반반.png"));
			cnameLabel.setText("노랑통닭 순살반반치킨"+" "+"17000원");
}	
		else if(cph.equals("노랑통닭 후라이드")) {
			cpLabel.setIcon(new ImageIcon("C:\\Users\\kosmo_22\\Desktop\\프로젝트 이미지\\노랑통닭후라이드.png"));
			cnameLabel.setText("노랑통닭 후라이드"+" "+"16000원");
}	
		else if(cph.equals("페리카나 치토스")) {
			cpLabel.setIcon(new ImageIcon("C:\\Users\\kosmo_22\\Desktop\\프로젝트 이미지\\페리카나치토스.png"));
			cnameLabel.setText("페리카나 치토스"+" "+"18000원");
}	
		else if(cph.equals("페리카나 후라이드")) {
			cpLabel.setIcon(new ImageIcon("C:\\Users\\kosmo_22\\Desktop\\프로젝트 이미지\\페리카나후라이드.png"));
			cnameLabel.setText("페리카나 후라이드"+" "+"15000원");
}	
		else if(cph.equals("맛닭꼬 현미베이크")) {
			cpLabel.setIcon(new ImageIcon("C:\\Users\\kosmo_22\\Desktop\\프로젝트 이미지\\맛닭꼬현미베이크.png"));
			cnameLabel.setText("맛닭꼬 현미베이크"+" "+"9900원");
}	
		else if(cph.equals("BBQ 황금올리브치킨")) {
			cpLabel.setIcon(new ImageIcon("C:\\Users\\kosmo_22\\Desktop\\프로젝트 이미지\\bbq올리브치킨.png"));
			cnameLabel.setText("BBQ 황금올리브치킨"+" "+"16000원");
}	
		else if(cph.equals("BBQ 황금올리브후라이드반매운양념반")) {
			cpLabel.setIcon(new ImageIcon("C:\\Users\\kosmo_22\\Desktop\\프로젝트 이미지\\bbq올리브반반.png"));
			cnameLabel.setText("BBQ 황금올리브후라이드반매운양념반"+" "+"17000원");
}	
		else if(cph.equals("BBQ 자메이카통다리")) {
			cpLabel.setIcon(new ImageIcon("C:\\Users\\kosmo_22\\Desktop\\프로젝트 이미지\\bbq자메이카.png"));
			cnameLabel.setText("BBQ 자메이카통다리"+" "+"17500원");
}	   
		else if(cph.equals("강정이기가막혀 기막힌 강정")) {
	       cpLabel.setIcon(new ImageIcon("C:\\Users\\kosmo_22\\Desktop\\프로젝트 이미지\\기막힌강정.png"));
	       cnameLabel.setText("강정이기가막혀 기막힌 강정"+" "+"16000원");
}	
		else if(cph.equals("강정이기가막혀 눈꽃 후라이드치킨")) {
		       cpLabel.setIcon(new ImageIcon("C:\\Users\\kosmo_22\\Desktop\\프로젝트 이미지\\강정이기가막혀눈꽃.png"));
		       cnameLabel.setText("강정이기가막혀 눈꽃 후라이드치킨"+" "+"17000원");
	}
		else if(cph.equals("호치킨 반반치킨")) {
		       cpLabel.setIcon(new ImageIcon("C:\\Users\\kosmo_22\\Desktop\\프로젝트 이미지\\호치킨 반반치킨.png"));
		       cnameLabel.setText("호치킨 반반치킨"+" "+"10900원");
	}
		else if(cph.equals("호치킨 양념치킨")) {
		       cpLabel.setIcon(new ImageIcon("C:\\Users\\kosmo_22\\Desktop\\프로젝트 이미지\\호치킨양념치킨.png"));
		       cnameLabel.setText("호치킨 양념치킨"+" "+"10900원");
	}
		else if(cph.equals("호치킨 간장치킨")) {
		       cpLabel.setIcon(new ImageIcon("C:\\Users\\kosmo_22\\Desktop\\프로젝트 이미지\\호치킨간장치킨.png"));
		       cnameLabel.setText("호치킨 간장치킨"+" "+"10900원");
	}
		else if(cph.equals("호치킨 치즈칠리로스트")) {
		       cpLabel.setIcon(new ImageIcon("C:\\Users\\kosmo_22\\Desktop\\프로젝트 이미지\\호치킨치즈칠리로스트.png"));
		       cnameLabel.setText("호치킨 치즈칠리로스트"+" "+"10900원");
	}
		else if(cph.equals("호치킨 데리갈릭치킨")) {
		       cpLabel.setIcon(new ImageIcon("C:\\Users\\kosmo_22\\Desktop\\프로젝트 이미지\\호치킨데리갈릭치킨.png"));
		       cnameLabel.setText("호치킨 데리갈릭치킨"+" "+"10900원");
	}
		else if(cph.equals("호치킨 치슐랭")) {
		       cpLabel.setIcon(new ImageIcon("C:\\Users\\kosmo_22\\Desktop\\프로젝트 이미지\\호치킨치슐랭.png"));
		       cnameLabel.setText("호치킨 치슐랭"+" "+"12500원");
	}
		else if(cph.equals("무봤나 촌닭 치즈새우촌닭")) {
		       cpLabel.setIcon(new ImageIcon("C:\\Users\\kosmo_22\\Desktop\\프로젝트 이미지\\무봤나촌닭치즈새우.png"));
		       cnameLabel.setText("무봤나 촌닭 치즈새우촌닭"+" "+"19000원");
	}
		else if(cph.equals("오븐에빠진닭 크리스피베이크")) {
		       cpLabel.setIcon(new ImageIcon("C:\\Users\\kosmo_22\\Desktop\\프로젝트 이미지\\오븐에빠진닭 크리스피.png"));
		       cnameLabel.setText("오븐에빠진닭 크리스피베이크"+" "+"15900원");
	}
		else if(cph.equals("오븐에빠진닭 오리지널로스트")) {
		       cpLabel.setIcon(new ImageIcon("C:\\Users\\kosmo_22\\Desktop\\프로젝트 이미지\\오븐에빠진닭로스트.png"));
		       cnameLabel.setText("오븐에빠진닭 오리지널로스트"+" "+"14900원");
	}
		else if(cph.equals("양계장집아들 양아들치킨")) {
		       cpLabel.setIcon(new ImageIcon("C:\\Users\\kosmo_22\\Desktop\\프로젝트 이미지\\양계장집아들후라이드.png"));
		       cnameLabel.setText("양계장집아들 양아들치킨"+" "+"11000원");
	}
		else if(cph.equals("지코바 순살양념구이")) {
		       cpLabel.setIcon(new ImageIcon("C:\\Users\\kosmo_22\\Desktop\\프로젝트 이미지\\지코바순살양념구이.png"));
		       cnameLabel.setText("지코바 순살양념구이"+" "+"19000원");
	}
		else if(cph.equals("또래오래 갈릭반핫양념반")) {
		       cpLabel.setIcon(new ImageIcon("C:\\Users\\kosmo_22\\Desktop\\프로젝트 이미지\\또래오래갈릭반양념반.png"));
		       cnameLabel.setText("또래오래 갈릭반핫양념반"+" "+"17000원");
	}
		else if(cph.equals("bhc커리퀸")) {
		       cpLabel.setIcon(new ImageIcon("C:\\Users\\kosmo_22\\Desktop\\프로젝트 이미지\\bhc커리퀸.png"));
		       cnameLabel.setText("bhc커리퀸"+" "+"17000원");
	}
		else if(cph.equals("굽네치킨 고추바사삭")) {
		       cpLabel.setIcon(new ImageIcon("C:\\Users\\kosmo_22\\Desktop\\프로젝트 이미지\\굽네고추바사삭.png"));
		       cnameLabel.setText("굽네치킨 고추바사삭"+" "+"16000원");
	}
		
		}
		
		catch(Exception e) {
			cpLabel.setIcon(new ImageIcon("C:\\Users\\kosmo_22\\Desktop\\프로젝트 이미지\\sad.png"));
			cnameLabel.setText("Sorry About That");
		}
}
}