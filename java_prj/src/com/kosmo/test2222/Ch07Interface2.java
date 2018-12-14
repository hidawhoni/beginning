package com.kosmo.test2222;

public interface Ch07Interface2 
		//extends Ch07InterfaceParent 
{
	int NUM2 = 200;
	// public final static int NUM = 100;
			
	//모든변수엔 public final static은 쓰지않아도 자동으로 키워다가 붙음.
	//상수임/ final를 붙이든 안붙이든 상수임. 인터페이스엔 상수만 올수있음.
	//final static int NUM=100; 변수엔  static이 붙어야함 데이터를 퍼주는 용도이기때문에(new는 사용못함.)
	//interface엔 모두 상의하고 난 값만 변수로 올라올수있다.(예를 들면 초기가입자 포인트 )
	//모든 메서드는 추상(바디가 없는)메서드이어야 한다.
	//public void myPrint() {} 이건 에러
	//interface에 오는 메서드는 모두 추상메서드이다.
	//모든 메서드에 public abstract 키워드를 컴파일러에서 붙여줌
	public abstract void myPrint2();
	public abstract int sendEmail(String email);
	
}
