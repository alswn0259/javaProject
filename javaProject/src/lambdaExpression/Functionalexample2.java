package lambdaExpression;

@FunctionalInterface //구현해야하는 메소드 하나 밖에 없음 또다른 무언가 정의하면 에러뜸
interface MyFunctionInterface {
	void run(String str);
}
public class Functionalexample2  {
	public static void main(String[] args) {
		MyFunctionInterface mfi =  (str) ->  System.out.println(str + "을 실행합니다."); 
											//interface 호출하면서 run 메소드 실행.
	
		mfi.run("run()");
		mfi.run("call()");
	}
}
