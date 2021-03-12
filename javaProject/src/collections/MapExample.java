package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExample {
	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<>();//키값은 String 값은 Integer
		map.put("홍길동", 15);//put 으로 요소를 담아줌
		map.put("김민주", 20);
		map.put("박소연", 23);
		map.put("홍길동", 25);//같은 키 다른 값 어떻게 나오는지 보기. 이름만 같으면 논리적으로 같은거로 본다!! 
		
		Integer result = map.get("홍길동");//map에 key 값넣으면 값을 리턴한다

		Set<String> set = map.keySet();//key만 뽑아내는 keySet. map에 있는 key값 먼지 보려고
//		방법1.
//		Iterator<String> iter = set.iterator();//set은 get못쓰니까 iterator 반복자 사용
//		while(iter.hasNext()) { //hasnext 하나씩 빼옴
//			String key = iter.next();//키값 하나 가져옴 String 타입
//			Integer val = map.get(key);//value 타입은 integer
//			System.out.println("key: " + key + ", val: " + val);
//		}
//		
//		방법2.
		for(String key : set) {
			Integer val = map.get(key);
			System.out.println("key: " + key + ", val: " + val);
		}
		Map<Integer, String> sMap = new HashMap<>();
		String sResult = sMap.get(10);
		
	}
}
