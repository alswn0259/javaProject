package streams;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FromArrayExample {
	public static void main(String[] args) {
		String[] strArray = { "홍길동", "신용권", "김미나" };
		Stream<String> strStream = Arrays.stream(strArray); 
		strStream.forEach(a -> System.out.print(a + ","));
		System.out.println();
		
		int[] intArray = {1, 2, 3, 4, 5 };
		IntStream intStream = Arrays.stream(intArray);
		intStream.forEach(a -> System.out.print(a + ","));
		System.out.println();
		
//		IntStream.of 사용하는 방법도 있음		
//		int[] intAry = {1, 2, 3, 4, 5 };
//		IntStream intStream1 = IntStream.of(intAry);

//		합계 구하기 방법 1)
		int sum=0;
		sum = intStream.sum();
		System.out.println("합계는 : " + sum);
		
//		합계 구하기 방법 2)
		sum=0;
		for (int a : intArray) {
			sum += a;
		}
		System.out.println("합계는 : " + sum);
		
//		짝수 합 구하기1)
		sum = intStream.filter((int value) -> value % 2 == 0).sum();
		System.out.println("짝수 합 : " + sum);
		
		intStream = Arrays.stream(intArray);
		OptionalDouble avg = intStream.filter(t -> t%2 == 0).average();
	}
}
