package generics;

import java.util.Arrays;

public class WildCardExample {
	
	public static void registerCourse(Course<?> course) {
		System.out.println(course.getCourseName() + " 수강생: " + Arrays.toString(course.getStudents()));	
	}
	
	public static void registerCourseWorker(Course<? super Worker> course) {
		System.out.println(course.getCourseName() + " 수강생: " + Arrays.toString(course.getStudents()));
	}
	
	public static void registerCoursestudent(Course<? extends Student> course) {//student클래스와 그 하위 클래스를 상속받는거만 오도록
		System.out.println(course.getCourseName() + " 수강생: " + Arrays.toString(course.getStudents()));
	}
	
	public static void main(String[] args) {
		Course<Person> personCourse = new Course<Person>("일반인과정",5);
		personCourse.add(new Person("일반인"));
		personCourse.add(new Worker("직장인"));
		personCourse.add(new Student("학생"));
		personCourse.add(new HighStudent("고등학생"));
		
		Course<Worker> workerCourse = new Course<Worker>("직장인과정", 5);
		workerCourse.add(new Worker("직장인"));
		
		Course<Student> studentCourse = new Course<Student>("학생과정", 5);
		studentCourse.add(new Student("학생"));
		
		Course<HighStudent> highStudentCourse = new Course<HighStudent>("고등학생과정",5);
		highStudentCourse.add(new HighStudent("고등학생"));
	
		registerCourse(personCourse);
		registerCourse(workerCourse);
		registerCourse(studentCourse);
		registerCourse(highStudentCourse);
		System.out.println();
		
		registerCoursestudent(studentCourse);
		registerCoursestudent(highStudentCourse);
//		registerCoursestudent(personCourse);
		System.out.println();
		
		
		registerCourseWorker(personCourse);
		registerCourseWorker(workerCourse);
		
		
		
	}
}
