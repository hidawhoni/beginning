package com.kosmo.test2222;

import com.kosmo.other.Ch07parent;

public abstract class Ch07AbstractClass 
		extends Ch07parent
		implements Ch07Interface {
	//바디가 없는 추상메서드를 가질수도있는 클래스를 추상클래스라고 한다.
	//인스턴스(주소)를 생성할 수 없고 상속에 의해서만 메서드/변수 사용가능.
	//exteds와 implements 같이 가능
	//자식 클래스는 ***반 드 시 추상메서들을 구현{}해야한다.
	//상속받은 자식 클래스가 추상클래스면 추상메서드를 구현하지 않아도 된다.(두개다 추상이기때문에 강제성이 없어진다.) 
	//공통된부분은 제외하고 일부만 구현하려고
	public abstract void absFunc(); 
	
	//{
	//		System.out.println("absFunc");
	//	} 이렇게 바디가 없는 메서드를 추상 메서드라고 한다.

	public static void main(String[] args) {
		

	}
	public boolean ipinCheck(String pinNo) {
		return true;
	}
}
