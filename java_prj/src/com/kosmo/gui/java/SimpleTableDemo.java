package com.kosmo.gui.java;
/*
 * SimpleTableDemo.java requires no other files.
 */
 
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.BorderLayout;
import javax.swing.JButton;




 
public class SimpleTableDemo extends JPanel {
    private boolean DEBUG = false;
    JFrame frame;
    
    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
            	SimpleTableDemo window= new SimpleTableDemo();
              
              window.frame.setVisible(true);
                
            }
        });
    }
 
    public SimpleTableDemo() {
    	   //Create and set up the window.
        frame = new JFrame("TITLE");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 100, 500, 400);
 
//        //Create and set up the content pane.
//        SimpleTableDemo newContentPane = new SimpleTableDemo();
//        newContentPane.setOpaque(true); //content panes must be opaque
//        frame.setContentPane(newContentPane);
 
//        //Display the window.
//        frame.pack();
//        frame.setVisible(true);
 
        String[] columnNames = {"EMPNO",
                                "ENAME",
                                "JOB",
                                "DEPTNO"};
        
        Object[][] data = {
        		{new Integer(7733),"SMITH","CLERK",new Integer(10)},
        		{new Integer(7788),"ALERN","MANAGER",new Integer(20)},
        		{new Integer(7799),"KING","PRESIDENT",new Integer(20)},
        		
        {"Kathy", "Smith",
         "Snowboarding", new Integer(5), new Boolean(false)},
        {"John", "Doe",
         "Rowing", new Integer(3), new Boolean(true)},
        {"Sue", "Black",
         "Knitting", new Integer(2), new Boolean(false)},
        {"Jane", "White",
         "Speed reading", new Integer(20), new Boolean(true)},
        {"Joe", "Brown",
         "Pool", new Integer(10), new Boolean(false)}
        };
 
        DefaultTableModel model = new DefaultTableModel(data, columnNames);
        JTable table = new JTable(model);
//        table.setPreferredScrollableViewportSize(new Dimension(500, 70));
//        table.setFillsViewportHeight(true);
 
       
        table.addMouseListener(new MouseAdapter() {
        	public void mouseClicked(MouseEvent e) {
        		int rowIndex = table.getRowCount();
        		int columnIndex= table.getColumnCount();
        		TableModel model = table.getModel();
        		//Object val= model.getValueAt(rowIndex, columnIndex);
        		System.out.print(rowIndex+"\t");
        		System.out.print(columnIndex+"\t");
        		
        		
        		
        	}
        });

 
      
        JScrollPane scrollPane = new JScrollPane(table);
        frame.getContentPane().add(scrollPane);
        
        JPanel panel = new JPanel();
        frame.getContentPane().add(panel, BorderLayout.SOUTH);
        
        JButton btnNewButton = new JButton("New button");
        panel.add(btnNewButton);
        
        JButton btnNewButton_1 = new JButton("New button");
        panel.add(btnNewButton_1);
 
        //Add the scroll pane to this panel.
    }
    //몇번째행 몇번째 컬럼인지.
//    private void printDebugData(JTable table) {
//        int numRows = table.getRowCount();
//        int numCols = table.getColumnCount();
//        javax.swing.table.TableModel model = table.getModel();
// 
//        System.out.println("Value of data: ");
//        for (int i=0; i < numRows; i++) {
//            System.out.print("    row " + i + ":");
//            for (int j=0; j < numCols; j++) {
//                System.out.print("  " + model.getValueAt(i, j));
//            }
//            System.out.println();
//        }
//        System.out.println("--------------------------");
//    }
 
  
}