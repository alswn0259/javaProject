package streams;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SortExample {
	public static void main(String[] args) {
		//숫자 정렬
		int[] intAry = {5,3,2,1,4};
		IntStream is = Arrays.stream(intAry);
		is.sorted().forEach(number -> System.out.println(number));
		
		//문자는 크다 작다 기준 없음. Student가 Comparable 클래스 구현해줘야함 
		Student[] stdAry = { new Student("홍길동", 30),
				new Student("신용권", 20),
				new Student("유미선", 15)};
		Stream<Student> st = Arrays.stream(stdAry);
		st.sorted().forEach(s -> System.out.println(s.getName()));
	}
}
