package streams;

import java.util.Arrays;
import java.util.function.IntConsumer;

public class LoopingExample {
	public static void main(String[] args) {
		
		//peek는 중간처리 메소드라 최종처리까지 마쳐야 출력된다.
		//peek까지만 하면 아무것도 안나옴
		//forEach는 최종처리 메소드
		int[] intAry = {5,3,2,1,4};
		Arrays.stream(intAry).peek(new IntConsumer() {
			@Override
			public void accept(int value) {
				System.out.println("peek: " + value);	
			}
		})
		.filter(n -> n>2)
		.forEach(s -> System.out.println("forEach : "));;
	}
}
