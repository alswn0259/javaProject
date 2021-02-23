package controls;

public class SwitchExample {

	public static void main(String[] args) {
//			int z = (int) (Math.random() * 5) ;
//			System.out.println(z); // 0과 1 사이의 임의의 수.
//	}
		
		String msg = "짝수/홀수";
		int z = (int) (Math.random() * 6) + 1 ;
		switch (z) {
		case 1: 
		case 3: 
		case 5: msg = "홀수"; break;
		case 2: 
		case 4: 
		case 6: msg = "짝수"; break;
		}
		System.out.println(z + ": " + msg );
	}
}
