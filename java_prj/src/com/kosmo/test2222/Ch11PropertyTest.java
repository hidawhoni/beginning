package com.kosmo.test2222;

import java.util.ArrayList;

public class Ch11PropertyTest {

	public static void main(String[] args) {
		ArrayList<MemberVO> list = new ArrayList<MemberVO>();
		
		MemberVO mvo = new MemberVO();
		mvo.setMseq(1);
		mvo.setMid("lee");
		mvo.setMpw("111");
		mvo.setMname("이씨");
		mvo.setMgubun("u");
		list.add(mvo);
		
		MemberVO mvo2 = new MemberVO();
		mvo2.setMseq(2);
		mvo2.setMid("lee2");
		mvo2.setMpw("1112");
		mvo2.setMname("이씨2");
		mvo2.setMgubun("u");
		list.add(mvo2);
		
		for(int i=0;i<list.size();i++) {
//			(MemberVO)
			MemberVO vo = list.get(i); 
			System.out.print(vo.getMid()+"\t");
			System.out.print(vo.getMgubun()+"\t");
			System.out.print(vo.getMname()+"\t");
			System.out.print(vo.getMpw()+"\t");
			System.out.print(vo.getMseq()+"\t");
		
		}
		
//		for(int i=0;i<list.size();i++) {
////			(MemberVO)
//			
//			System.out.print(list.get(i).getMid()+"\t");
//			System.out.print(vo.getMgubun()+"\t");
//			System.out.print(vo.getMname()+"\t");
//			System.out.print(vo.getMpw()+"\t");
//			System.out.print(vo.getMseq()+"\t");
//		
//		}
		
	}

}
