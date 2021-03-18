package test0318;

public class Student {
	String name;
	int engScore;
	int mathScore;
	
	
	
	public Student(String name, int engScore, int mathScore) {
		super();
		this.name = name;
		this.engScore = engScore;
		this.mathScore = mathScore;
	}
	
	public String getName() {
		return name;
	}
	public int getEngScore() {
		return engScore;
	}
	public int getMathScore() {
		return mathScore;
	}

	@Override
	public String toString() {
		return "이름: " + name + ", 영어점수: " + engScore + ", 수학점수: " + mathScore;
	}
	
	
	
}
