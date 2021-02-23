package controls;

public class IfElseExample {

	public static void main(String[] args) {
		String grade = "F";
		int score = 97;

		// if구문 사용하여 90점이상 -> A
		// 80점이상 -> B
		// 70점이상 -> C
		// 그 외에는 -> F

		// 점수 85는 B입니다.
		
		//switch문으로 만들어보기!!
		switch (score / 10) {
			case 9:
				grade = "A"; break;
			case 8:
				grade = "B"; break;
			case 7:
				grade = "C"; break;
			default:
				grade = "F";
		}
		
		//if문으로 만들어보기!!
		if (score >= 90) {
			if (score >= 95) {
				grade = "A+";
			} else {
				grade = "A";
			}
		} else if (score >= 80) {
			if (score >= 85) {
				grade = "B+";
			} else {
				grade = "B";
			}
		} else if (score >= 70) {
			if (score >= 75) {
				grade = "C+";
			} else {
				grade = "C";
			}
		} else {
			grade = "F";
		}
		System.out.println("점수 " + score + "는 " + grade + "입니다.");
	}
}
