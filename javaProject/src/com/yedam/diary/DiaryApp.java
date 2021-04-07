package com.yedam.diary;

import java.util.List;

public class DiaryApp {
		DAO dao;
		
		public void start() {
//			dao = new DiaryListDAO(); //파일입출력
			dao = new DiaryOracleDAO(); //DB용 입출력

			int menuNum = 0; //do while 한번은 식행되는데 여기 0을 담아줌으로 한번만 실행하고 끝
			
			do {
				menuPrint();
				menuNum = menuChoose(); 
				
				process(menuNum);
				} while (menuNum != 0);
			System.out.println("end");
		}
		//메뉴출력
		private void menuPrint() {
			Menu[] arr = Menu.values(); //value() : 열거타입의 모든 열거객체들을 배열로 만들어 리턴
			int i = 0;
			for(Menu menu : arr) { //루핑돌면서 메뉴에 담음
				System.out.print(String.format("%d:%s ", i, menu.name()));
				i++;
			}
			System.out.println();
			
		}
		//메뉴선택
		public int menuChoose() {
			int menuSize = Menu.values().length -1 ;
			int menuNum;
			do {
				menuNum = StdInputUtil.readInt();
				if(menuNum <= menuSize) {
				break;
				}
				System.out.println(menuSize + "까지만 입력이 가능합니다.");
			} while (true);
			return menuNum;
		}
		
		//메뉴실행
		public void process(int menuNum) {
			Menu menu = Menu.getMenu(menuNum);
			switch(menu) {
			case 종료: exit(); break;
			case 추가: insert(); break;
			case 수정: update(); break;
			case 삭제: delete(); break;
			case 전체조회: selectAll(); break;
			case 날짜검색: selectDate(); break;
			case 내용검색: selectContent(); break;

			}	
		}
		//종료
		public void exit() {
			System.out.println("종료선택>>");
		}
		
		// 입력
		public void insert() {
			System.out.println("입력선택>>");
			System.out.println("날짜:[yyMMdd]");
			String wdate = StdInputUtil.readDate();
			System.out.println("내용:");
			String contents = StdInputUtil.readMultiLine();
			
			DiaryVO vo = new DiaryVO();
			vo.setWdate(wdate);
			vo.setContents(contents);
			int cnt = dao.insert(vo);
			System.out.println(cnt + "건 입력완료.");
		}
		// 수정
		public void update() {
			System.out.println("수정선택>>");
			System.out.println("날짜:[yyMMdd]");
			String wdate = StdInputUtil.readDate();
			System.out.println("내용:");
			String contents = StdInputUtil.readMultiLine();
			
			DiaryVO vo = new DiaryVO();
			vo.setWdate(wdate);
			vo.setContents(contents);
			dao.update(vo);
			System.out.println("수정완료.");
			
			
		}
		// 삭제
		public void delete() {
			System.out.println("삭제선택>>");
			System.out.println("날짜:[yyMMdd]");
			String wdate = StdInputUtil.readDate();
			int r = dao.delete(wdate);
			System.out.println(r + "건 삭제됨.");
		}
		// 전체조회
		public void selectAll() {
			System.out.println("전체조회>>");
			for(DiaryVO vo : dao.selectAll()) {
				print(vo);
			}
		}
		//날짜로 검색
		public void selectDate() {
			System.out.println("날짜검색>>");
			System.out.println("날짜:[yyMMdd]");
			String wdate = StdInputUtil.readDate();
			DiaryVO vo = dao.selectDate(wdate); 
			print(vo);
			}
		
		//내용 검색
		public void selectContent() {
			System.out.println("내용검색>>");
			String wcon = StdInputUtil.readWord();
			List<DiaryVO> vo = dao.selectContent(wcon);
			for(DiaryVO co : vo) {
				print(co);
			}
			
			
		}
		//내용 깔끔하게 나오게 하기 위해 만듦.
		public void print(DiaryVO vo) {
			System.out.println("날짜는 : " + vo.getWdate());
			System.out.println("내용은 : " + vo.getContents());
			System.out.println("------------------------------");
		}
		
		
		
}