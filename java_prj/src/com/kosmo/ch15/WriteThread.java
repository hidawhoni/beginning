package com.kosmo.ch15;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class WriteThread implements Runnable {
	Socket sk;
	String nickName;
	OutputStream os;
	PrintStream out;
	public WriteThread(Socket ss) {
		this.sk = ss;
		//초기화
		try {
			os = sk.getOutputStream();
			out = new PrintStream(os);
		} catch (IOException e) {
			//e.printStackTrace();
		}
		
	}
	@Override
	public void run() {
	
		Scanner nicksc = new Scanner(System.in);
		System.out.print("닉네임:");
		String nickName = nicksc.nextLine();
		out.println(nickName); //닉네임전송
		
		
		Scanner msgsc = new Scanner(System.in);
		String msg ="";
		while((msg = msgsc.nextLine()) != null) {
			out.println(nickName+":"+msg);
			if(msg.equals("exit")) break;
		}
		try {
			sk.close();
		} catch (IOException e) {
			//e.printStackTrace();
		}
		
	}

}
