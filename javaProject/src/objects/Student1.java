package objects;

public class Student1 {
	private String name;
	int eng;
	int math;
	int sum;
	
	Student1() {
		
	}
	
	Student1(String name, int eng, int math) {
		this.name = name;
		this.eng = eng;
		this.math = math;
	}
	void showInfo() {
		sum = eng + math; 
		System.out.println(name + " - " + eng + " - " + math + " - " + sum );
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void setEng(int eng) {
		if (eng < 0) {
			this.eng = 0;
		} else {
			this.eng = eng;
		}
	}
	
	public void setMath(int math) {
		if (math < 0) {
			this.eng = 0;
		} else {
			this.math = math;
		}
	}
}
