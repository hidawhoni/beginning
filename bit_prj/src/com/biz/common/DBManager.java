package com.biz.common;

import java.io.Reader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class DBManager {
	
	public Connection dbConn() {
		String path2 = "config/mybatis/config-mybatis.xml";
		Reader reader;
		SqlSessionFactory factory = null;
		SqlSession conn = null;
		
		try {
			reader = Resources.getResourceAsReader(path2);
			factory = new SqlSessionFactoryBuilder().build(reader);
			if(factory == null)
				System.out.println("factory err");
			else
				System.out.println("factory ok");
			conn = factory.openSession();
			

		} catch(Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
//	public void add(int num) {
//		if(num >10)
//			System.out.println("ok");
//	}
	
	public void dbClose(ResultSet rs, PreparedStatement pstmt, Connection conn) {
		try {
			if(rs !=null) rs.close();
			if(pstmt !=null) pstmt.close();
			if(conn !=null) conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		//System.out.println("닫았다");
	}
	
	public void dbClose(PreparedStatement pstmt, Connection conn) {
		try {
			if(pstmt !=null) pstmt.close();
			if(conn !=null) conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		//System.out.println("닫았다");
	}
	
	public void dbClose(Connection conn) {
		try {
			
			if(conn !=null) conn.close();
		//System.out.println("닫았다");
	}
		
	}
	
}
	
	
	
	
	
	
	
			

