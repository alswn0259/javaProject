package controls;

public class Exercise04 {

	public static void main(String[] args) {
		boolean i = true;
		while (i) {
			int num1 = (int) (Math.random()*6 + 1); 
			int num2 = (int) (Math.random()*6 + 1);
			System.out.println("num1 : " + num1 + "\t" + "num2 : " + num2);
			if (num1+num2 == 5) {
				System.out.println("두 수의 합이 5라서 종료 합니다.");
				break;
			}

		}
	}

}
