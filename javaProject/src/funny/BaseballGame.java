package funny;

import java.util.Scanner;

public class BaseballGame {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		int[] rmBall = new int[3];
		int[] myBall = new int[3];

		for (int i = 0; i < rmBall.length; i++) {
			rmBall[i] = (int) (Math.random() * 9) + 1;
//			System.out.print(rmBall[i] + " ");
		}
		System.out.println();

		while (true) {
			int strikeCount = 0;
			int ballCount = 0;
			System.out.println("공을 던지세요!!");
			for (int j = 0; j < rmBall.length; j++) {
				System.out.print((j + 1) + "번째 공> ");
				myBall[j] = scn.nextInt();
				scn.nextLine();
			}
			for (int i = 0; i < rmBall.length; i++) {
				if (rmBall[i] == myBall[i]) {
					strikeCount++;
				}
				for (int j = 0; j < rmBall.length; j++) {
					if (i != j && rmBall[i] == myBall[j]) {
						ballCount++;
					}
				}
			}
			if (ballCount != 0 || strikeCount != 0) {
				System.out.println(strikeCount + "S  " + ballCount + "B");
				break;
			}
		}
	}
}
