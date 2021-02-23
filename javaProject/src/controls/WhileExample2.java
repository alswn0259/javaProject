package controls;

public class WhileExample2 {

	public static void main(String[] args) {
		
		multiResult(2);
		}
	
	public static void multiResult(int num) {
		int i = 1;
		while (i < 10) {
			System.out.println( num + " * " + i + " = " + (4*i) );
			i++;
		}
	}
}
