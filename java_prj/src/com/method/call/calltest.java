package com.method.call;


public class calltest {
	public static int add(int a, int b) {
		return a + b;
	}
	public static int sub(int a, int b) {
		return a - b;
	}
	public static int mul(int a, int b) {
		return a * b;
	}
	public static int div(int a, int b) {
		return a / b;
	}
	//add 숫자2
	//sub
	//mul
	//div
public static void main(String[] args) {
		
		int da = add(1,4);
		System.out.println(da);
		int hun = sub(6,1);
		System.out.println(hun);
		int park = mul(4,5);
		System.out.println(park);
		int who = div(5,6);
		System.out.println(who);
	
	
		
		byte a=10;
		byte b=20;
		byte c=(byte)(a+b);
	    System.out.println(c);
	    //***test 나옴
	    
	    
	    int n1=1000000;
	    int n2=2000000;
	    int nres= n1*n2;
	    System.out.println(nres);
		
	    int divres = 10/8;
	    System.out.println(divres);
	    
	    double divres2 = (double)10/8;
	    System.out.println(divres2);
	    //***test나옴
	    
	    
	    int div = 10%8;
	    System.out.println(div);
	    
	    
	    float ad= 3.14f;
	    System.out.println(ad);
	    
	    
	    int tot=80;
	    String totres= (tot>90)?"크다":"작다";
	    System.out.println(totres);
	    //자바의 삼항연산과 오라클에서 decode와 비슷함 decode(tot,90,'같다','다르다')
	    //삼항연산자는 중첩이 가능하다 
	    int score=80;
	    char cres=(score>90)?'A':(score>80)?'B':'C';
	    System.out.println(cres);//서브커리느낌.
	    
	    
	    
	    
	    
	    
	    
	}

}

