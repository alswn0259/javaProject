package streams;

import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class FromIntRangeExample {
	public static void main(String[] args) {
		IntStream is = IntStream.range(10, 20); // 10 11 12 13 ... 19 만들어줌
		is.forEach(v -> System.out.println(v));
		System.out.println();
		
		is = IntStream.rangeClosed(10, 20); // 10 11 12 13 ... 20 만들어줌
		is.forEach(v -> System.out.println(v));
		
//		*15 ~ 35 까지 합구하기
		int from = 15, to = 35;
		is = IntStream.rangeClosed(from, to);
		int result = is.sum();
		System.out.println(result);
		
		
			
		}
	}

