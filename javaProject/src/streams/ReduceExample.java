package streams;

import java.util.Arrays;
import java.util.function.IntBinaryOperator;

public class ReduceExample {
	public static void main(String[] args) {
		Student[] students = {
				new Student("홍길동", 10),
				new Student("신용권", 20),
				new Student("유미선", 30)
		};
		int sum = Arrays.stream(students)// Stream<Studnet>
			.mapToInt(s -> s.getScore()) //IntStream
			.sum();
		System.out.println("sum: " + sum);
		
		sum = Arrays.stream(students)
				.mapToInt(s -> s.getScore())
				.reduce(0, new IntBinaryOperator() {
					@Override
					public int applyAsInt(int left, int right) {
						System.out.println("left: " + left + ", right: " + right);
						return left + right;
					}
				});
		System.out.println("sum: " + sum);
		
	}
}
