package io;

import java.io.FileReader;
import java.io.FileWriter;

public class FileReaderExample {
	public static void main(String[] args) throws Exception {
//		*1)buf 사용해서 하는 방법
//		FileReader fr = new FileReader(
//				"C:\\Dev\\git\\javaProject\\javaProject\\src\\io\\FileReaderExample.java");
//		
//		int readCharNo;
//		char[] cbuf = new char[100];
//		while ((readCharNo = fr.read(cbuf)) != -1) {
//			String data = new String(cbuf, 0, readCharNo);
//			System.out.println(data);
//		}
//			fr.close();
			
//		2) int 값으로 받아온거 char 타입으로 바꿔서 출력하도록하는 방법
		int data = 0;
		FileReader fr = new FileReader(
				"C:\\Dev\\git\\javaProject\\javaProject\\src\\io\\FileReaderExample.java");
		//파일 읽어오는거도 추가
		FileWriter fw = new FileWriter("C:/Temp/file1.txt");
			
		while ((data = fr.read()) != -1) {
//			System.out.println((char) data);
			fw.write(data);
		}
		fw.flush();
		fw.close();
		fr.close();
		System.out.println("end.....");
	}
}
