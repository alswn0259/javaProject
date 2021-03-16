package streams;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;

public class StreamPipeExample {
	public static void main(String[] args) {
		List<Member> list = Arrays.asList(new Member("Hong", Member.MALE, 30), new Member("Kim", Member.FEMALE, 20),
				new Member("Shin", Member.MALE, 46), new Member("Park", Member.FEMALE, 27));
		OptionalDouble result = list.stream().filter(new Predicate<Member>() {

			@Override
			public boolean test(Member t) {
				return t.getSex() == Member.MALE;
			}
		})// Stream<Member>
				.mapToInt(new ToIntFunction<Member>() {

					@Override
					public int applyAsInt(Member value) {
						return value.getAge();
					}
				})// IntStream
				.average(); // average는 OptionalDouble type class
		System.out.println("평균: " + result.getAsDouble());

//		*컬렉션 -> 스트림 -> 매핑(나이) -> 필터(30세 이상) -> 평균 나이 구해보세요
		OptionalDouble avg = list.stream().mapToInt(new ToIntFunction<Member>() {

			@Override
			public int applyAsInt(Member value) {
				return value.getAge();
			}
		}).filter(new IntPredicate() {
			@Override
			public boolean test(int value) {
				return value >= 30;
			}
		}).average();
		//OptionalDouble로 만족하는 조건 없는경우도 출력하게 할 수 있음. double 타입으로해도 되지만 기능은 할수 없음
		//방법1)
		if(avg.isPresent()) { 
			System.out.println("평균: " + avg.getAsDouble());
		} else {
			System.out.println("만족하는 요소가 없습니다.");
		}
		//방법2) 결과값없으면 0.0 넣기로 설정.
		avg.orElse(0.0); 
		
		
		
	}
}
