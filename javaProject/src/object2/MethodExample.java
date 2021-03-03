package object2;

import objects.Student;

public class MethodExample {
	public static void main(String[] args) {
		
		for(int i=0; i<args.length; i++) {
			System.out.println("매개값[" + i + "]: " + args[i]);
		}
		
		Calculator cal = new Calculator(); //기본생성자 자동으로 만들어짐
		double result = cal.getArea(3.5);
		System.out.println(result);
		Calculator.getRect(4.5, 2); //메소드에 static 키워드 있어서 객체 안만들고 바로 사용
		
		
		Book b1 = new Book("","","",100);//같은 package안에 있어서 import 필요 없음
		Student s1 = new Student(); //object package의 Student 클래스 import 함
		s1.run();
		s1.study();
		
	}
	
}
