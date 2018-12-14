package com.kosmo.gui.java;

import java.awt.BorderLayout;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;


import javax.swing.AbstractAction;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JToolBar;
import javax.swing.SwingUtilities;
import javax.swing.SwingWorker;
import java.awt.Component;

public class IconDemoApp extends JFrame {
	
	private JLabel bigimgLabel = new JLabel();
	private JToolBar buttonBar = new JToolBar();
	
	private String imagedir = "./img/";
	
	
	private MissingIcon xIcon = new MissingIcon();
	
	/**
	 * List of all the descriptions of the image files. These correspond one to
	 * one with the image file names
	 */
	private String[] imgTextArr = { "세상잘생긴공유", "The 질셍긴공유",
			"맨날잘생긴공유", "날이좋아서 잘생긴공유", "날이좋지않아도 잘생긴공유"};
	
	/**
	 * List of all the image files to load.
	 */
	private String[] imgNameArr = { "공유1.png", "공유2.png",
			"공유3.jpg", "공유4.jpg", "공유5.jpg"};
	
	/**
	 * Main entry point to the demo. Loads the Swing elements on the "Event
	 * Dispatch Thread".
	 *
	 * @param args
	 */
	public static void main(String args[]) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				IconDemoApp app = new IconDemoApp();
				app.setVisible(true);
			}
		});
	}
	
	/**
	 * Default constructor for the demo.
	 */
	public IconDemoApp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Icon Demo: Please Select an Image");
		setSize(800, 700);
		// this centers the frame on the screen
		setLocationRelativeTo(null);
//	        setBounds(100, 100, 450, 300);
		
		// A label for displaying the pictures/디자인담당
		bigimgLabel.setVerticalTextPosition(JLabel.BOTTOM);
		bigimgLabel.setHorizontalTextPosition(JLabel.CENTER);
		bigimgLabel.setHorizontalAlignment(JLabel.CENTER);
		bigimgLabel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		getContentPane().add(bigimgLabel, BorderLayout.CENTER);
		
		// We add two glue components. Later in process() we will add thumbnail buttons
		// to the toolbar inbetween thease glue compoents. This will center the
		// buttons in the toolbar.
		
		buttonBar.add(Box.createGlue());
		buttonBar.add(Box.createGlue());
		getContentPane().add(buttonBar, BorderLayout.SOUTH);
		
		// start the image loading SwingWorker in a background thread
		loadimages.execute();
	}
	
	
	
	private SwingWorker<Void, MyAction> loadimages = new SwingWorker<Void, MyAction>() {
		
		/**
		 * Creates full size and thumbnail versions of the target image files.
		 */
		@Override
		protected Void doInBackground() throws Exception {
			for (int i = 0; i < imgTextArr.length; i++) {
				
//	            	ImageIcon icon = createImageIcon(imagedir + imaNameArr[i], imgTextArr[i]);
				URL imgURL = getClass().getResource(imagedir + imgNameArr[i]);
				
				
				
				MyAction thumbAction;
				if(imgURL != null){
					
					ImageIcon icon =new ImageIcon(imgURL ,imgTextArr[i]);
//	                    ImageIcon thumbnailIcon = new ImageIcon(getScaledImage(icon.getImage(), 32, 32));
					ImageIcon resizeicon = new ImageIcon(icon.getImage().getScaledInstance(32, 32, Image.SCALE_SMOOTH));
					
					thumbAction = new MyAction(icon, resizeicon, imgTextArr[i]);
					
				}else{
					// the image failed to load for some reason
					// so load a placeholder instead
					thumbAction = new MyAction(xIcon, xIcon, "엑박입니다");
				}
				publish(thumbAction);
			}
			// unfortunately we must return something, and only null is valid to
			// return when the return type is void.
			return null;
		}
		
		/**
		 * Process all loaded images.
		 */
		@Override
		protected void process(List<MyAction> chunks) {
			for (MyAction thumbAction : chunks) {
				JButton thumbButton = new JButton(thumbAction);
				// add the new button BEFORE the last glue
				// this centers the buttons in the toolbar
				buttonBar.add(thumbButton, buttonBar.getComponentCount() - 1);
			}
		}
	};
	
	/**
	 * Creates an ImageIcon if the path is valid.
	 * @param String - resource path
	 * @param String - description of the file
	 */
//	    protected ImageIcon createImageIcon(String path,
//	            String text) {
//	        java.net.URL imgURL = getClass().getResource(path);
//	        if (imgURL != null) {
//	            return new ImageIcon(imgURL, text);
//	        } else {
//	            System.err.println("Couldn't find file: " + path);
//	            return null;
//	        }
//	    }
	
	/**
	 * Resizes an image using a Graphics2D object backed by a BufferedImage.
	 * @param srcImg - source image to scale
	 * @param w - desired width
	 * @param h - desired height
	 * @return - the new resized image
	 */
//	    private Image getScaledImage(Image srcImg, int w, int h){
//	        BufferedImage resizedImg = new BufferedImage(w, h, BufferedImage.TYPE_INT_RGB);
//	        Graphics2D g2 = resizedImg.createGraphics();
//	        g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
//	        g2.drawImage(srcImg, 0, 0, w, h, null);
//	        g2.dispose();
//	        return resizedImg;
//	    }
	
	/**
	 * Action class that shows the image specified in it's constructor.
	 */
	private class MyAction extends AbstractAction{
		
		/**
		 *The icon if the full image we want to display.
		 */
		private Icon icon;
		
		
		public MyAction(Icon icon, Icon resizeicon, String text){
			this.icon = icon;
			
			// The short description becomes the tooltip of a button.
			putValue(SHORT_DESCRIPTION, text);
			
			// The LARGE_ICON_KEY is the key for setting the
			// icon when an Action is applied to a button.
			putValue(LARGE_ICON_KEY, resizeicon);
		}
		
		/**
		 * Shows the full image in the main area and sets the application title.
		 */
		public void actionPerformed(ActionEvent e) {
			
			bigimgLabel.setIcon(this.icon);
			setTitle("Icon Demo: " + getValue(SHORT_DESCRIPTION).toString());
		}
	}
}



	




