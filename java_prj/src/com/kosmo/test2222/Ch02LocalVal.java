package com.kosmo.test2222;

public class Ch02LocalVal {
	
	int num;//전역변수
	public static void main(String[] args) {
		int num=555;//지역변수는 반듯이 초기화를 시켜줘야함.
		Ch02LocalVal v =new Ch02LocalVal();
		v.myprint();//지역변수
		System.out.println(v.num);
		System.out.println(num);
	}	//static 안에서는 this못함.******
	public void myprint() {
		int num =999;
		System.out.println(num);
		System.out.println(this.num);//꼭대기에 있는 것을 가리키는게 this/ (this)만해주면 주소가 찍힘.
	}								 
}
