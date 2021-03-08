package abstractClasses;

public abstract class Animal {
	String species;
	
	public Animal() {
		
	}
	
	public Animal(String species) {
		this.species = species;
	}
	
	public void showInfo() {
		System.out.println("종류는 " + this.species + "입니다.");
	}
	
	public void breathe() {
		System.out.println("숨을 쉰다.");
	}
	
	public abstract void sound(); //추상메소드 기능이 없이 이름만 지정. 상속 메소드에서 메소드 기능 정해줘야함.안해주면 에러.
}
