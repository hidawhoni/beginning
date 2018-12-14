package com.kosmo.test2222;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class MethodCallTest {
//javac MethodCallTest.java
//		MethodCallTest.class
//java MethodCallTest
//오버로딩: over loading ***하나의 클래스 안에서*** n개의메서드명이  같은뎁 매개변수의 타입이 다를때.*****"메서드 관계를 오버로딩했다 라고 한다."*****이름같고 괄호다른거
//	public static void main(int  arr) {}
	
	
	public static void main(String[] arr) {
		//조건1. static static
		//조건2. 제 클래스이름.메서드명(누구 메서드인지 명확하게 내클래스이름은 메서드명만와도 상관없다.)
		
		
		// static 빼고 갈땐 new해주면됨
		MethodCommon mc=new MethodCommon();
		
		double res =mc.add(4.0,5.0);
		System.out.println(res);
		int sum =0;
		for(int i=0;i< arr.length;i++) {
			sum += Integer.parseInt(arr[i]);
		}
			System.out.println(sum);
			
			int[] hh= new int[] {1,2,3,4,5};
			System.out.println(hh[3]);
			
			
			HashMap<String, String> map= new HashMap<String, String>();
			map.put("key_name", "아무개");
			map.put("key_age", "25");

			
			String ares3 = mc.getIembyMap(map);
			System.out.println(ares3);
			
			String[] arr3= {"4","5","6","7"};
			ArrayList gg =mc.convertArrayTolist(arr3);
			
			for(int i=0; i<arr3.length;i++) {
				System.out.println(arr3[i]);
			}
			System.out.println(gg.size());
			
			int[] iarr = new int[] {1,2,3,4,5,};
			int res5=mc.next(iarr, 3);
			System.out.println(res5);
			
			int res7= mc.getPoint();
			System.out.println(res7);
			String res8 = mc.getNation();
			System.out.println(res8);
			
			 mc.setPoint(9999);
			 mc.setNation("jp");
			 
			 int res9= mc.getPoint();
			 System.out.println(res9);
			 
			 String res10= mc.getNation();
			 System.out.println(res10);
			 
			 
			 String res11= mc.login("lee", "1234");
			 System.out.println(res11);
			 
//			 MethodCommon mc= new MethodCommon();
//			 MethodCommon mc2= new MethodCommon(1000,"japan");
			 

			 
			 String res12= mc.getValueByMap("key_name");
			 System.out.println(res12);
			 
	}	
			
}			

	
