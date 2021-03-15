package lambdaExpression;
interface MyFunctionalInterface {
	void run();
}

class MyFunctionClass implements MyFunctionalInterface{

	@Override
	public void run() {
		System.out.println("run을 실행합니다.");
	}
	
}
public class FunctionalExample {
	public static void main(String[] args) {
//		MyFunctionalInterface mif = new MyFunctionClass();//자식 클래스가 선언됨
		MyFunctionalInterface mif = new MyFunctionalInterface() {//위에 처럼 하면 매번 선언해야함 익명의 객체로 해서 하자!
																//interface 호출하면서 run 메소드 실행.

			@Override
			public void run() {
				System.out.println("run()를 실행합니다.");
			} 
		};
		mif.run();
		
		mif =  () -> {  //익명의 구현객체!! 간단해짐. 이것을 람다 표현식이라함 p.680
				System.out.println("run() 메소드를 실행합니다!!!!!");
			};
		mif.run();
		
		
		}
	}

