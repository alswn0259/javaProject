package generics;

import java.text.DecimalFormat;

public class Morning {
	public static void main(String[] args) {
		sum("123456","789456");
		
		checkGender("123456-1789999");
		checkGender("1234561789999");

	}
	
	public static void sum(String a, String b) {
		int value1 = Integer.parseInt(a);
		int value2 = Integer.parseInt(b);
		int result = value1 + value2;
		
		DecimalFormat df = new DecimalFormat("#,###");
		System.out.println(df.format(result));
		
	}

	public static void checkGender(String idNum) {
		char gender;
		if (idNum.length() == 14) {
			gender = idNum.charAt(7);
			switch (gender) {
			case '1':
			case '3':
				System.out.println("남자입니다.");
				break;
			case '2':
			case '4':
				System.out.println("여자입니다.");
				break;
			}
		} else if (idNum.length() == 13) {
			gender = idNum.charAt(6);
			switch (gender) {
			case '1':
			case '3':
				System.out.println("남자입니다.");
				break;
			case '2':
			case '4':
				System.out.println("여자입니다.");
				break;
			}
		} else {
			System.out.println("주민번호를 확인하십시오.");
		}
	}
}
