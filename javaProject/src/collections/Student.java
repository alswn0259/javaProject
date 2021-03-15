package collections;

public class Student {
	private int sno;
	private String name;
	
	public Student(int sno, String name) {
		super();
		this.sno = sno;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [sno=" + sno + ", name=" + name + "]";
	}

	@Override
	public int hashCode() {
		return this.sno + this.name.hashCode(); //name은 String. String의 hashcode매소드 쓰는거
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
		Student s = (Student) obj;
		return this.sno == s.sno && this.name.equals(s.name);
		}
		return false;
	}
	
	
	
}
