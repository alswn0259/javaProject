package nestedClasses;

public class Funny {

	public static void main(String[] args) {
		//1~25까지 5개씩 가로로 출력
		for(int i=1; i<=25; i++) {
			
			System.out.printf("%3d",i);
			if(i%5 == 0) {
				System.out.println();
			}
		}
		System.out.println();
		//1~25까지 5개씩 세로로 출력
		for (int i=1; i<=5; i++) {
			System.out.printf("%3d",i);
			for(int j=1; j<=4; j++) {
				int num = i+j*5;
				System.out.printf("%3d", num);
				if (j==4) {
					System.out.println();
				}
			}
		}
		
		//1~25까지 오른쪽->왼쪽 으로 5개씩
		int k=1;
		int[][] ary = new int[5][5];
				for (int i=0; i<ary.length; i++) {
					for (int j=0; j<ary.length; j++) {
						ary[i][j] = k;
						k++;
					}
				}
				System.out.println();
	
			for (int i=0; i<ary.length; i++) {
				
				for (int j=ary.length-1; j>=0 ; j--) {
					System.out.printf("%3d",ary[i][j]);
					if(j==0) {
						System.out.println();
					}
			}
					
		}
			System.out.println();
		for (int i=ary.length-1; i>=0; i--) {
			for(int j=0; j<ary.length; j++ ) {
				System.out.printf("%3d",ary[i][j]);
				if(j==(ary.length-1)) {
					System.out.println();
				}
			}
		}
		
	}

}
