//인스턴스: 메모리에 올라가 주소를 갖는 변수, 메서드
//인스턴스 화 : 주소를 만든다.(new)

package com.kosmo.test2222;

public class Ch02var {
	//클래스 안에는 변수, 메서드 들이 올 수 있다.
	
	
	//전역변수(전체적인지역에서 쓴다.)는 초기화(0임 0이싫으면 다른값을 넣어주면된다.)하지 않으면 기본 값으로 초기화된다.
	static int point; //static 변수(스테틱이 붙었으니깐 스테틱변수=클래스변수 클래스가 올라갈때 같이 올라가서)로 사용가능 / =100
		   int point2;//인스턴스변수
		   
	static final int NOT_EDIT_NUM =500;	  //final 이랑 대문자를 꼭 해줘야됨. 값이 한번 할당됐으면 바꿀수없는 수 상수.
	public static void main(String[] args) {
		System.out.println(point);
		
		//일반변수는 new해서 메모리에 올련호고 사용 new후엔 어디든 사용가능.
		Ch02var v = new Ch02var();
		System.out.println(v.point2);
		
	
		
		
		// 변수선언
		//int a=4; //******지역변수는 반드시 초기화 해야된다.(최초로 값 한번 넣는것/최초로 값을 할당)******
		int a;
		a=4;
		System.out.println(a);
		
		int b = 10;//선언과 동시에 초기화를 한것.
		b= 7;//갑자기 b값이 초기화 때랑 다를때 값을 재할당 할수있다.(값을 다시 넣다.)
		//기본(primitive)타입:8개(boolean 참이냐 거짓이냐,char,byte,short,int,long,float,double)
		//참조(reference)타입: 주소값(4byte)
		
		boolean bool= false; //true 1byte
		
		byte bt=127; //2^7 -1;
		char c= 'c'; //홑따움표는 글자 한자리수임.(그래서 'cd'하면 에러),2byte
		short s= 32767;//2바이트를 담을수있음.
		int i= 2147483647;//정수 기본 21억정도면 int
		long l= 520000;//16자리부터
		
		
		float f= 5.2f; //리터럴 f,d(기본이 더블이라서 f를 사용해줘야함.) 정수<실수
		double d= 3.2d;//소수점은 기본이다.
		//컴퓨터 주소표기는 4byte
		String aa= "hello"; //= String aa2= new String("hello");
		
		System.out.println(aa);
		
	
		
		//상수 : final이 붇은 변수
		
		final int NOT_EDIT_NUM =500;
		System.out.println(NOT_EDIT_NUM);
		//에러: 상수는 값을 초기화 한후 재할당한다.
		//NOT_EDIT_NUM = 2000;
		
		String str1= null;// 이것만 널임.
		String str2= "";
		char ic='\u0000';// 
		//char ic=''; 에러
		String str3= " ";
		
		
		System.out.println(str3 + s);
		//String에 어떤연산을 해도 string
		int h = 100;
		int z = 50;
		System.out.println(str3+h+z);
		System.out.println(str3+(h+z));
		
		int gg = 1;
		gg = -gg;
		System.out.println(gg);
		
		
		//int 보다 작은  크기의 타입들을 더하면 결과는 int
		char calph= 'A'; //calph=65
		System.out.println(+calph);
		System.out.println((char)(calph +1));// 캐스팅: 형 변환(바꾸고 싶은 타입 명시) 작은곳에서 큰곳으로갈땐 필요없음.
        //기본타입 8개중 boolean을 제외한 나머지는 서로 캐스팅가능
		boolean b1= true;
		//System.out.println(b1+3); 에러
		//*****참조타입 하고 기본타입은 절대 캐스팅하는게 아님.********
		
		
		
		String numstr = "11";
		System.out.println(numstr);
		
		Boolean bw;
	    
		Character cw;
		Byte btw;
		Short sw;
		Integer it;
		Long lw;
		Float fw;
		Double dw;
		
		
		
		
		
		
		//System.out.println((int)numstr); 안됨
		//Wrapper 클래스 사용시 참조타입 과 기본타입 캐스팅 가능
			//int pint = Integer.parseint("115");
			//System.out.println(pint+5);
			
	}

}
