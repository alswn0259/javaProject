package com.yedam.diary;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

//구현객체
public class DiaryListDAO implements DAO{
	
	String fileName = "diary.dat";
	String filePath;
	List<DiaryVO> list;
	
	public DiaryListDAO() {
		filePath = System.getProperty("user.home") + "/" + fileName;
		readFile(); //파일 초기화.
	}
	
	//읽어오기
	@SuppressWarnings("unchecked")
	public void readFile() {
		File file = new File(filePath);
		if(!file.exists()) {
			list = new ArrayList<DiaryVO>();
		} else {
			try {
				FileInputStream fis = new FileInputStream(filePath);
				BufferedInputStream bis = new BufferedInputStream(fis);
				ObjectInputStream ois = new ObjectInputStream(bis);
				
				list = (List<DiaryVO>) ois.readObject();
				System.out.println((list != null ? list.size() : 0) + "건 read됨.");
				ois.close();
				
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public void writeFile() {
		try {
			FileOutputStream fos = new FileOutputStream(filePath);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			ObjectOutputStream oos = new ObjectOutputStream(bos);
			
			oos.writeObject(list);
			oos.close();
//			System.out.println("저장됨.");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	@Override
	public int insert(DiaryVO vo) {
		int cnt = list.size();
		int ii = 0;
		//중복날짜 입력불가
		for(int i=0; i<cnt; i++) {
			if(list.get(i).getWdate().equals(vo.getWdate())) {
				return 0;//날짜 똑같은것이 있으면 끝내겠다는 것
			}
			if(list.get(i).getWdate().compareTo(vo.getWdate()) > 0) {
				ii = i;
				break;
			}
		}
		list.add(ii, vo);
		writeFile();
		return 1; 
	}

	@Override
	public void update(DiaryVO vo) {
		int cnt = list.size();
		for(int i=0; i<cnt; i++) {
			if(list.get(i).getWdate().equals(vo.getWdate())) {
				list.set(i,vo); //방법1
//				list.get(i).setContents(vo.getContents()); 방법2 
			}
		}
	}

	@Override
	public int delete(String date) {
		int cnt = list.size();
		for(int i=0; i<cnt; i++) {
			if(list.get(i).getWdate().equals(date)) {
				list.remove(i);
				writeFile();
				return 1;
			}
		}
		return 0;
	}

	@Override
	public DiaryVO selectDate(String date) {
		int cnt = list.size();
		DiaryVO con = null;
		for(int i=0; i<cnt; i++) {
			if(list.get(i).getWdate().equals(date)) {
				con = list.get(i);
			}
			
		}
		return con;
	}

	@Override
	public List<DiaryVO> selectContent(String content) {
		int cnt = list.size();
		List<DiaryVO> vo = new ArrayList<>();
		for(int i=0; i<cnt; i++) {
			if(list.get(i).getContents().indexOf(content) != -1) {
				vo.add(list.get(i));
			}
		}
		return vo;
	}

	@Override
	public List<DiaryVO> selectAll() {
		return list;
	}

	
	}
	

