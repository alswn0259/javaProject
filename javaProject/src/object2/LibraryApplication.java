package object2;

import java.util.Scanner;

public class LibraryApplication {

	public static void main(String[] args) {
		Book[] bookList = new Book[10];
		Member user = new Member();
		Scanner scn = new Scanner(System.in);
		
		
		while(true) {
			System.out.println("-----------------------------------------------------");
			System.out.println("1.도서정보등록 2.회원정보등록 3.도서대여 4.도서반납 5.도서목록 9.종료 ");
			System.out.println("-----------------------------------------------------");
			System.out.println("선택> ");
			
			int selectNo = scn.nextInt();
			
			if(selectNo == 1) {
				for (int i=0; i<bookList.length; i++) {
				
				String bookTitle = scn.next();
				String bookAuthor = scn.next();
				String bookPress = scn.next();
				int bookPrice = scn.nextInt();
				bookList[i] = Book(bookTitle,bookAuthor,bookPress,bookPrice);
				}
			} else if(selectNo == 2) {
				
				Member member1 = new Member("1001", "천서진");
				Member member2 = new Member("1002", "오윤희");
				Member member3 = new Member("1003", "주단태");
				Member member4 = new Member("1004", "심수련");
				Member member5 = new Member("1005", "배로나");
				
			} else if(selectNo == 3) {
				
				
				
			} else if(selectNo == 4) {
				
			} else if(selectNo == 5) {
				
			} else {
				break;
			}
			
			
			
		}

	}

}
