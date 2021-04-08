package com.yedam.diary;

import java.io.Serializable;
import java.sql.Date;

public class DiaryVO implements Serializable{ //Serializable 직렬화 데이터 내부 -> 외부 바이트로 변환해서 저장하거나 함 
	private static final long serialVersionUID = 1L; //이거 값 지정해주면 final로 고정됨. 값 바뀌면 내부 -> 외부, 외부 -> 내부 값 달라지면 에러남. 
	private String wdate;
	private String contents;
	
	public String getWdate() {
		return wdate;
	}
	public void setWdate(String wdate) {
		this.wdate = wdate;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public DiaryVO(String wdate, String contents) {
		super();
		this.wdate = wdate;
		this.contents = contents;
	}
	
	public DiaryVO() {}
	
	@Override
	public String toString() {
		return "DiaryVO [wdate=" + wdate + ", cotents=" + contents + "]";
	}
	
	
	
}
