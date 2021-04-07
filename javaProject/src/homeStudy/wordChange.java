package homeStudy;

import java.util.Scanner;

public class wordChange {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("-------------룰루랄라~ 끝말있기 게임!!---------------");
		System.out.println("***3글자만 입력가능");
		System.out.println("***한국어만 입력가능");
		System.out.println("1. 게임시작 | 2. 게임종료 ");
		
		 
		String lastWord = null;
		String word = null;
		String insertWord = null;
		String firstWord = null;
		String first = null;
		
		System.out.println("선택>> ");
		int startNum = scn.nextInt();
		
		
		while(true) {
			if(startNum != 1 ) {
				System.out.println("게임을 종료합니다.. 다음에 또 만나요~!(찡긋!)");
				break;
			}
		
			if (startNum == 1) {
				System.out.println("두근두근 game start!!");
				
				System.out.println("단어입력>>");
				first = scn.next();	
				
				
				while(first.length() == 3) {
					
				System.out.println("단어입력>>");
				insertWord = scn.next();
				
				lastWord = first.substring(2);
				firstWord = insertWord.substring(0,1);
				
				if(lastWord.equals(firstWord)) {
					first = insertWord;
					continue;
				} else { 
					break;
				}
				
				}
				
					
			}
			System.out.println("땡!! 실패입니다..");
			System.out.println("게임을 종료 합니다.");
			break;
		}
	}
}
