package com.kosmo.test2222;

public abstract class Ch08ExeptionTest {
//import java.lang.ArrayIndexOutOfBoundsException;
	public static void main(String[] args) {
		int[] arr= new int[2];
		System.out.println("1");
		
		try {
			int res=10/0;
			
		}catch(java.lang.ArithmeticException aaa) {
			
			System.out.println("산술적 예외 발생 잡았다...");
		}catch(Exception aaa) {
			System.out.println("혹시나....");
		}
		//catch{} 작은타입부터 큰타입으로 잡아야됨 큰거후에는 작은거 필요없음으로 문법상 오류가 나온다.
		//같은 크기면 순서 상관없음.
		// 처리의 세분화와 효율성을 위해서 catch를 여러개 둔다.
		try {
			System.out.println(arr[4]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("catch:잡았다");
//			System.out.println("메세지:"+e.getMessage());
//			System.out.println("원인:"+e.getCause());
//			System.out.println("클래스:"+e.getClass());
//			e.printStackTrace(); 개발이 끝난후엔 막아놓아야함.
			
			//try에 다 넣어두면 catch후에 실행이 안되서 결과값이 잘못나온다.
			//넣어도 되는 값인지 확인하고 넣어야됨.
			//하나의 메서드에서 try{} catch{}는 무한으로 사용할수있다.
		}finally {
			//예외발생 여부와 관계없이 해당 블럭은 실행해라***
			//try{}catch{} finally{} / try{} catch{}/ try{} finally{}가능하지만 의미없음.(try에는 에러가 날 소지가 있을때만 사용)
			//하지만 try{}단독으로는 쓰지않는다.
			// 예외처리란 코드를 끝까지 수행하기 위해서 발생된 예외를 처리해 주는것.
			
			System.out.println("무조건 실행");
		}
		
		System.out.println("2");
		try {
			System.out.println(arr[6]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("catch:잡았다22");
			
			try {
				System.out.println(arr[7]);
				
			}catch(ArrayIndexOutOfBoundsException ec) {
				
			}
			System.out.println("catch:잡았다333");
		}
		
		System.out.println("3");

	

}
}