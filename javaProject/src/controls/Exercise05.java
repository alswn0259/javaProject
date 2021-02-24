package controls;

public class Exercise05 {

	public static void main(String[] args) {
		for(int x=1; x<=10; x++ ) {
			for(int y=1; y<=10; y++) {
				int result = 4*x + 5*y;
				if(result == 60) {
					System.out.println("(" + x + "," + y + ")");
				}
			}
		}
	}

}
