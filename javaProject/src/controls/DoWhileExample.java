package controls;

import java.util.Scanner;

public class DoWhileExample {

	public static void main(String[] args) {
		//Scanner.readLine();
		Scanner scn = new Scanner(System.in);
		System.out.println("값을 입력.");
		String str = scn.nextLine(); // scn.nextInt(); 숫자 받을때
		System.out.println();
		
		do {
			System.out.println(">");
			str = scn.nextLine();
			System.out.println(">>>" + str);
		} while (!str.equals("q"));
		System.out.println("프로그램 종료.");
	}

}
