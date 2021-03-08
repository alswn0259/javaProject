package interfaces;

public class RemoteControlExe {

	public static void main(String[] args) {
		RemoteControl rc = new Television(); //구현관계에 있는 인터페이스를 담을 수 있음.
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();
		
		rc = new Audio();
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();
		
		 //익명구현객체(이번에만 쓰려고하는거)
		rc = new RemoteControl() {

			private int volume;
			
			@Override
			public void turnOn() {
				System.out.println("DVD를 켭니다.");
			}

			@Override
			public void turnOff() {
				System.out.println("DVD를 끕니다.");
			}

			@Override
			public void setVolume(int volume) {
				this.volume = volume;
				System.out.println("DVD볼륨 " + volume);
			}	
		};
		rc.turnOn();
		rc.setVolume(8);
		rc.turnOff();
	}
}

