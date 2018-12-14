package com.kosmo.test2222;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class Ch11Collection {

	public static void main(String[] args) {
		int[] numarr = {1,2,3,};
		Ch02var chVar= new Ch02var();
		
		ArrayList<Object> list = new ArrayList<Object>();
// 남의 파일을 내 폴더에 가져오는 효과를 보여라 (물리적으로 진짜 가져온건 아님.)->import
// collection(list)은 초기 사이즈가 없다./Array는 사이즈가 있음.
		list.add("aa");
		list.add("bb");
		list.add(69);
		list.add(numarr);
		list.add(chVar);
		for(int i=0; i<list.size();i++) {
			System.out.println(list.get(i));
			
			int arr[] = (int[])list.get(3);
			System.out.println(arr.length);
			
			Ch02var ca = (Ch02var)list.get(4);
			System.out.println(ca.point2);
			
			String aaa=(String)list.get(1);
			System.out.println(aaa);
			
			int bb =(int)list.get(2);
			System.out.println(bb);
			
			

			HashSet<String> set =new HashSet<String>();
			//HashSet();은 주소가 아니라 값이 나온다.->[1, 3] 몇개인지는 정확히 알수는 없다.반복되는건 안보여줌.
			
			set.add("1");
			set.add("1");
			set.add("3");
			
			System.out.println(set);
			Iterator <String>it=set.iterator();
			while(it.hasNext()) {
				System.out.println(it.next());
				
			}
			//for(int i=0; i<set.size();i++){}-> 안됨.
			
			
			HashMap<String,Object> map= new HashMap<String,Object>();
			
			map.put("name", "ikh");
			map.put("age", 20);
			map.put("arr", "numarr");
			map.put("cls", chVar);
			
			//*****for(int z=0; z<map.size();z++) {
				
			//} map에는 for문이 의미가 없다.*********
	                               		
			String mres1 =(String) map.get("name");
			System.out.println(mres1);
			
			int mres2=(int) map.get("age");
			System.out.println(mres2);
			
		   //list는한번만 들어가도됨.
			
			ArrayList<Object> mlist = new ArrayList<Object>();
		    
			for(int kkk=0; kkk<2;kkk++) {
				 HashMap<String,Object> map1= new HashMap<String,Object>();
				    
				    map1.put("name", "lee"+1);
				    map1.put("age", kkk+10);
				    mlist.add(map1);
				    
				    HashMap<String,Object> map2= new HashMap<String,Object>();
				    
				    map2.put("name", "lee");
				    map2.put("age", 20);
				    mlist.add(map2);
			}
				    
				
			   System.out.println("총회원수:"+mlist.size());
			    
			    mlist.get(0);
				
				
				
			for(int j=0;j<2;j++) {
				mlist.get(j);
				
			}
			
		
			
			
		}
		
	}
	
	
}

		 

			
			
			
		    
		    
		    
		    
				
			
			
			
