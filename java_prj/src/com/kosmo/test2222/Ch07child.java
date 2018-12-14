package com.kosmo.test2222;

import com.kosmo.other.Ch07Other;
import com.kosmo.other.Ch07parent;

public class Ch07child extends Ch07parent{
	
		static int pnum=99;
	public int cpoint=1000;
	
	//다른 패키지에서 가져와도 extends 가 붙으면 부모임.->상속 
	//import com.kosmo.other.Ch07parent; 없으면 내 패키지로 임포트해서 가능.
	//overriding; 오버라이딩(****반드시 상속에서만 허용됨****)
	//단, private 은 상속안됨.
	//메서드의 선언부는 같고 바디를 변경 or[그대로 사용 xxx]근데 이건 할필요가 없음.
	//오버라이딩에서 접근제어자는 같거나 커야된다.(public->private은 안됨.private->public은 가능.)*****
	//예외는 부모가 가지고 있는 예외보다 같거나 적어야한다.
	//오버로딩 은 하나의 클래스에서 이름이 같고 괄호가 다르다.
	//public static void parentPrint(int a)
	//static이 붙으면 override가 안된다는 이론은 없으나 결과는 오버라이딩이 안됨.(**private은 나만쓰는거라서 오버라이딩 대상이 안됨.**)
	@Override
	public  void parentPrint() {
		System.out.println("p5");
	}
	public void childFunc() {
		System.out.println("childFunc");
	}
	
	public static void main(String[] args) {
		
		//Ch07parent p = new Ch07parent();
		//p.parentPrint();
		//이게 싫으면 애초에 public에 static을 붙이면 됨.
		
	
		
		Ch07Other o = new Ch07Other();
		o.myPrint();
		System.out.println(Ch07Other.otherNum);
		System.out.println(o.otherNum);
		
		System.out.println(pnum);
		
		Ch07Child2 c2 = new Ch07Child2();
		int res =c2.add();
		System.out.println(res);
				
		
	}

}
