package references;

public class Morning0226 {

	public static void main(String[] args) {

		// morning0226 메소드를 활용하여 출력하기
//		morning0226(new int[] {60,70,82}, new int[] {50,40,90});
	
		// 이름 => 점수 의 형태로 출력해보기.
		String[] names = { "임성원", "정준영", "도왕락"};
		int[] scores = { 88,89,90 };
		
		for(int i=0; i<names.length; i++) {
			System.out.println(names[i] + "의 점수 => " + scores[i]);
				
			}
		
			//name 이라는 변수에 names에 있는 배열을 for문을 이용하여 순차적으로 넣음
			for(String name : names) {
				System.out.println(name);
			}
			for(int score : scores) {
				System.out.println(score);
		}
	}
	
	public static void morning0226(int[] engScores, int[] mathScores) {
	int sumEng =0;
	int sumMath = 0;
	double avgEng = 0;
	double avgMath = 0;
	for(int i=0; i<engScores.length; i++) {
		sumEng += engScores[i];
		sumMath += mathScores[i];
	}
	avgEng = (double) sumEng / engScores.length;
	avgMath = (double) sumMath / mathScores.length;
	System.out.println(avgEng + "," + avgMath);

//	int[] engScores = new int[3];
//	engScores = new int[] { 90, 88, 87 };
//	int[] mathScores = new int[3];
//	mathScores = new int[] { 60, 80, 50 };
//	
	}

}
