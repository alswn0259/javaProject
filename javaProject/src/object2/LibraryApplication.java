package object2;

import java.util.Scanner;

public class LibraryApplication {

	public static void main(String[] args) {
		Book[] bookList = new Book[10];
		Member user = new Member();

		Scanner scn = new Scanner(System.in);

		while (true) {
			System.out.println("-----------------------------------------------------");
			System.out.println("1.도서정보등록 2.회원정보등록 3.도서대여 4.도서반납 5.도서목록 9.종료 ");
			System.out.println("-----------------------------------------------------");
			System.out.print("선택> ");

			int selectNo = scn.nextInt();

			if (selectNo == 1) {
				for (int i = 0; i < bookList.length; i++) {
					if (bookList[i] == null) {
						System.out.print("제목> ");
						String bookTitle = scn.next();
						System.out.print("저자> ");
						String bookAuthor = scn.next();
						System.out.print("출판사> ");
						String bookPress = scn.next();
						System.out.print("가격> ");
						int bookPrice = scn.nextInt();

						bookList[i] = new Book(bookTitle, bookAuthor, bookPress, bookPrice);
						break;
					}
				}
			} else if (selectNo == 2) {

				System.out.print("회원ID> ");
				String id = scn.next();
				System.out.print("이름> ");
				String name = scn.next();
				user = new Member(id, name);

			} else if (selectNo == 3) {

				for (int i = 0; i < bookList.length; i++) {
					if (bookList[i] != null) {
						System.out.print(bookList[i].getBookTitle() + " / ");
					}
				}
				System.out.println();
				System.out.print("대여할 책> ");
				String title = scn.next();

				for (int i = 0; i < bookList.length; i++) {
					if (bookList[i] != null && bookList[i].getBookTitle().equals(title)) {
						user.rent(bookList[i]);
					}
				}
			} else if (selectNo == 4) {
				System.out.print("반납할 책>");
				String title = scn.next();
				for (int i = 0; i < bookList.length; i++) {
					if (bookList[i] != null && title.equals(bookList[i].getBookTitle())) {
						user.overdue(bookList[i]);
					}
				}
			} else if (selectNo == 5) {

				user.getBookInfo();

			} else {
				break;	
			}
		}
		 System.out.println("프로그램 종료.");

	}

}
