package test0318;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class Exam05 {
	public static void main(String[] args) {
		List<Employee> empList = Arrays.asList(
				new Employee(01, "배로나", "2012-12-12", "IT_PROG", 5000),
				new Employee(02, "로건리", "2013-04-11", "MK_REP", 4500),
				new Employee(03, "주석경", "2015-03-18", "IT_PROG", 3500),
				new Employee(04, "주석훈", "2015-08-03", "SA_REP", 3300)
				);
		
		OptionalDouble avg = empList.stream()
									.mapToInt(t -> t.getSalary())
									.average();
		System.out.println("전체사원의 평균 급여 : " + avg.getAsDouble());
	}
}
