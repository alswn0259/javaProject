package collections;

import java.util.Map.Entry;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeMap;

class Person implements Comparable<Person> { //TreeMap이 Comparable 구현해야 Person 클래스 키값으로 할 수 있음
	String name;
	
	Person(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(Person o) {
		
		return this.name.compareTo(o.name);
	}
	
	
}

public class TreeMapExample {
	public static void main(String[] args) {
		TreeMap<Person, Integer> tMap = new TreeMap<Person, Integer>();
		tMap.put(new Person("Hong"), 80);
		tMap.put(new Person("Hwong"), 85);
		tMap.put(new Person("Park"), 90);
	
		NavigableSet<Person> nSet = tMap.descendingKeySet();
		for(Person person: nSet) {
			System.out.println(person.name);
		}
		System.out.println("------------------------------");
		Set<Entry<Person, Integer>> eSet = tMap.entrySet();
		
	}
}
