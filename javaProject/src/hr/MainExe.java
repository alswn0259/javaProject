package hr;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MainExe {
	public static void main(String[] args) {
		EmpDAO dao = new EmpDAO();
		Map<String, String> map = dao.getJobList();

		Set<String> set = map.keySet();
		Iterator<String> iter = set.iterator();
		while(iter.hasNext()) {
			String id = iter.next();
			String title = map.get(id);
			System.out.println("job_id: " + id + ", job_title: " + title);
		}
		
//		Set<Entry<String, String>> set = map.entrySet();
//		Iterator<Entry<String, String>> iter = set.iterator();
//		while(iter.hasNext()) {
//			Entry<String, String > ent = iter.next();
//			System.out.println("jobId: " + ent.getKey() + ", jobTitle: " + ent.getValue());
//		}
		
//		Employee[] empList = dao.empList();
//		Set<Employee> set = dao.getEmps();
//		System.out.println("salary가 5000이상인 사원정보>>");
//		for(Employee emp : set) {
//			if(emp != null && emp.getSalary() > 5000) {
//				System.out.println(emp.toString());
//			}
//		}
//	
		
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
