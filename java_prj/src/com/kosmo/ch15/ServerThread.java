package com.kosmo.ch15;

import java.awt.List;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.util.HashMap;
import java.util.Iterator;

public class ServerThread implements Runnable {
	Socket sk;
	HashMap map;
	InputStream is;
	InputStreamReader isr;
	BufferedReader br;
	OutputStream uos;
	PrintStream uout;
	public ServerThread(Socket ss, HashMap mm) {
		this.sk = ss;
		this.map = mm;
		//초기화
		try {
			is = sk.getInputStream();
			InputStreamReader isr = new InputStreamReader(is);
			br = new BufferedReader(isr);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	@Override
	public void run() {
		
		
		String nickName = "";
		try {
			
			nickName = br.readLine();
			map.put(nickName, sk);
			System.out.println("총 인원:" + map.size());
			sendMsgToAll(nickName + "입장");
			
			String nickmsg = "";		
			while( (nickmsg = br.readLine()) != null) {
				System.out.println(nickmsg);
				sendMsgToAll(nickmsg);
			}
		} catch (IOException e) {
			//e.printStackTrace();
			System.out.println("강제종료");
		} finally {
			map.remove(nickName);			
			System.out.println(nickName + "퇴장");
			sendMsgToAll(nickName + "퇴장");
		}
		
	}
	
	public void sendMsgToAll(String msg) {
		try {
			Iterator it = map.keySet().iterator();
			while(it.hasNext()) {
				Socket usersk = (Socket)map.get(it.next());
				uos = usersk.getOutputStream();
				uout = new PrintStream(uos);
				uout.println(msg);
			}	
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	

}
