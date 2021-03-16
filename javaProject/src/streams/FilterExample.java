package streams;

import java.util.Arrays;
import java.util.List;

public class FilterExample {
	public static void main(String[] args) {
		List<Member> members = Arrays.asList(
				new Member("Hong", Member.MALE, 30), 
				new Member("Kim", Member.FEMALE, 20),
				new Member("Shin", Member.MALE, 46), 
				new Member("Hong", Member.MALE, 30),
				new Member("Park", Member.FEMALE, 27)
				);
		
		members.stream()
				.distinct()
				.forEach(n -> System.out.println(n.toString()));	
	}
}
