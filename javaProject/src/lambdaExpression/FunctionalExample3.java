package lambdaExpression;

@FunctionalInterface
interface MyFuncInterface{
	int run(int a, int b);
}

public class FunctionalExample3 {
	public static void main(String[] args) {
		MyFuncInterface mfi = (a,  b) -> a + b;
	
		int result = mfi.run(10, 20);
		System.out.println("두 수의 합은 " + result);
		
		mfi = (num1,num2) -> num1 * num2;
		
		result = mfi.run(10, 20);
		System.out.println("두 수의 곱은 " + result);
		
		mfi = (n1,n2) -> n1 * n2 /2;
		
		result = mfi.run(10, 20);
		System.out.println("삼각형의 넓이는 " + result);
		}
	}