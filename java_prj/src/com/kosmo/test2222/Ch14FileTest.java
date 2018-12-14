package com.kosmo.test2222;

import java.io.File;
import java.util.ArrayList;

public class Ch14FileTest {

	public static void main(String[] args) {
//		String source = "C:\\jp\\workspace_java\\java_prj\\src\\com\\kosmo\\test2222\\aaa.txt";
//		File f = new File(source);
//		System.out.println(f.getPath());//경로가뭐냐
//		System.out.println(f.getAbsolutePath());//절대경로가뭐냐
//		System.out.println(f.getName());//파일명
//		System.out.println(f.getParent());//부모의경로
//		System.out.println(f.isFile());//파일이 맞냐
//		System.out.println(f.isDirectory());//디렉토리냐
//		f.delete();		
//		System.out.println(f.getName());
		ArrayList subDir= new ArrayList();
		
		String path ="C:\\jp\\workspace_java\\java_prj\\src";
		File f= new File(path);
		//File f = new File(dir/aa.txt);		
		File[] farr= f.listFiles();
		for(int i=0; i<farr.length;i++){
			if(farr[i].isDirectory()) {
				subDir.add(i+"");
				
				
				
				System.out.println("<DIR>"+farr[i].getName());
			}else {
				System.err.println(farr[i].length()+"\t");
			}
			}
		int dirNum= subDir.size();
		int fileNum= farr.length-dirNum;
		
		int totalFils = fileNum;
		int totalDirs = dirNum;
		 
		 System.out.println(fileNum+"개의 파일,"+dirNum+"개의 디렉토리");
		 System.out.println();
		 
		 for(int i=0; i<subDir.size();i++) {
			 int index= Integer.parseInt((String)subDir.get(i));
			// printFileList(farr[index]);
		 }
		 
		
		System.out.println("----done----");

	}

	public void showList(String path) {
		File f = new File(path);
		File[] farr= f.listFiles();
		for(File getiFile : farr) {
		
			if(getiFile.isDirectory()) {
				System.out.println("<DIR>\t"+getiFile.getName()+"\t");
				showList(path+"\\"+getiFile.getName());
			}
			
			
			
			
		}
		
		
	}

}
