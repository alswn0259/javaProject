package objects;

public class Student1Exam {

	public static void main(String[] args) {
		Student1 s1 = new Student1("홍길동", 90, 85);
		Student1 s2 = new Student1("김길동", 88, 85);
		Student1 s3 = new Student1("이길동", 76, 90);
		Student1 s4 = new Student1();
		
		Student1[] student1 = new Student1[4];
		s1 = new Student1("홍길동", 90, 85);
		s2 = new Student1("김길동", 88, 85);
		s3 = new Student1("이길동", 76, 90);
		s4 = new Student1();
		s4.setName("최길동");
		//private로 되어있는 이름.. 해당클래스에서는 적용 가능하지만 다른 클래스에서는 사용 안됨.
		//생성자 앞에 디폴트로 되어 있음. 같은 패키지 안에서는 가능.
		//(수정완료) 새로운 매소드를 만들어줌. setName
		
		for (Student1 student : student1) {
			student.showInfo();
		}

	}

}
