package inheritances;

//extends CellPhone 추가 -> 상속받겠다는 의미
public class DmbPhone extends CellPhone {
	// 필드
	int channel;
	// 생성자
	
	// 메소드
	void turnOnDmb() {
		System.out.println("채널: " + channel + "방송을 수신합니다");
	}
	void changeChannel(int channel) {
		this.channel = channel;
		System.out.println("채널: " + channel + "로 변경합니다");
	}
	void turnOffDmb() {
		System.out.println("방송을 종료합니다");
	}
	//부모 클래스가 가지고 있던거 재정의 하는것 overriding
	@Override
	void powerOn() {
		System.out.println("DmbPhone 전원을 켭니다");
	}
	@Override
	void powerOff() {
		System.out.println("DmbPhone 전원을 끕니다");
	}
	
	void bell() {
		System.out.println("DmbPhone 벨이 울립니다");
	}
	@Override
	public String toString() {
		return "CellPhone => model : " + model + ", color : " + color
				+ ", channel : " + channel;
	}
	
	
}
