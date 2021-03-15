package hr;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class MainExe2 {
	public static void main(String[] args) {
		//*급여 기준으로 정렬
		//compareTo 가서 리턴을 o.salary - this.salary
		EmpDAO dao = new EmpDAO();
		Set<Employee> set = dao.getEmps(); //전체리스트 Set 저장
		TreeSet<Employee> tset = new TreeSet<Employee>();//salary 기준으로 정렬해서 넣을것
		
		Iterator<Employee> iter = set.iterator();
		while(iter.hasNext()) { //데이터베이스에서 가져온거 정렬해서 담는 과정
			tset.add(iter.next());
		}
		
		iter = tset.iterator();
		while(iter.hasNext()) { //루핑해서 출력해주기
			System.out.println(iter.next());
		}
	}
}
