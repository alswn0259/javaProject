package inheritances;

public class CellPhoneEx {
	public static void main(String[] args) {
		CellPhone cp = new CellPhone();
		cp.model = "Galaxy";
		cp.color = "white";
		cp.powerOn();
		cp.bell();
		cp.powerOff();
		
		cp.equals("");//필드 지정한적 없는데 사용 가능.무언가 상속받고 있다는 것. 
		cp.getClass();//모든 클래스는 object 클래스를 상속받는다.(extends Object가 숨겨진것)
		
		System.out.println("==============================");
		DmbPhone dp = new DmbPhone();
		dp.model = "Motolora";
		dp.color = "Black";
		dp.channel = 10;
		dp.powerOn();
		dp.bell();
		dp.turnOnDmb();
		dp.changeChannel(20);
		dp.turnOffDmb();
		dp.powerOff();
		
		System.out.println("==============================");
		SmartPhone sp = new SmartPhone();
		sp.model = "LGPhone";
		sp.color = "Pink";
		sp.commonMethod();
		System.out.println("==============================");
		
		System.out.println(cp.toString()); //cp 참조변수 toStirng() 생략되있음
		System.out.println(dp);
		System.out.println(sp);
	}
}
