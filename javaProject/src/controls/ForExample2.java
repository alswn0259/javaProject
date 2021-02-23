package controls;

public class ForExample2 {

	public static void main(String[] args) {
//		int num = 5;
//		for (int i=1; i<10; i++) {
//			System.out.println(num + " * " + i + " = " + (num * i));
//		}
	
		for (int i=2; i <= 9; i++) {
		showResult(i);
	}
	}

	public static void showResult(int num) {
		for (int i = 1; i < 10; i++) {
			System.out.println(num + " * " + i + " = " + (num * i));
		}
	}

}
