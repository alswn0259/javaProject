package io;

import java.io.FileInputStream;

public class FileInputstreamExample {
	public static void main(String[] args) {
		//파일 읽어들이기
		
		try {
			FileInputStream fis = new FileInputStream(
					"C:\\Dev\\git\\javaProject\\javaProject\\src\\io\\FileInputStreamExample.java");
			
			int data;
			while ( (data = fis.read() ) != -1) {
				System.out.write(data);
			}
			fis.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
				
	}
}
