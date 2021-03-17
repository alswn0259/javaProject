package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.IntConsumer;
import java.util.function.ToIntFunction;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MapExample {
	public static void main(String[] args) {
		List<Student> studentList = Arrays.asList(
				new Student("홍길동", 10),
				new Student("신용권", 20),
				new Student("유미선", 30)
				);
		
		studentList.stream() //Stream<Student>
					.mapToInt(new ToIntFunction<Student>() { 
						@Override
						public int applyAsInt(Student value) {
							return value.getScore();
						}
					}) // IntStream != Stream<Integer>
					.forEach(new IntConsumer() {
						@Override
						public void accept(int value) {
							System.out.println(value);
						}
					});
		//람다식으로 줄이기!!
		studentList.stream()
					.mapToInt(Student :: getScore) 
					.forEach(score -> System.out.println(score));
	
		int[] intAry = {};
		Integer[] integerAry = {};
		
		IntStream is = Arrays.stream(intAry);
		Stream<Integer> iss = Arrays.stream(integerAry);
	}
}
