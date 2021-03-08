package abstractClasses;

public class Bird extends Animal {

	public Bird(String species) {
		super(species);
	}
	@Override //추상매소드 반드시 지정
	public void sound() {
		System.out.println("짹짹");
	}
	
	

}
