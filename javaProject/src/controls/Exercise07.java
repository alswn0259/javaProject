package controls;

import java.util.Scanner;

public class Exercise07 {

	public static void main(String[] args) {
		boolean run = true;
		int balance = 0;
		Scanner scn = new Scanner(System.in);// ctrl + shft + o : import 자동 생성

		while (run) {
			System.out.println("-----------------------------");
			System.out.println("1.예금 2.출금 3.잔고 4.종료");
			System.out.println("-----------------------------");
			int menu = scn.nextInt();// 숫자값을 읽어온다.

			if (menu == 1) {
				System.out.println("입금할 금액을 입력하세요. >>>");
				balance += scn.nextInt();
			} else if (menu == 2) {
				System.out.println("출금할 금액을 입력하세요. >>>");
				balance -= scn.nextInt();
			} else if (menu == 3) {
				System.out.println("잔고는 " + balance + "원 입니다.");
			} else if (menu == 4) {
				run = false;
			}
		}
		System.out.println("프로그램 종료.");
	}
}
