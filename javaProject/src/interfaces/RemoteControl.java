package interfaces;

public interface RemoteControl {
	//interface에서는 static final 안지정해도 자동으로 지정됨
	static final int MAX_VOLUME = 10; //상수 <-> 변수
	static final int MIN_VOLUME = 0; //상수 <-> 변수
	
	void turnOn(); //추상메소드(구현x)
	void turnOff();
	void setVolume(int volume);
	}
	
