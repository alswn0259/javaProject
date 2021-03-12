package collections;

import java.util.List;
import java.util.ArrayList;

public class ArrayListExample {
	public static void main(String[] args) {
		String[] strAry = new String[10];
		strAry[0] = "Hello";
		strAry[1] = "World";
		strAry[4] = "Nice";
		for(int i=0; i<strAry.length; i++) {
			if(strAry[i] != null) {
				System.out.println(strAry[i]);
			}
		} 
//		List<int> 제네릭에서 기본 타입 올 수 없다.
		List<integer> numList = new ArrayList<>(); 이렇게 해줘야함
		numList.add(10);
		numList.add(20);
		List<String> strList = new ArrayList<>(); //문자열만 담겠습니다
		strList.add("Hello");
		strList.add("Nice");
		strList.add("Good");
		strList.add(0,"Very"); //index값 0인 자리에 Very 넣겠다.
		
		for(int i=0; i<strList.size(); i++) {
			strList.get(i);
		}
		
		
		
		System.out.println(strList.size());
		strList.remove(0); //index값 0인거 지움. null인공간 땡겨ㅓ 없음
//		for (int i=0; i<50; i++) {
//			strList.add(String.valueOf(i));
//		}
//		strList.add(100);
//		for(Object obj : strList) {
//			String str = (String) obj;
//			System.out.println(str.equals("Hello"));
//		}
	}
}
