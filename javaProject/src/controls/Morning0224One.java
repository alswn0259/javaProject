package controls;

public class Morning0224One {
	public static void main(String[] args) {
		getAverage(20,30);
		for (int i=1; i<=100; i++) {
			int eng =  (int) (Math.random() * 100); 
			int math =  (int) (Math.random() * 100); 
			System.out.println(i + ". 영어 점수 : " + eng + " 수학 점수 : " + math);	
			System.out.println("이번학기 점수는 " + getAverage(eng, math) + " 입니다.");
		}
		
	}

	public static String getAverage(int n1, int n2) {
		double average = (double) (n1 + n2) / 2;
		String score = "수";
		if (average >= 90) {
			score = "수";
		} else if (average >= 80) {
			score = "우";
		} else if (average >= 70) {
			score = "미";
		} else {
			score = "가";
		}
		return score;
	}

}
