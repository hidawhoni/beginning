package com.kosmo.other;

import com.kosmo.test2222.Ch07child;

public class Ch07Other {
		//public: 아무나 다 써도 되서 접근제어자가 없는거랑 마찬가지임 .
		//protected:같은 패키지,다른패키지에서 사용한다면 자손까지만 허용.
		//(아무것도안쓴거를 default):같은 패키지에서만 가능.
		//private:해당 클래스 내에서만 사용하는것(나만 사용).
	
		public static int otherNum=10;
	
		public void myPrint() {
			System.out.println("dddd");
		}

	public static void main(String[] a) {
		Ch07child c= new Ch07child();
		System.out.println(c.cpoint);
		System.out.println(c.ppoint);
		c.parentPrint();
		//다형성 :메서드: *****오버라이딩된 자식메서드만 호출가능하다.*****
		//다형성 :변수: 부모꺼만 호출가능.
		
		Ch07parent pc= new Ch07child();
		//다형성은 부모타입의 변수에 오버라이딩된 자식 인스턴스(주소)를 할당하는것.***
		//parent p = new child();하는거와 같음.
		System.out.println(pc.ppoint);
		pc.parentPrint();
		//xxx Ch07child cp= new Ch07parent(); 이건 안됨 자식멤버갯수를 부모가 다 받을수없음.xxxx
		//자식변수를 사용하고 싶으면 다형성이 아니라 new를 해서 따로 올리면됨.
		
		c.childFunc();
		
		//extends가 (상속)이 시작되면 
		// public child {new Parent(){};}이 생성자와 같은게 super();
		
		
	}

}
