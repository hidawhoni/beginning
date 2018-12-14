package com.kosmo.test2222;

public class Ch05Array {

	public static void main(String[] args) {
		
		//<배열>
		//타입[] _____ = new 타입[배열크기];-> 배열선언법	
		//numarr[0] ~ numarr[4]-> 크기-1
		//x번째 : 인덱스 x
		//꼭 생성까지 하기!!!!!!*************** 선언+ new 생성 후 사용********
		int[] numarr = new int[5];
		System.out.println(numarr[4]);
		
//		int [] numArr;
//		numArr= new int[5];  이것도 가능
		
		
//		int[] numarr2 = new int[3]; 값이 초기화인상태(=0)
//		
//		
//		int[] numarr3 = new int[] {10,30,50}; 뒤쪽에 대괄호안에 숫자가 몇개인지 알수있으니깐 갯수를 따로 안적어도됨.
//		
//		
//		int[] numarr4 = {10,30,50}; 다이렉트로 바로 넣어줘도 됨.new를 안써줘도 됨.
//				
//		int[] numarr5 = new int[3];
//		numArr5[0] = 10;
//		numArr5[1] = 30;
//		numArr5[2] = 50;

		Ch02var h1 = new 	Ch02var();
		Ch02var h2 = new 	Ch02var();
		Ch02var h3 = new 	Ch02var();
		
		//이걸
		
		Ch02var[] carr = new Ch02var[3];//=new ch02var ()[3] 이렇게 괄호 쓰지 않게 주의****
		
		System.out.println(h1.point);
		h1.point=5000;
		System.out.println(h2.point);
		System.out.println(carr[0].point);
		//----------------------------------
		
		System.out.println(h1.point2);
		h1.point2=5000;
		System.out.println(h2.point2);
		
		String[] stArr = new String[] {"aa","bb"};
		System.out.println(stArr[0]);
		
		char[] chArr= new char[] {'a','b','c'}; //char는 2바이트지만 char[]은 4byte**배열은 모두 4byte
		System.out.println(chArr[1]);
		
		
//		String str1= new String("hello");
//		String str2= "hello";-> 이게 제일 보편
//		char[] str3= new char[] {'h','e'};
// 		위 3개 모두 같음.
		
//		int[] score = new int[3];
		int[] score1= {88,77,88};
		int[] score2= {55,44,66};
		
// 다차원-> 2차원배열[][] = {
//				{88,77,88},
//				{55,44,66}
//		};
		
		for(int i=1; i<6; i++) {
			System.out.println(i);
			
		}
		
		int[] numarrr = new int[] {1,2,3,4,5};
		for(int i=0;i<5;i++) {
			System.out.println(numarrr[i]);
		}
		
		int[] numarrr2 = new int[5];
		for(int i=0;i<numarrr2.length;i++) {
			System.out.println(numarrr2[i]);
		}
		
		int[] dan= new int[] {2,3,4,5,6,7,8,9};
		int[] gob= new int[] {2,3,4,5,6,7,8,9};
		for(int d=0;d<dan.length;d++) {
			System.out.println(dan[d]+"단");
			for(int g=0;g<gob.length;g++) {
				System.out.println(gob[g]+"*"+dan[d]+"="+gob[g]*dan[d]);
		}
			
	}
		int[] dann = new int[] {1,2,3,4,5};
		for(int i=0;i<3;i++) {
			System.out.println(dann[i+2]);

		}
		int[] stu= new int[] {100,80,90};
		for(int i=0;i<stu.length;i++);
			System.out.println(stu[0]+stu[1]+stu[2]);
			System.out.println((stu[0]+stu[1]+stu[2])/3);
			
		
			
			Ch02var [] carr2= new Ch02var[3];
			for(int i=0; i<3;i++) {
				carr2[i]= new Ch02var();
				System.out.println(carr2[i]);
				
				carr2[0].point2 =3000;
			}
			
			String[] astr= new String [] {"ABCDE"};
			System.out.println(astr[0]);
			
			for(int i=0;i<astr.length; i++) {
				System.out.println(astr[i]);
			}
			//string 은 char 배열과 같다.*****************************
			String astrs= "ABCDE";
		    for(int i=0;i<astrs.length(); i++) {
				char c = astrs.charAt(i);
		    	System.out.println(c);
			}
			
		   char[] eqstrs= astrs.toCharArray();
		   System.out.println(eqstrs);
		   
		   
		   int[][] jtscore= new int [][] { {100,90,80},
			                  {88,87,86},
			                  {44,47,49}			   								 
		   };
		   	
		   for(int i=0;i<jtscore.length;i++) {
			   int jthap =0;
			   for(int j=0; j<jtscore[i].length;j++) {
				   
				   jthap = jthap+jtscore[i][j];
			   }
			System.out.println("학생"+(i+1)+"반평균은"+jthap/ jtscore[i].length);
			
			
			
		   }
		   System.out.println("=====이건 회차별=========");
		   
		   for(int i=0;i<jtscore[0].length;i++) { 
			   int jthap=0;
			   for (int j=0;j<jtscore.length;j++) {
				   jthap=jthap+jtscore[j][i];
			   }
			   System.out.println((i+1)+"회차"+"평균은"+jthap/jtscore.length);
		   }
			   
			  
		   
		   
		   
		   
		   int[] answer = {1,4,4,3,2,};
		   int num=0;
		   for(int i=0;i<answer.length;i++) {
			   System.out.print(answer[i]+":" );
		   for(int s=0; s<answer[i];s++) {
			   System.out.print("*");
		   }System.out.println();
		   
		   
		   
		   
//		   int[][] jtcp= new int[][] { {100,90,80,1},
//			   						   {88,87,86,1},
//			   						   {44,47,49,1}			   								 
//		   };
//		   int[][] score= new int[jtcp.length+1][jtcp[0].length+1];
//		   
//		   int jj=0;
//		   int ss=0;
		   
		  
		   String[] members= {"최진혁","최유빈","한아람"};
		   for(int iiii=0;iiii<members.length;iiii++) {
			   String member= members[i];
			   System.out.println(member+"이 상담을 받았습니다");
		   }

		  
		   
		   
			   
			   
			   
		  
			   
			   
			 
			
			  
			  
		   	
			   
			   
			  
			  
			
			   
			  
			   
		   
			
	}
}
}

