package controls;

public class Exercise05 {

	public static void main(String[] args) {
		//임의의 값 두수를 35, 60
		// 35~60까지의 합을 구하는 프로그램 생성.
		int sNum = 35;
		int eNum = 60;
		int result = getSumValue(sNum,eNum);
		System.out.println(sNum + "와 " + eNum + "사이 수의 합 : " + result);
	}
	public static int getSumValue(int num1, int num2) {
		// 정수1, 정수2 사이의 합을 구하는 메소드 
		int result = 0;
		for(int i=num1; i<=num2; i++) {
		result += i;
		System.out.println("i : " + i + ", result : " + result);
	}
	return result;
	}
	
		
//	public static void exercise05() {
//		for (int x = 1; x <= 10; x++) {
//			for (int y = 1; y <= 10; y++) {
//				int result = 4 * x + 5 * y;
//				if (result == 60) {
//					System.out.println("(" + x + "," + y + ")");
//				}
//			}
//		}
//	}
}
