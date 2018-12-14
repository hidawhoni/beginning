package com.kosmo.test2222;
//20180726 18시20분00초 
//자바첫날 핵어려움 뭔말인지 모르겠음.너무 빨라염.ㄷㄷ

/**
 * 이건 내가 <b>첫날 만든</b> 자바파일이다.<p>
 * 그래서 어쩌꾸 저쩌구..<p>
 * 그래서 어쩌꾸 저쩌구..<p>
 * 그래서 어쩌꾸 저쩌구..<p>
 * 그래서 어쩌꾸 저쩌구..<p>
 * 그래서 어쩌꾸 저쩌구..<p>
 * 그래서 어쩌꾸 저쩌구..<p>
 * 그래서 어쩌꾸 저쩌구..<p>
 * 그래서 어쩌꾸 저쩌구..<p>
 * 그래서 어쩌꾸 저쩌구..<p>
 * @author kosmo_22
 *
 */


public class Hellotest {
	static int allnum = 1000;

/**
 * 이건 내가 첫날 만든 메인이다<p>
 * 메인 메서드는 어쩌구저쩌구..<p>
 * 메인 메서드는 어쩌구저쩌구..<p>
 * 메인 메서드는 어쩌구저쩌구..<p>
 * 메인 메서드는 어쩌구저쩌구..<p>
 * 메인 메서드는 어쩌구저쩌구..<p>
 * 
 * @param pdh
 */
	
	
	public static void main(String[] args) {
		System.out.println(allnum);


		int res = add(12,3);
		System.out.println(res);

		Hellotest aaa = new Hellotest();

		System.out.println(aaa);//aaa주소출력
		System.out.println(aaa.allnum);
		int res22= aaa.add(55,10);
		System.out.println(res22);


	}
	/**
	 * 
	 * @param a 는 숫자다
	 * @param b 는 숫자다
	 * @return 두 수 의 합이다.
	 */

	public static int add(int a,int b) {
		System.out.println("-----"+ allnum);
		return a+b;
	}

}


