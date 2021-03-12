package api;

public class funnyTime {
	public static void main(String[] args) {
		int[] intAry = { 3, 8, 4};
		int[] intAry1 = new int[intAry.length-1];
		int result = 0;
		for(int i=0; i<intAry.length-1; i++) {
			for(int j=0; j<intAry.length-2; j++) {
				if(intAry[i]<intAry[i+1]) {
					intAry[j] = intAry[i];
				} else {
					intAry[j] = intAry[i+1];
				}
				System.out.println(intAry[j]);
			}
		
		}
		
	}
	
}
