package com.kosmo.test2222;
//throws Exception 떠넘기기(무책임)
public class Ch08ThrowsTest {

	public static void main(String[] args)throws Exception {
		System.out.println(1);
		try {
			myPrint();
		} catch (Exception e) {
			
			e.printStackTrace();
			System.out.println(2);
		}finally {
			System.out.println(3);
		}
		System.out.println(4);
		

	}
	//throws는 메서드 옆에사용
	public static void myPrint() throws Exception {
		System.out.println("myPrint111");
		try {
			int res=10/0;
			
		}catch(ArrayIndexOutOfBoundsException e) {
			
			System.out.println("연산에러..");
		}
		System.out.println("myPrint222");
		throw new Exception();//rethrowing: 내꺼를 가져가는 다른사람의 처리와 내 처리가 다르기 때문에 강제로 인셉션 유발.
	}
	
}
