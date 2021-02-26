package references;

import java.util.Calendar;
//프로그램안에서 유니크하게 구분하고 싶을 때
enum Kind {
	MALE, FEMALE;
}
enum Choice {
	YES, NO;
}

public class EnumExample {

	public static void main(String[] args) {
		Week today = null;
		today = Week.SUNDAY;
		//today = "Hello"; 불가능함
		Calendar cal = Calendar.getInstance(); //import 해주어야함.날짜 정보 들어있음
		System.out.println(cal);
		System.out.println("년도 " + cal.get(Calendar.YEAR));
		System.out.println("월 " + cal.get(Calendar.MONTH));
		System.out.println("일 " + cal.get(Calendar.DAY_OF_MONTH));
		System.out.println("요일 " + cal.get(Calendar.DAY_OF_WEEK));

		int week = cal.get(Calendar.DAY_OF_WEEK);
		switch(week) {
		case 1:
			today = Week.SUNDAY; break;
		case 2:
			today = Week.MONDAY; break;
		case 3:
			today = Week.TUESDAY; break;
		case 4:
			today = Week.WEDNESDAY; break;
		case 5:
			today = Week.THURSDAY; break;
		case 6:
			today = Week.FRIDAY; break;
		case 7:
			today = Week.SATURDAY; break;
		}
		
		// Week.SUNDAY 이런식을 써주는 것은 유니크 하게 표현하기 위함
		// if(today == 1 || today == 2) 이거보다 무엇을 말하는지 분명히 볼 수 있음
		if(today == Week.SUNDAY || today == Week.SATURDAY) {
			System.out.println("주말에는 여행을 갑니다.");
		} else {
			System.out.println("주중에는 공부를 합니다.");
		}
		Kind manOfWoman = Kind.FEMALE;
		if(manOfWoman == Kind.MALE) {
			System.out.println("남성입니다.");
		} else if (manOfWoman == Kind.FEMALE) {
			System.out.println("여성입니다.");
		}
	}

}
