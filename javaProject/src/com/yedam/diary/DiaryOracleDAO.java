package com.yedam.diary;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;



 class DBUtil {
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static Connection getConnection() {
		Connection conn = null;
		String url ="jdbc:oracle:thin:@localhost:1521:xe";
		String id= "diary";
		String password= "diary";
		try {
			conn = DriverManager.getConnection(url, id, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
}


// 날짜, 내용
// 테이블
// 접속계정 : diary/diary


//구현객체
public class DiaryOracleDAO implements DAO {
	Connection conn = null;
	Statement stmt = null;
	ResultSet rs = null;
	
	String sql = null;
	List<DiaryVO> list;
	

	
	private void close() {
		if(conn != null) {
		try {
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
			}
		} 
		if(stmt != null) {
			try {
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if(rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}


	@Override
	public int insert(DiaryVO vo) {
		conn = DBUtil.getConnection();
		sql = "insert into diary values('" + vo.getWdate() + "' , '"
										+ vo.getContents() + "')";
		try {
			stmt = conn.createStatement();
			stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return 1; 
	}

	@Override
	public void update(DiaryVO vo) {
		conn = DBUtil.getConnection();
		sql = "update diary set dia_content = '" +  vo.getContents()
				+ "' where dia_date = '" + vo.getWdate() + "'";
		try {
			stmt = conn.createStatement();
			stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}	
	}

	@Override
	public int delete(String date) {
		conn = DBUtil.getConnection();
		sql = "delete from diary where dia_date = '" + date + "'";
		try {
			stmt = conn.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close();
		}
		return 1;
	}

	@Override
	public DiaryVO selectDate(String date) {
		conn = DBUtil.getConnection();
		sql = "select * from diary where dia_date = '" + date + "'";
		DiaryVO vo = null;
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			if (rs.next()) {
				vo = new DiaryVO(rs.getString("dia_date"),
								rs.getString("dia_content"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		
		return vo;
	}

	@Override
	public List<DiaryVO> selectContent(String content) {
		conn = DBUtil.getConnection();
		sql = "select * from diary where dia_content like '%" + content + "%'";
		List<DiaryVO> vo = new ArrayList<>();
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				DiaryVO co = new DiaryVO();
				co.setWdate(rs.getString("dia_content"));
				co.setContents(rs.getString("dia_content"));
				
				vo.add(co);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		
		return vo;
	}

	@Override
	public List<DiaryVO> selectAll() {
		conn = DBUtil.getConnection();
		sql = "select * from diary order by dia_date";//날짜문자임
		List<DiaryVO> vo = new ArrayList<>();
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				DiaryVO co = new DiaryVO();
				co.setWdate(rs.getString("dia_date"));
				co.setContents(rs.getString("dia_content"));
				
				vo.add(co);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		
		return vo;
	}
	
}
