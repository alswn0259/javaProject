package test0318;

import java.util.Arrays;
import java.util.List;

public class Exam04 {
	public static void main(String[] args) {
		List<Student> studentList = Arrays.asList(
				new Student("천서진", 30, 40),
				new Student("주단태", 55, 60),
				new Student("오윤희", 20, 35),
				new Student("심수련", 70, 80)
				);
		
		studentList.stream()
					.filter(t -> (t.getEngScore() + t.getMathScore()) > 100)
					.forEach(t -> System.out.println(t.toString()));
		
	}
}
