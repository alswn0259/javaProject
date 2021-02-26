package references;

import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int[][] student = null;
		int studentNum = 0;
		int[] stuNumber = null; //학생 번호 담을것.
		
		
		while (true) {
			System.out.println("--------------------------------------------------------------------");
			System.out.println("1.학생수 2.점수입력 3.리스트 4.조회 5.영어최고점 6.합계최고 7. 수학평균이상 9.종료 ");
			System.out.println("--------------------------------------------------------------------");
			System.out.print("선택> ");
		

			int menu = scn.nextInt();
		    if (studentNum != 0 && stuNumber != null && menu <=2) {
		    	System.out.println("이미 입력했습니다.");
		    	continue;
		    	}
		    
			
			if (menu == 1) {
				System.out.print("학생수 > ");
				studentNum = scn.nextInt();
			} else if (menu == 2) {
				stuNumber = new int[studentNum];
				student = new int[studentNum][2];
				for (int i=0; i<studentNum; i++) {
					System.out.print("학생번호>> ");
					stuNumber[i] = scn.nextInt();
					for (int j=0; j<=1; j++) {
						if (j == 0) { 
						System.out.print("영어점수> ");
						student[i][j] = scn.nextInt();
						} else if (j == 1) {
						System.out.print("수학점수> ");
						student[i][j] = scn.nextInt();	
						}	
					}
				}
		} else if (menu == 3) {
			for (int i=0; i<studentNum; i++) {
			System.out.println("학생정보 - 번호:" + stuNumber[i] +", 영어: " + student[i][0] + ", 수학:" + student[i][1]);
		}
		} else if (menu == 4) {
			System.out.print("찾고자 하는 학생번호 입력> ");
			int input = scn.nextInt();
			for (int i=0; i<studentNum; i++) {
				if (input == stuNumber[i]) {
			System.out.println("학생정보 - 번호:" + stuNumber[i] + ", 영어:" + student[i][0] + ", 수학: " + student[i][1]);
		} 
			} 
		} else if (menu == 5) {
			int maxEng = 0;
			for(int i1=0; i1<studentNum; i1++) {
				maxEng = student[i1][0] > maxEng ? student[i1][0] : maxEng;
			}
			for(int j1=0; j1<studentNum; j1++) {
				if (maxEng == student[j1][0]) {
					System.out.println("영어최고점: 학생번호 - " + stuNumber[j1] + " - 영어:" + student[j1][0]);
				}
				}
			} else if (menu == 6) {
			int sum[] = new int[studentNum];
				for(int i=0; i<studentNum; i++) {
				sum[i] = student[i][0] + student[i][1];
			}
				int maxSum = 0;
				
				for(int i=0; i<studentNum; i++) {
				maxSum = sum[i] > maxSum ? sum[i] : maxSum;
				}
				
				double avg = maxSum/2.0 ;
				for(int j=0; j<studentNum; j++) {
					if (maxSum == sum[j]) {
						System.out.println("학생번호: " + stuNumber[j] + " 평균점수: " + avg);
					}
				}
		} else if (menu == 7) {
			double sumMath = 0.0;
			double avgMath = 0;
			for (int i=0; i<studentNum; i++) {
				sumMath += student[i][1];
			}
			avgMath = sumMath/studentNum;
			System.out.println("평균점수: " + avgMath);
			for (int i=0; i<studentNum; i++) {
				if(student[i][1] >= avgMath) {
					System.out.println("학생번호: " + stuNumber[i] + ", " + "수학점수: " + student[i][1]);
				}
			}
		} else if (menu == 9) {
			break;
}
		}
		System.out.println("프로그램 종료.");
	}
}
	
	