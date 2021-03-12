package hr;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MainExe {
	public static void main(String[] args) {
		EmpDAO dao = new EmpDAO();
//		Employee[] empList = dao.empList();
		Set<Employee> set = dao.getEmps();
		System.out.println("salary가 5000이상인 사원정보>>");
		for(Employee emp : set) {
			if(emp != null && emp.getSalary() > 5000) {
				System.out.println(emp.toString());
			}
		}
	
		
//		EmpDAO dao = new EmpDAO();
//		Department[] deptList = dao.deptList();
//		List<Employee> empList = dao.getEmpList();
//		System.out.println("부서번호가 10이상인 부서정보>>");
//		for(Employee emp : empList) {
//			if(emp != null && emp.getSalary() >= 5000) {
//				System.out.println(emp.toString());
//			}
//		}
	}
}
