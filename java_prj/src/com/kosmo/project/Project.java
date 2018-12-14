package com.kosmo.project;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.JTextArea;
import javax.swing.JSpinner;
import javax.swing.JToggleButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import javax.swing.JPasswordField;
import javax.swing.JMenu;
import java.awt.List;

public class Project extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Project frame = new Project();
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
	public Project() {
		ProjectVO projectvo =new ProjectVO();

		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(210, 180, 140));
		contentPane.add(panel, BorderLayout.CENTER);
		
		JLabel cpLabel = new JLabel("");
		cpLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				Checkilst1 frame = new Checkilst1(projectvo);
				frame.setVisible(true);
				Project.this.setVisible(false);
				
				
			}
		});
		cpLabel.setIcon(new ImageIcon("C:\\Users\\kosmo_22\\Desktop\\프로젝트 이미지\\치킨사이즈조정.png"));
		
		JLabel textLabel_1 = new JLabel("");
		textLabel_1.setIcon(new ImageIcon("C:\\Users\\kosmo_22\\Desktop\\프로젝트 이미지\\치킨문구.png"));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap(239, Short.MAX_VALUE)
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(textLabel_1)
							.addGap(211))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(cpLabel)
							.addGap(281))))
		);
		

		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(47)
					.addComponent(cpLabel)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textLabel_1)
					.addContainerGap(134, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
	}
}
