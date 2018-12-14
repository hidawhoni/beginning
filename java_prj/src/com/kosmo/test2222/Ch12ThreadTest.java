package com.kosmo.test2222;

class MyThread implements Runnable{// extends Thread {
	
	String tname;
	public MyThread (String aa) {
		this.tname = aa;
	}
	@Override
	public void run() {
			try {
				for(int i=0; i<10; i++) {
				Thread.sleep(500);
				System.out.println("일하는중......"+this.tname);
				
				}
			} catch (InterruptedException e) {
			
				e.printStackTrace();
			}
			
		}
}

public class Ch12ThreadTest {
		
	public static void main (String[] args) {
//	MyThread man1= new MyThread("man1");
//	man1.start();
//	MyThread man2 = new MyThread("man2"->여기에 값을 준다.);
//	man2.start();
//	Runnable man1= new MyThread("man1111");다형성
			Thread t1 = new Thread(new MyThread("man1111"));
			t1.setPriority(Thread.MIN_PRIORITY);
			t1.start();
			
//	Runnable man2 = new MyThread("man2222");
			Thread t2 = new Thread(new MyThread("man2222"));
			t2.setPriority(Thread.MAX_PRIORITY);
			t2.start();		
			
//			Thread t3 = new Thread(new MyThread("man3333"));
//			t3.setPriority(Thread.MAX_PRIORITY);
//			t3.start();	
			
			//th.run();이렇게하면 절대 xxxxxxxxxxx
			
		}
		
	}

	



