package inheritances;

import java.util.Scanner;

public class FriendList {
	
	
	
	public static void main(String[] args) {

		// 추가... Scanner 클래스..
		// 1.친구 2.학교친구 3.회사친구 4.전체목록 5.친구이름 검색 6.종료
		Friend[] friends = new Friend[10];
		Scanner scanner = new Scanner(System.in);
		String name;
		String number;
		String major;
		String department;
//		friends[0] = new Friend("김민주", "01012345678");
//		friends[1] = new ComFriend("성다영", "01012123434", "총무부서");
//		friends[2] = new UnivFriend("김다희", "01045456767", "역사학과");

//		for (Friend friend : friends) {
//			if (friend != null) {
//				System.out.println(friend.toString());
//			}

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
				name = scanner.next();
				for (int i = 0; i < friends.length; i++) {
					if (friends[i].name.equals(name)) {
						System.out.println(friends[i].toString());
						break;
					} else {
						System.out.println("저장된 이름이 없습니다.");
						break;
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


//	public static void saveFriend(Friend friend) {
//		for(int i=0; i,friends.lendgth; i++) {
//			if(friends[i] == null) {
	//			friends[i] = friend;
	//			break;
//	}
}
