package test0318;

import java.util.Arrays;
import java.util.List;


public class Exam06 {
	public static void main(String[] args) {
		
	List<Employee> empList = Arrays.asList(
			new Employee(01, "배로나", "2012-12-12", "IT_PROG", 5000),
			new Employee(02, "로건리", "2013-04-11", "MK_REP", 4500),
			new Employee(03, "주석경", "2015-03-18", "IT_PROG", 3500),
			new Employee(04, "주석훈", "2015-08-03", "SA_REP", 3300)
			);
	
	Double itProgAvg = empList.stream()
								.filter( t -> t.getDep().equals("IT_PROG"))
								.mapToInt( t -> t.getSalary())
								.average()
								.orElse(0.0);
	System.out.println("개발자(IT_PROG)인 사원의 평균급여 : " + itProgAvg);
	}
}
