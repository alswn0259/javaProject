package hr;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;// 테이블 열정보
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
//statement는 sql 질의문장을 string 객체를 전달

public class EmpDAO {
	Connection conn = null;
//	1)파일읽어오는 방법으로 
	public EmpDAO() {
		String path = "config/database.properties";
		Properties prop = new Properties();
		FileReader fr = null;
		try {
			fr = new FileReader(path);
			prop.load(fr);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		String url = prop.getProperty("url");
		String user = prop.getProperty("user");
		String passwd = prop.getProperty("pass");
		
//		2)경로 적어준 방법
//		String url = "jdbc:oracle:thin:@localhost:1521:xe";
//		String user = "hr";
//		String passwd = "hr";
		conn = DBUtil.getConnection(url, user, passwd);
	}
	
	public Map<String, String> getJobList() {
		String sql = "select * from jobs";
		Statement stmt = null;
		ResultSet rs = null;
		Map<String, String> map = new HashMap<>();
			
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
			map.put(rs.getString("job_id"), rs.getString("job_title"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBUtil.close(rs, stmt, conn);
		}
		
		return map;
	}
	
	public Department[] deptList() {
		PreparedStatement psmt = null;
		ResultSet rs = null;
		String sql = "select * from departments";
		Department[] departments = new Department[100];
		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			int i = 0;
			while (rs.next()) {
				Department dep = new Department();
				dep.setDepartmentId(rs.getInt("department_id"));
				dep.setDepartmentName(rs.getString("department_name"));
				dep.setManagerId(rs.getInt("manager_id"));
				dep.setLocationId(rs.getInt("location_id"));
				departments[i++] = dep;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBUtil.close(rs, psmt, conn);
		}
		System.out.println("메소드 호출 완료.");
		return departments;
	}
	//배열로 했던거를 Set으로 해보기
	public Set<Employee> getEmps() {
		String sql = "select * from emp_java";
		Set<Employee> list = new HashSet<>();
		Statement stmt = null;
		ResultSet rs = null;
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				Employee emp = new Employee();
				emp.setEmployeeId(rs.getInt("employee_id"));
				emp.setFirstName(rs.getString("first_name"));
				emp.setLastName(rs.getString("last_name"));
				emp.setJobId(rs.getString("job_id"));
				emp.setSalary(rs.getInt("Salary"));
				list.add(emp);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBUtil.close(rs, stmt, conn);
		}
		return list;
	}
	
	//배열로 했던거를 List로 해보기
	public List<Employee> getEmpList() {
		String sql = "select * from emp_java";
		List<Employee> list = new ArrayList<>();
		Statement stmt = null;
		ResultSet rs = null;
	  try {
		stmt = conn.createStatement();
		rs = stmt.executeQuery(sql);
		while (rs.next()) {
			Employee emp = new Employee();
			emp.setEmployeeId(rs.getInt("employee_id"));
			emp.setFirstName(rs.getString("first_name"));
			emp.setLastName(rs.getString("last_name"));
			emp.setSalary(rs.getInt("Salary"));
			list.add(emp);
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} finally {
		DBUtil.close(rs, stmt, conn);
	}
	  return list;
	}
	
	public Employee[] empList() {
		PreparedStatement psmt = null;
		ResultSet rs = null;// 조회한 결과 받아오도록해줌.
		String sql = "select * from emp_java";
		Employee[] employees = new Employee[100];
		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();// 조회한 결과 받아오도록해줌.
			int i = 0;
			while (rs.next()) {
				Employee emp = new Employee();
				emp.setEmail(rs.getString("email"));
				emp.setEmployeeId(rs.getInt("employee_id"));
				emp.setFirstName(rs.getString("first_name"));
				emp.setHireDate(rs.getString("hire_date"));
				emp.setJobId(rs.getString("job_id"));
				emp.setLastName(rs.getString("last_name"));
				emp.setPhoneNumber(rs.getString("Phone_number"));
				emp.setSalary(rs.getInt("salary"));
//				System.out.println(emp.toString());
				employees[i++] = emp;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBUtil.close(rs, psmt, conn);
		}
		System.out.println("메소드 호출 완료.");
		return employees;
	}
}
