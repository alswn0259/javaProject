package api;

import java.util.Arrays;

public class Member implements Cloneable {
//	public String id;
//	
//	public Member(String id) {
//		this.id = id;
//	}
//	
//	public boolean equals(Object obj) {
//		if(obj instanceof Member) {
//			Member member = (Member) obj;
//				if(id.equals(member.id)) {
//					return true;
//				}
//		}
//		return false;
//	}
	
	//얕은 복제
//	public String id;
//	public String name;
//	public String password;
//	public int age;
//	public boolean adult;
//	
//	public Member(String id, String name, String password, int age, boolean adult) {
//		this.id = id;
//		this.name = name;
//		this.password = password;
//		this.age = age;
//		this.adult = adult;
//	}
//	
//	public Member getMember() {
//		Member cloned = null;
//		try {
//			cloned = (Member) clone();
//		} catch (CloneNotSupportedException e) { }
//		return cloned;
//		}
	
	//깊은 복제
	public String name;
	public int age;
	public int[] scores;
	public Car car;
	
	public Member(String name, int age, int[] scores, Car car) {
		this.name = name;
		this.age = age;
		this.scores = scores;
		this.car = car;
	}
	
	protected Object clone() throws CloneNotSupportedException {
		Member cloned = (Member) super.clone();
		cloned.scores = Arrays.copyOf(this.scores, this.scores.length);
		cloned.car = new Car(this.car.model);
		return cloned;
	}
	
	public Member getMember() {
		Member cloned = null;
		try {
			cloned = (Member) clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return cloned;
		}
}
	

