package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class Fruit {
	int price;
	Fruit(int price) {
		this.price = price;
	}
	@Override
	public int hashCode() {
		return price;//비교대상
	}
	@Override
	public boolean equals(Object obj) {
		 Fruit f = (Fruit) obj;
		return this.price == f.price;//가격같으면 같은걸로 하겠음
	}
	
}

public class HashSetExample {
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		set.add(100);
		set.add(200);
		set.add(300);
		set.add(100);
		Iterator<Integer> iter = set.iterator(); //반복된요소 잡아와서 끄집어 내는거. 인덱스 잡는게 안됨 이건.그래서 반복으로함
		while(iter.hasNext()) {
			Integer result = iter.next();
			System.out.println(result);
		}
		
		Set<Fruit> fSet = new HashSet<>();
		fSet.add(new Fruit(1000));
		fSet.add(new Fruit(2000));
		fSet.add(new Fruit(3000));
		fSet.add(new Fruit(1000));
//		위에 클래스에서 해쉬코드 이퀄 수정안해주면 같은 가격 다른값으로 인식함
		
		Iterator<Fruit> fIter = fSet.iterator();
		for(;fIter.hasNext();) {
			Fruit f = fIter.next();
			System.out.println(f.price);
		} 
		
	}
}
