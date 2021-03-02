package objects;

public class Person {
	String name;
	int age;
	double weight;
	double hight;
	
	Person(String name, int age, double weight, double hight) {
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.hight = hight;
	}
	
	void eat() {
		System.out.println("맛있게 먹는다.");
	}
	
	void sleep() {
		System.out.println("꿀잠을 잔다.");
	}
	
	void walk() {
		System.out.println("걷는다.");
	}
	void introduce() {
		System.out.println("소개를 합니다 => 이름은 " + name + "이고 나이는 " + age + "입니다." );
	}

}
