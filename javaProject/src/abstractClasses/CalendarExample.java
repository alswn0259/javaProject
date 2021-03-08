package abstractClasses;

import java.util.Calendar;

public class CalendarExample {

	public static void main(String[] args) {
		// 달력만들기
		
//		System.out.println(cal.get(Calendar.YEAR));
//		System.out.println(cal.get(Calendar.MONTH));
//		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
//		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
//		System.out.println(cal.getActualMaximum(Calendar.DATE));
//		System.out.println("-----------------------");
//		cal.set(2021,4,1);
//		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
//		
//		System.out.printf("%3d", 9);
//		System.out.printf("%3d", 10);
//		System.out.printf("%5s", "Sun");
//		System.out.printf("%5s", "Monday");
		showCal(2021,3);
		
	}
	public static void showCal(int year, int month) {
		// 해당년월의 달력을 생성해서 보여주는 메소드.
		System.out.println(month + "월");
		month = month-1;
		Calendar cal = Calendar.getInstance();
		cal.set(year,month,1);
		int lastDate = cal.getActualMaximum(Calendar.DATE);
		int firstDay = cal.get(Calendar.DAY_OF_WEEK);
		for (int i=1; i < firstDay; i++) {
			System.out.printf("%3s", " ");
		}
		for (int i=1; i<= lastDate; i++) {
			System.out.printf("%3d", i);
			if ((firstDay + i -1)%7 == 0) {
					System.out.println();
				}
			}
		
	}

}
