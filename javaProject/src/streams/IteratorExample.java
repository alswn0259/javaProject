package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.stream.Stream;

import hr.EmpDAO;
import hr.Employee;

public class IteratorExample {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Hong");
		list.add("Kim");
		list.add("Shin");
		
		list = Arrays.asList("Hong", "Kim", "Park"); //이렇게 추가해줘도됨.
		
		for (String str : list) {
			System.out.println(str);
		}
		Iterator<String> iter = list.iterator();
		while(iter.hasNext()) {
			String val = iter.next();
			System.out.println(val);
		}
		
		//반복 편하게~
//		Stream<String> stream = list.stream();
//		int sum = stream.mapToInt(s -> s.length()).sum());
//		stream.forEach(new Consumer<String>() {//스트림의 각 요소에 대해 기능을 정의해 넣어라
//
//			@Override
//			public void accept(String t) {
//				System.out.println(t);
//			}
//		});
		
		EmpDAO dao = new EmpDAO();
		List<Employee> empList = dao.getEmpList();
		Stream<Employee> eStream = empList.stream();
		// salary > 10000이상인 사원 -> 사원들의 급여의 합계
		
//		int sum2 = eStream.filter(new Predicate<Employee>() {
//
//			@Override
//			public boolean test(Employee t) {
//				return t.getSalary() > 10000;
//			}
//			
//		}).mapToInt(new ToIntFunction<Employee>() {
//
//			@Override
//			public int applyAsInt(Employee t) {
//				return t.getSalary();
//			}
//		}).sum();
//		System.out.println("급여가 10000이상인  사원들의 급여 합계 : " + sum2);
//		
//		List<Integer> intList = Arrays.asList(10, 20); 
		
		//줄이기. stream의 특징 반복문 없이 기능만 구현
		int sum2 = eStream.filter((Employee t) -> t.getSalary() > 10000)
													.mapToInt((Employee t) -> t.getSalary())
														.sum();
		System.out.println("급여가 10000이상인  사원들의 급여 합계 : " + sum2);
		
	}
}
