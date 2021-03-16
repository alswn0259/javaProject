package streams;

import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

import javax.sql.RowSet;
import javax.sql.rowset.Predicate;

public class FilteringExample {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("홍길동", "신용권", "김자바", "신용권", "신민철");
		
		names.stream()
			.distinct()
			.forEach(new Consumer<String>() {

				@Override
				public void accept(String t) {
					System.out.println(t);
				}	
			});
		System.out.println();
		
		names.stream()
			.filter(n -> n.startsWith("신"))
			.forEach(n -> System.out.println(n));
		System.out.println();
	
		names.stream()
			.distinct()
			.filter(n -> n.startsWith("신"))
			.forEach(n -> System.out.println(n));
	}
}
