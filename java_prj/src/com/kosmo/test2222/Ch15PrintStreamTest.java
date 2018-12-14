package com.kosmo.test2222;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Scanner;

public class Ch15PrintStreamTest {

	public static void main(String[] args) {
		byte[] sarr= {65,66,67,68};
		ByteArrayInputStream bais = new ByteArrayInputStream(sarr);
		String dest ="C:\\jp\\workspace_java\\java_prj\\src\\com\\kosmo\\test2222\\cp.txt";
		FileOutputStream fos;
		try {
			fos = new FileOutputStream(dest);
			PrintStream out = new PrintStream(fos);
			
			int res=0;
			
			while((res=bais.read())!=-1) {
				//System.out.println(res);
				out.println(res);
			}
		} catch (FileNotFoundException e) {
		
			e.printStackTrace();
		}
//		String name = "kim";
//		int age =10;
		System.out.printf("my name is %s, age is %d","kim",10);
		System.out.printf("%d", 10);
//		ByteArrayOutputStream baos = new ByteArrayOutputStream();
//		PrintStream out = new PrintStream(baos);
		try {
			InputStreamReader isr=
					new InputStreamReader(System.in);
			System.out.println("1byte:"+isr.read());
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("입력:");
		Scanner s= new Scanner(System.in);
		//String scStr =s.nextLine();
		int scStr =s.nextInt();
		System.out.println(scStr+5);
		System.err.println("dddddddddd");
		
		
		
				System.out.println("--------done---------");

	}

}
