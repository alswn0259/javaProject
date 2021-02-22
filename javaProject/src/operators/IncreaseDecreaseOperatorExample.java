package operators;

public class IncreaseDecreaseOperatorExample {

	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		int z;
		System.out.println(x++);
		System.out.println(++x);
		System.out.println("----------");
		z = ++x + y++;
		System.out.println("z: " + z + ",x: " + x + ",y:" + y);
		
		
	}

}
