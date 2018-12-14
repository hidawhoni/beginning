package com.kosmo.project;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;



public class ProjectDBImpl implements JDBC {

	
	
		public ArrayList<ProjectVO> chickenList(ProjectVO projectvo) {
			
			Connection conn = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			
			ProjectDBManager db = new ProjectDBManager();
			ArrayList<ProjectVO> list=new ArrayList<ProjectVO>();
			
			try {
				conn = db.dbConn();
				
				String sql = "select cname from chicken where crispy=? and price=? and amount=? and type=? and kind=?";
				
//				System.out.println(projectvo.getCrispy());
//				System.out.println(projectvo.getPrice());
//				System.out.println(projectvo.getAmount());
//				System.out.println(projectvo.getType());
//				System.out.println(projectvo.getKind());
//				
				
				pstmt = conn.prepareStatement(sql);
				pstmt.setInt(1,projectvo.getCrispy());//바인딩
				pstmt.setInt(2,projectvo.getPrice());
				pstmt.setInt(3,projectvo.getAmount());
				pstmt.setInt(4,projectvo.getType());
				pstmt.setInt(5,projectvo.getKind());
				
				rs = pstmt.executeQuery();
				
					
					while(rs.next()) {
						
						
						projectvo.setCname(rs.getString("cname"));
						list.add(projectvo);
						
					}
				
			
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
//				db.add(9);
				db.dbClose(rs, pstmt, conn);
			}
			return list;
		}
		
}
				
				


