package collectionsexercise;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class MapExample {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);
		
		String name = null;
		int maxScore = 0;
		int totalScore = 0;
		
		
		Set<String> set = map.keySet();
		Iterator<String> iter = set.iterator();
		while(iter.hasNext()) {
			String color = iter.next();
			totalScore += map.get(color);
			if(maxScore > map.get(color)) {
			} else {
				maxScore = map.get(color);
				name = color;
			}
		}
		
		System.out.println("평균점수 : " + totalScore/map.size());
		System.out.println("최고점수 : " + maxScore );
		System.out.println("최고점수를 받은 아이디 : " + name );
		
		String str; //String class는 compareTo 구현한다.
		System.out.println("a".compareTo("c"));//두 글자 비교해서 차이 나타내줌
		TreeSet<String> tSet = new TreeSet<>();//정렬해서 저장
		tSet.add("a");
		tSet.add("b");
		tSet.add("c");
		tSet.first();
		tSet.last();
		
	}
}
