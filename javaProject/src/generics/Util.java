package generics;

public class Util {
	public static <K, V> boolean compare(Pair<K,V> p1, Pair<K,V> p2) {
		boolean keyCompare = p1.getKey().equals(p2.getKey());
		boolean valueCompare = p1.getValue().equals(p2.getValue());
		return keyCompare && valueCompare;
	}
	
	//메소드 오버로딩 이름 같은거 쓸 수 있지만 매개 값이 다르다.
	public static <T extends Number> int compare(T t1, T t2) {
		double v1 = t1.doubleValue();//doubleValue()는 Number를 상속받는 클래스에서만 가능하다!! 
		double v2 = t2.doubleValue();
		return Double.compare(v1,v2); //Double.compare(v1, v2) 매개값 비교하는거 
	}
}
