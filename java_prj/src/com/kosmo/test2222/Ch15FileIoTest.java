package com.kosmo.test2222;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ch15FileIoTest {

	public static void main(String[] args) {
		String sorce = "C:\\jp\\workspace_java\\java_prj\\src\\com\\kosmo\\test2222\\aaa.txt";
		String dest = "C:\\jp\\workspace_java\\java_prj\\src\\com\\kosmo\\test2222\\cp.txt";
		
		File sfile = new 	File(sorce);
		File dfile = new 	File(dest);
		if(sfile.isDirectory()||dfile.isDirectory())
			System.exit(0);
		
		//		String name = "./aaa.txt";
		FileInputStream fis =null;
		FileOutputStream fos= null;	
//		BufferedInputStream bis=null;//보조장치장착
//		BufferedOutputStream bos=null;//보조장치장착
		DataInputStream dis = null;
		DataOutputStream dos = null;
		
		
		try {
			fis= new FileInputStream(sfile);
			fos= new FileOutputStream(dfile,true);
			
			dis=new DataInputStream(fis);
			dos=new DataOutputStream (fos);
			int num=0;
			while(dis.available() > 0) {
				num=dis.readInt();
				System.out.println(num+10);
				dos.writeInt(num);
			}
			
//			bis=new BufferedInputStream(fis);
//			bos=new BufferedOutputStream(fos);
//			
//			int res =0;
//			while((res =bis.read())!= -1) {
//				System.out.println((char)res);
//				bos.write(res);

//			}
//			bos.flush(); //다끊냈다고 말해줘야함.버퍼를 다 비웠다는 뜻.****flush를 꼭해줘야함.
			
//			byte[] b= {65,66,67,68};
//			int num=65;
//			String dest = "C:\\jp\\workspace_java\\java_prj\\src\\com\\kosmo\\test2222\\cp.txt";
//			fos= new FileOutputStream(dest);
//			fos.write(num);

			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}catch (IOException e){
			e.printStackTrace();
		}
		
		finally {
			try{
				dis.close();
				dos.close();
				
				
				
			}
			catch (IOException e) {
				e.printStackTrace();
			}
			
			
			
			
			
			
			System.out.println("----done---");
		}
	}
}
			
			
			
			
			





