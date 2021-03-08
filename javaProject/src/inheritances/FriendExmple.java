package inheritances;

import java.util.Scanner;

public class FriendExmple {
	public static void main(String[] args) {

		// Friend 클래스에서 필드 private인 경우
		Friend[] friends = new Friend[10];
		Scanner scanner = new Scanner(System.in);
		String name;
		String number;
		String major;
		String department;

		while (true) {
			System.out.println("---------------------------------------------------------");
			System.out.println("1.친구 | 2.학교친구 | 3.회사친구 | 4.전체목록 | 5.친구이름 | 6.종료");
			System.out.println("---------------------------------------------------------");
			System.out.print("선택> ");

			int selectNo = scanner.nextInt();

			if (selectNo == 1) {
				for (int i = 0; i < friends.length; i++) {
					if (friends[i] == null) {
						System.out.print("이름> ");
						name = scanner.next();
						System.out.print("번호> ");
						number = scanner.next();
						friends[i] = new Friend(name, number);
						break;
					}
				}

			} else if (selectNo == 2) {
				for (int i = 0; i < friends.length; i++) {
					if (friends[i] == null) {
						System.out.print("이름> ");
						name = scanner.next();
						System.out.print("번호> ");
						number = scanner.next();
						System.out.print("전공> ");
						major = scanner.next();
						friends[i] = new UnivFriend(name, number, major);
						break;
					}
				}
			} else if (selectNo == 3) {
				for (int i = 0; i < friends.length; i++) {
					if (friends[i] == null) {
						System.out.print("이름> ");
						name = scanner.next();
						System.out.print("번호> ");
						number = scanner.next();
						System.out.print("부서> ");
						department = scanner.next();
						friends[i] = new ComFriend(name, number, department);
						break;
					}
				}
			} else if (selectNo == 4) {
				for (Friend friend : friends) {
					if (friend != null) {
						System.out.println(friend.toString());
					}
				}

			} else if (selectNo == 5) {
				System.out.print("이름 검색> ");
				String name1 = scanner.next();
				for (int i = 0; i < friends.length; i++) {
					if (friends[i] != null && name1.equals(friends[i].getName())) {
						System.out.println(friends[i].toString());
						
					} 
					
				}

			} else if (selectNo == 6) {
				System.out.println("프로그램 종료.");
				break;

			} else {
				System.out.println("잘 못 입력하셨습니다. 다시 입력해 주십시오.");
				continue;
			}

		}

	}
}
