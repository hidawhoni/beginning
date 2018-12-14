package com.kosmo.test2222;

import java.io.IOException;

public class Ch9Lang {
	
	static int num=10;
	int num2=10;

	public static void main(String[] args) {
		Ch9Lang lang =new Ch9Lang();
		String str1="abc";
		String str2="abc";
		
		String str3=new String("abc");
		String str4=new String("abc");
		//api
		String sss ="   abcde801130-1234567-  ";
		System.out.println(sss.charAt(1));
		System.out.println(sss.length());
		System.out.println(sss.substring(0,6));
		System.out.println(sss.concat("000") );	
		System.out.println(sss.indexOf("-"));//최초의 위치 조건이 있는 "-"를 출력해줌.(첫번째것만)
		System.out.println(sss.lastIndexOf("-"));
		System.out.println(sss.replace("-", "**"));
		String[] aa=sss.split("-");
		System.out.println(aa[1]);
		
		
		System.out.println(sss.toLowerCase());
		System.out.println(sss.toUpperCase());
		System.out.println(sss.trim());//앞뒤공백없애줌.
		
		if(!str1.equals(str4)){
        //if(str1== str2) {//주소가 같다
		// if(str3==str4)	{ //주소가 다르다
			System.out.println("같다");
			
		}else {
			System.out.println("다르다");
		}
		
		int a=10;
		String astr= a+"";
		System.out.println(astr+3);
		
		
		String cname= new Ch9Lang(). getClass().toString();
		System.out.println(cname);
		
		//메모리를 아낄수있다.(StringBuilder 는 버퍼와 다르게 동기화를  해주지 않기 때문에 속도는빠르지만 안전하지는 않다.)
		StringBuffer sb= new StringBuffer("abc");
		for(int i=0; i<10; i++) {
			
			sb.append(i);
		}
//		sb.append("d");//abc에 d를 붙이고 싶을때.
		String res =sb.toString();
		System.out.println(sb);
		System.err.println(sb);
		
		try {
			int aaa = System.in.read();
			System.out.println(aaa);
		} catch (IOException e) { //exception 제외 catch를 안해주면 밑에 있는 코드들이 다 멈춤.
			System.out.println("에러가 났어요..");
			e.printStackTrace();
		}
		
		
		
		
		
		
	}

}
