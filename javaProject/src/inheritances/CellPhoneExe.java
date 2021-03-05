package inheritances;

public class CellPhoneExe {

	public static void main(String[] args) {
		CellPhone cp = new CellPhone();
//			cp = (CellPhone) new DmbPhone();
//			cp = (CellPhone) new SmartPhone();
		cp.color = "";

		if (cp instanceof DmbPhone) {

			DmbPhone dp = (DmbPhone) cp; // 강제 형변환 해줘야함. 부모가 자식에게 상속되려면! 이제 자식메소드 사용가능
			dp.model = "";
			dp.color = "";
			dp.channel = 15;
			dp.powerOn();
		} else {
			System.out.println("Casting 할 수 없습니다.");
			cp = new DmbPhone();
			cp.powerOn();
			
			cp = new SmartPhone();
			cp.powerOn();
		}
		
		//위에 호출코드 같지만 다른거 출력 -> 다형성
		//
	}
}
