package controls;

public class ForExample {

	public static void main(String[] args) {
	// 1~10의 합
		System.out.println("안녕");
		int sum = 0;
		for (int i=1; i<=10; i++) {
			if (i%2 == 0) {
			sum = sum + i;
			System.out.println("i : " + i + "\t" + "sum : " + sum);
			} 
		}
		System.out.println("1~10 吏앹닔 �빀 : " + sum);
		}
	}
