package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class StudentExample {

	public static void main(String[] args) {
		Map<Student, Integer> map = new HashMap<Student, Integer>();
		map.put(new Student(1, "홍길동"), 90);
		map.put(new Student(2, "김민수"), 85);
		map.put(new Student(1, "홍길동"), 92);//key 중복으로 못들어옴. 다른걸로 인식해서 다 출력됨.
											//이름이 같으면 논리적으로 같도록해주기 => hashcode equals 사용
		
		Set<Student> set = map.keySet(); //keySet key값 뽑는 매소드로 set에 담음
		Iterator<Student> iter = set.iterator();
		while(iter.hasNext()) {
			Student student = iter.next();
			System.out.println(student.toString());
		}
	}

}
