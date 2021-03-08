package inheritances;

public class UnivFriend extends Friend {
	String major;
	
	public UnivFriend(String name, String phone, String major) {
		super(name, phone);
		this.major = major;
	}

	
	
	public String getMajor() {
		return major;
	}



	public void setMajor(String major) {
		this.major = major;
	}



	@Override
	public String toString() {
		return "이름 : " + this.getName() + ", 번호 : " + this.getPhone() + ", 전공 : " + getMajor();
	}

}
