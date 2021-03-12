package generics;

import java.util.HashMap;

public class UserExample {
	public static void main(String[] args) {
		System.out.println("hello".hashCode());
		System.out.println("hello23".hashCode());
		
		User user1 = new User();
		user1.userId = "user1";
		user1.score = 80;
		User user2 = new User(); //객체 비교는 안의 인스턴스 비교. 원래 항상 false.
		user2.userId = "user1";
		user2.score = 80;
		
		System.out.println(user1 == user2);
		
		HashMap<User, String> hashMap = new HashMap<>();//키와 밸류 형식으로 저장. 앞이 키값.키값알면 밸루 리턴 가능.
		hashMap.put(user1, "홍길동");
		hashMap.put(user1, "박길동"); //똑같은 키값들어오니까 기존에 있던거 박길동으로 바꿈.
		hashMap.put(user2, "최길동");
		
		String r1 = hashMap.get(user1);
		String r2 = hashMap.get(user2);
		System.out.println(r1 + ", " + r2);
	}
}
