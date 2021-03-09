package boardPkg.model.impl;

import boardPkg.control.BoardDAO;
import boardPkg.model.Board;
import boardPkg.model.Service;

public class ServiceImpl implements Service {

	BoardDAO dao = new BoardDAO();
	
	@Override//전체 목록 가져오는거
	public Board[] getBoardList() {
		return dao.selectBoards();
	}

	@Override//한건 조회
	public Board getBoard(int boardNo) {
		return dao.selectBoard(boardNo);
	}

	@Override
	public void createBoard(Board board) {
		dao.insertBoard(board);
	}

	@Override
	public void modifyBoard(Board board) {
		dao.updateBoard(board);
	}

	@Override
	public void removeBoard(Board board) {
		dao.deleteBoard(board);
	}
	

}
