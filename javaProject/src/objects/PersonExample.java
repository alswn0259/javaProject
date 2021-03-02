package objects;

public class PersonExample {

	public static void main(String[] args) {
		Person person1 = new Person("공지철", 35, 184.0, 74.0);
		person1.eat();
		person1.sleep();
		person1.walk();
		person1.introduce();
		
		Person person2 = new Person("김민주", 27, 160.0, 48.0);
		person2.eat();
		person2.sleep();
		person2.walk();
		person2.introduce();
		
		
		Person[] persons = new Person[5];
		persons[0] = new Person("홍길동", 15, 175.5, 72.5);
		persons[1] = new Person("김길동", 25, 180.5, 81.3);
		persons[2] = new Person("박길동", 35, 177, 75);
		persons[3] = new Person("최길동", 45, 168, 60);
		persons[4] = new Person("곽길동", 55, 173.2, 65.0);
		
		 for(Person person : persons) {
			 person.introduce();
		 }
	}
		}
