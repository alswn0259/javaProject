package com.yedam.diary;

import java.util.List;

public interface DAO {
	
	public int insert(DiaryVO vo);
	public void update(DiaryVO vo);
	public int delete(String date);
	public DiaryVO selectDate(String date);
	public List<DiaryVO> selectContent(String content);//동일한 문구의 날 볼수있도록 하는거
	public List<DiaryVO> selectAll();
}
