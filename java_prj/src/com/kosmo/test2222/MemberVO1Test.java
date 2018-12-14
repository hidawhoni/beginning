package com.kosmo.test2222;

import java.util.ArrayList;

public class MemberVO1Test {
	
	public static void main(String[] args) {
		
	
//		ArrayList list= new ArrayList();
//		MemberVO1 mvo1= new MemberVO1();
//		mvo1.setName("dawhoni");
//		mvo1.setAge(25);
//		list.add(mvo1);
//		
//		for(int i=0; i<list.size();i++) {
//			MemberVO1 mv = (MemberVO1)list.get(i);
//			System.out.println(mv.getName());
//			System.out.println(mv.getAge());
//		}
		
		ArrayList list= new ArrayList();
		MemberVO1 mvo1= new MemberVO1();
		mvo1.setName("dawhoni");
		mvo1.setAge(25);
		list.add(mvo1);
		
		for(int i=0; i<list.size();i++) {
			MemberVO1 mv = (MemberVO1)list.get(i);
			System.out.println(mv.getName());
			System.out.println(mv.getAge());
		}
	
		
	

		
	
	
	
	
		

	}
}