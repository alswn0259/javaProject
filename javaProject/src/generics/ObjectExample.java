package generics;

public class ObjectExample {

	public static void main(String[] args) {
		Apple one = new Apple(1000,"홍옥");
		Apple two = new Apple(1000,"홍옥");
		System.out.println(one);
		System.out.println(two);
		
		if(one.equals(two)) {
			System.out.println("동일객체");
		} else {
			System.out.println("다른객체");
		}
	}
}
