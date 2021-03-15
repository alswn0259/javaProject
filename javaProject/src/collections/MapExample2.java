package collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapExample2 {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("홍길동", 10);
		map.put("김민주", 20);
		map.remove("홍길동");
		
		//key 값 넣어주면 value 값 나옴.
		Integer result = map.get("홍길동");
		System.out.println("key: 홍길동" + ", val: " + result);
		if(map.containsKey("홍길동")) {
			System.out.println("key: 홍길동" + ", val: " + result);
		}
		//반복자
		Set<String> set = map.keySet(); //key 값만 가져오기
		Iterator<String> iter = set.iterator();
		while(iter.hasNext()) {
			String key = iter.next();
			Integer val = map.get(key);			
			System.out.println("key: " + key + ", val:" + val);
		}
		
		//Map.Entery<String, Integer> key 와 value 쌍으로 가져오기
		Set<Entry<String, Integer>> entSet = map.entrySet(); 
		Iterator<Entry<String, Integer>> entIter = entSet.iterator();
		while(entIter.hasNext()) {
			Entry<String, Integer> ent = entIter.next();
			String key = ent.getKey();
			Integer val = ent.getValue();
			System.out.println("key: " + key + ", val:" + val);
		}
	}

}
