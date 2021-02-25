package references;

public class ArrayExample1 {

	public static void main(String[] args) {
		int[] intArys = new int[5];
			for(int i=0; i < intArys.length; i++) {
				intArys[i] = (int) (Math.random() * 10) + 1;
				System.out.println(intArys[i]);
			}
		int maxValue = 0;
		for(int i=0; i< intArys.length; i++) {
			maxValue = (intArys[i] > maxValue) ? intArys[i] : maxValue;
		}
		System.out.println("가장 큰 값 : " + maxValue);
			}
	}

