package com.yedam.diary;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;

public class StdInputUtil {
	//사용자가 입력한 숫자, 문자, 장문 입력한거를 읽어오는데 버퍼 리더로 읽어옴
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
	static SimpleDateFormat df = new SimpleDateFormat("yyMMdd");
	
	//정수값 읽어오는 메소드 만들어줌(static으로 해줬음)
	static int readInt() {
		int result = 0;
		
		do { //정상적으로 숫자 형식넣을 수 있게 반복
		try {
			
			String temp = br.readLine();//String 타입으로읽어옴
			result = Integer.parseInt(temp);//정수 타입으로바꿔줌
			break;
		} catch (Exception e) {
//			e.printStackTrace();
			System.out.println("숫자 형식이 아닙니다.");
			}
		} while (true); //정상적으로 숫자 넣었으면 빠져나옴
		return result;
	}
	//날짜 입력
	public static String readDate() {
		String result = "";
		do {
		try {
			result = br.readLine();
			df.parse(result.trim());
			break;
		} catch (Exception e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println("날짜 형식이 아닙니다.");
		}
		} while (true);
		return result;
	}
	//단어검색
	public static String readWord() {
		String result = "";
		try {
			result = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return result;
	}
	// 여러줄 입력
	public static String readMultiLine() {
		StringBuffer result = new StringBuffer();
		try {
			while(true) {
			String temp = br.readLine();
			if(temp.equals("end")) {
				break;
			}
			result.append(temp + "\n");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return result.toString();
	}
}
