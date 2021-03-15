package collections;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExample {
	public static void main(String[] args) {
		TreeSet<Integer> scores = new TreeSet<Integer>();
		scores.add(new Integer(87));
		scores.add(new Integer(98));
		scores.add(new Integer(75));
		scores.add(new Integer(95));
		scores.add(new Integer(80));
		
		//TreeSet 클래스는 크다 작다 정렬된 상태로 되있음 작 -> 큼
		Iterator<Integer> iter = scores.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		} 
		System.out.println("============================");
		//역순 정렬 큰 -> 작 내림차순 descebdubgUteratir() 매소드
		iter = scores.descendingIterator();
				while(iter.hasNext()) {
					System.out.println(iter.next());
				} 
		System.out.println("============================");
		//내림차순으로 출력 descendingSet() 매소드
		NavigableSet<Integer> nset = scores.descendingSet();
		for (Integer i : nset) {
			System.out.println(i);
		}
		
		Integer score = null;
		
		score = scores.first();
		System.out.println("가장 낮은 점수: " + score);
		
		score = scores.last();
		System.out.println("가장 높은 점수: " + score);
		
		score = scores.lower(new Integer(95));
		System.out.println("95점 아래 점수: " + score);
		
		score = scores.higher(new Integer(95));
		System.out.println("95점 위의 점수: " + score);
		
		score = scores.floor(new Integer(95));
		System.out.println("95점이거나 바로 아래 점수: " + score);
		
		score = scores.ceiling(new Integer(95));
		System.out.println("95점이거나 바로 위의 점수: " + score);
		
		while (!scores.isEmpty()) {
			score = scores.pollFirst();
			System.out.println(score + "(남은 객체 수: " + scores.size()+ ")");
		}
	}
}
