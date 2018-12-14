package com.kosmo.test2222;

import com.kosmo.other.Ch07parent;

//구현하다 : implements
//exteds와 implements 같이 가능
public class Ch07InterfaceImpl
				extends Ch07parent
				implements Ch07Interface,Ch07Interface2 
				//implements Ch07InterfaceParent
				{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void myPrint() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int sendEmail(String email) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void myPrint2() {
		// TODO Auto-generated method stub
		
	}

}
