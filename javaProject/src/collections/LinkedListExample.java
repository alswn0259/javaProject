package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
	public static void main(String[] args) {
		//처리하는 방식에 따라 걸리는 시간 차이 있음. LinkedList가 더 빠르당~
		List<String> list = new ArrayList<>();
		long startTime, endTime; //실행시간 보려고
		startTime = System.nanoTime(); //현재시간 nono초 단위로 가져옴 
		for(int i=0; i<100000; i++) {
			list.add(0,String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("걸린시간: "+(endTime - startTime));
		
		list = new LinkedList<>();
		startTime = System.nanoTime(); //현재시간 nono초 단위로 가져옴 
		for(int i=0; i<100000; i++) {
			list.add(0,String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("걸린시간: "+(endTime - startTime));
	}
}
