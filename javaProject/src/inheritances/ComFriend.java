package inheritances;

public class ComFriend extends Friend {
	String department;

	public ComFriend(String name, String phone, String department) {
		super(name, phone);
		this.department = department;
	}
	
	

	public String getDepartment() {
		return department;
	}



	public void setDepartment(String department) {
		this.department = department;
	}



	@Override
	public String toString() {
		return "이름 : " + this.getName() + ", 번호 : " + this.getPhone() + ", 부서 : " + getDepartment() ;
	}

}
