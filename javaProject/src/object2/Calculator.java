package object2;

public class Calculator {
	double pi = 3.14;
	
	public double getArea(double radius) {
		double result = pi * radius * radius;
		return result;
	}
	
	public static double getRect(double d1, double d2) {
		//static 키워드 붙으면 메소드 영역에 getRect가 실행준비가 되어 new 개체 생성 안해도됨
		double result = d1 * d2;
		return result;
	}
}
