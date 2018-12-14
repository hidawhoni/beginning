package com.kosmo.test2222;

import java.util.ArrayList;
import java.util.HashMap;

public class MethodCommon {
	int point =50000;
	String nation = "korea";
	HashMap map=new HashMap();
	
	//생성자: 클래스 이름과 동일한 메서드
	//    : 리턴이 없다..void xxx...2단구성
	//	  : 컾파일러는 해당 클래스 컴파일 시
	//		생성자가 단 한개도 없을 경우 기본 생성자를 만들어준다.
	//기본생성자(함수,메서드)=constructor(클래스이름이랑 같을때/2단구성/메서드취급하면 안됨./호출방법은 new MethodCommon();)
	// ****초기화를 담당(초기값에 무엇을 넣어줄지를 담당해줌)/public MethodCommon() {} 로딩해줘야함.(아무것도 안해주고싶을때.)****
	
	
	
	public MethodCommon() {
		map.put("key_id", "hong");
		map.put("key_pw", "111");
		map.put("key_name", "홍씨");
	}	
	//파라미터가 있는 생성자
	//==매개변수가 있는 생성자
	public MethodCommon(int pt, String nn) {
		this.point =pt;
		this.nation =nn;
		
		map.put("key_id", "lee");
		map.put("key_pw", "222");
		map.put("key_name", "이씨");
				
	}
	
//map 의 키값을 파라미터로 받아
//그 값을 리턴하는
// getValueByMap 메서드 생성
	
	
	public String getValueByMap(String key) {
		
		String value = (String) this. map.get(key);
		return value;
	}
	
	
//사용자로부터 id,pw 를 입력받아
//이름을 리턴하는
//login 메서드 생성
	
	public String login(String id, String pw) {
		String name="ParkDaHun";
		return name;
//		String name="";
//		if(id.equals("lee") && pw.equals("111"));
		
	}
	
	

	
	
	
	
//getPoint()
//전역변수값 리턴
// get+ 변수명 메서드 생성	
// 지역변수안에서는 this 를 사용할수없다. new가언제나올지모르기때문에	
	
	public int getPoint() {
		return this.point;
		
	}
	
	public String getNation() {
		return this.nation;
	}

//입력받은 파라미터 값을 전역변수에 넣는
// set+ 변수명 메서드 생성
	
	public void setPoint(int pat) {
		this.point=pat;
		System.out.println();
	}
	
	public void setNation(String nat) {
		this.nation= nat;
	}
	
// double 타입 두개를 입력받아 합을 리턴하는 add 메서드 생성
	
	public  double add(double a , double b) {
		return a+b;
	}

//int 배열을 입력받아서 3번째값을 리턴하는
//getItem이란 메서드 생성	
	
	public  int[]  getItem (int[] arr) {
		int[] hh= new int[] {1,2,3,4,5};
		return hh;
	}
//HashMap을 파라미터로 받아
// 키값이 key_name인 값을 리턴	
//getItembyMap 메서드 생성	
	
	public String getIembyMap(HashMap arr2) {
		String name =(String)arr2.get("key_name");
		return name;
		
	}
	
//String 배열을 파라미터로입력받아
//ArrayList 로 변환해서 그 	ArrayList 리턴
//메서드명= convertArrayTolist
	
	public ArrayList convertArrayTolist (String[] arr3) {
		
		ArrayList ai = new ArrayList();
		
		
		
		for(int i=0; i<arr3.length;i++) {
			
			ai.add(arr3[i]);
		
		}
		return ai;
		
	}
	
	//숫자배열, 인덱스를 파라미터로 받아
	//그 인덱스의 다음 데이터를 리턴하는
	//0 1 2 3 4 번째.. i+1 이게 인덱스
	//1 2 3 4 5 length는 5
	//next 메서드...null
	
	public int next (int[] iarr,int i) {
		int res=0;
		if (iarr.length >i+1)
			res= iarr[i+1];
		else
			res=-1;
			
		return res;
	}
			
	
			
		
		
		
			
			
		}
		
	
	
	


