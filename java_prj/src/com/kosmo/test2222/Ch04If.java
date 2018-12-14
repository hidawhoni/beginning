package com.kosmo.test2222;

public class Ch04If {

	public static void main(String[] args) {
		//where num>7 and sal>2000
		//empno=7733 and sal>2000
		int empno=7733;
		int sal=2010;
		//DB: empno=7733 and sal>2000
		//java: empno==7733 && sal>2000
		if(empno==7733 && sal>2000) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}

		//decode(deptno,
		//		10,'10번부서',
		//		20,'20번부서',
		//		30,'30번부서',
		
		//		   '해당없음')
		//if문
		int empno2=7732;
		int sal2=2000;
		//DB: empno=7733 or sal>2000
		//java: empno==7733 || sal>2000
		if(empno2==7733 && sal2>2000) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
	int deptno = 10;
	if (deptno==10) {
		System.out.println("10번부서");
	}else if (deptno==20) {
		System.out.println("20번부서");
		
	}else if (deptno==30) {
		System.out.println("30번부서");
	}else {
		System.out.println("해당없음");
	}
	
	int comm = 100;
	if (comm>=90) {
		System.out.println("90");
	}else if (comm>=80) {
		System.out.println("80");
		
	}else {
		System.out.println("해당없음");
	}
	System.out.println("===done===");
	//switch문
	switch(deptno) {
	case 10:
		System.out.println("10");
		break;//**break필수
	case 20:	
		System.out.println("20");
		break;
	default:
		System.out.println("해당없음");
	}
	
	
	
}
}
