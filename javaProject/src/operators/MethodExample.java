package operators;

public class MethodExample {

	public static void main(String[] args) {
		int result1 = sum(10, 20);
		int result2 = minus(30, 20);
		int result3 = multi(15, 13);
		int result4 = divide(30, 12);
		System.out.println("더하기 결과 : " + result1);
		System.out.println("빼기 결과 : " + result2);
		System.out.println("곱하기 결과 : " + result3);
		System.out.println("나누기 결과 : " + result4);
		
		printAge(25);
	}
	
	public static void printAge(int age) {
		System.out.println("나이는 : " + age + "입니다.");
	}

	public static int sum(int a, int b) {
		int result1 = a + b;
		return result1;
	}

	public static int minus(int a, int b) {
		int result2 = a - b;
		return result2;
	}

	public static int multi(int a, int b) {
		int result3 = a * b;
		return result3;
	}

	public static int divide(int a, int b) {
		int result4 = a / b;
		return result4;
	}
}
