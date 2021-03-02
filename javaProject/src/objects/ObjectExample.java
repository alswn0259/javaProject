package objects;

public class ObjectExample {
	public static void main(String[] args) {
		Student student = new Student();
		student.studentNo = "s12345";
		student.grade = 2;
		student.eng = 80;
		student.math = 85;
		student.study();
		student.introduce();
		
		Student student1 = new Student();
		student.studentNo = "s23456";
		student.grade = 3;
		student.eng = 76;
		student.math = 88;
		student.study();
		student.run();
		student.introduce();
		
		Student student2 = new Student(4, 70, 80);
		student2.studentNo = "s23459";
		student2.study();
		student2.run();
		student2.introduce();
	}
}
