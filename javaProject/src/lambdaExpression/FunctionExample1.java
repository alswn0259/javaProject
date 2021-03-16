package lambdaExpression;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntPredicate;
import java.util.function.ToIntFunction;
import java.util.stream.Stream;

import hr.EmpDAO;
import hr.Employee;

public class FunctionExample1 {

	private static List<Student> list = Arrays.asList( // main 메소드에서 사용할거라 바로 사용할 수 있도록 static
			new Student("홍길동", 90, 96), new Student("신용권", 95, 93));

	public static void printString(Function<Student, String> function) {
		for (Student sudent : list) { // list 갯수만큼 루핑돌면서 student에 넣어줌 student를 function의 매개값으로 넣어줌
			System.out.println(function.apply(sudent) + " "); // apply 메소드
		}
		System.out.println();
	}

	public static void printInt(ToIntFunction<Student> function) {
		for (Student student : list) {
			System.out.println(function.applyAsInt(student) + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		System.out.println("[학생이름]");
		printString(t -> t.getName());
//		위에글 풀어서 쓰면
//		printString(new Function<Student, String>() {
//			public String apply(Student t) {
//				return t.getName();
//			}
//		});

		System.out.println("[영어점수]");
//		printInt( t -> t.getEnglishScore());
		printInt(new ToIntFunction<Student>() {
			public int applyAsInt(Student t) {
				return t.getEnglishScore();
			}
		});

		System.out.println("[수학점수]");
		printInt(t -> t.getMathScore());

		EmpDAO dao = new EmpDAO();
		List<Employee> list = dao.getEmpList();
		Stream<Employee> stream = list.stream();
		stream.forEach(t -> {
			System.out.println(t.getFirstName() + ", " + t.getSalary());
		});// 익명구현객체를 만들자
		stream.mapToInt((value) -> value.getSalary())
				.filter((value) -> value > 5000) // 연봉 5000이상인 사람만
				.forEach(t -> System.out.println("salary: " + t));
	}
}