package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class BufferedReaderExample {
	public static void main(String[] args) throws IOException {
		//콘솔로부터 라인 단위로 읽기
		InputStream is = System.in;
		Reader reader = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(reader);//버퍼 스트림 생성!
		
		System.out.print("입력: ");
		String lineString = br.readLine();//한줄 전체를 읽습니다
										  //BufferedReader에 readLine()메소드를 활용하여 가능
		System.out.println("출력: " + lineString);
		
	}
}
