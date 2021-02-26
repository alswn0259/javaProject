package references;

public class EnumExample2 {

enum Animal {
	DOG, CAT;
}
enum Person {
	MAN, WOMAN;
}
	public static void main(String[] args) {
		who(Person.MAN);
		//who(Animal.DOG);
	}
	public static void who(Person person) {
		switch (person) {
		case MAN:
			System.out.println("남성입니다.");
			break;
		case WOMAN:
			System.out.println("여성입니다.");
			break;
		}
	}

}
