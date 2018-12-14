package com.kosmo.test2222;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ch15FileRwTest {

	public static void main(String[] args) {
		String source = "C:\\jp\\workspace_java\\java_prj\\src\\com\\kosmo\\test2222\\aaa.txt";
		String dest = "C:\\jp\\workspace_java\\java_prj\\src\\com\\kosmo\\test2222\\cp.txt";
		FileReader fr = null;
		FileWriter fw = null;
		BufferedReader br=null;
		BufferedWriter bw=null;
		
		
		//Reader r= new Reader(); 
		
		try {
//			char[] carr= {'j','a','v','a'};
			int res=0;
			fr = new FileReader (source);
			fw = new FileWriter (dest);
			br= new BufferedReader(fr);
			bw= new BufferedWriter(fw);
			
			
			String line= null;
			
			while((line = br.readLine()) !=null){
				System.out.println(line);
				bw.write(line);
			
			
			
			
//			while(( res = br.read()) !=-1){
//				System.out.println((char)res);
//				bw.write(res);
				
			}bw.flush();
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
			
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				br.close();
				bw.close();
			}catch (IOException e){
				
			}
		}System.out.println("----done---");
		}
		
	

}
