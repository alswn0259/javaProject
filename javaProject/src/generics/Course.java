package generics;

class Person {
	String name; //필드
	Person(String name) { //생성자
		this.name = name;
	}
	String getName() {//메소드
		return this.name;
	}
	@Override
	public String toString() {
		return   name;
	}
	
	
}
//Person 상속받는 Worker
class Worker extends Person {
	Worker(String name) { //부모클래스의 name. 부모클래스에 기본 생성자 없어서 생성자 없으면 에러남.
		super(name);
	}
}
//Person 상속받는 Student
class Student extends Person {
	Student(String name) {
		super(name);
	}
}
//Person 상속받는 HighStudent
class HighStudent extends Student {
	HighStudent(String name) {
		super(name);
	}
}
//수업과정
public class Course<T> { 
	String courseName;
	T[] students;
	Course(String courseName, int capacity) {
		this.courseName = courseName;
		students = (T[]) new Object[capacity]; //어떤 타입에 대해 배열의 크기만큼 설정하겠다. T하면 에러남.그래서 이처럼 해주기 외우기
	}
	public void add(T t) {
		for(int i=0; i<students.length; i++) {
			if(students[i] == null) {
				students[i] = t;
				break;
			}
		}
	}
	
	public String getCourseName() {
		return this.courseName;
	}
	public T[] getStudents() {
		return this.students;
	}
}
