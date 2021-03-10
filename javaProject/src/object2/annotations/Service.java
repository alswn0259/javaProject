package object2.annotations;

public class Service {
//	@PrintAnnotation() //default 값 그대로 쓰는것
//	String name;
//	
//	@PrintAnnotation("*") //따로 선언안하면 value 값에다가 지정하겠다는 의미
//	public void method1() {
//	}
//	@PrintAnnotation(value = "*", number = 20)
//	public void method2() {
//	}
	
	@PrintAnnotation
	public void method1() {
		System.out.println("실행 내용1");
	}
	@PrintAnnotation("*") 
	public void method2() {
		System.out.println("실행 내용2");
	}
	@PrintAnnotation(value="#", number=20)
	public void method3() {
		System.out.println("실행 내용3");
	}
}
