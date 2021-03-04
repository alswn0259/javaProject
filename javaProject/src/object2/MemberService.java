package object2;

public class MemberService {
	

	public boolean login(String id, String password) {
		boolean result = false;
		String id1 = "hong";
		String password1 = "12345";
		if (id.equals(id1) && password.equals(password1) ) {
		result = true;
	}
		return result;
	}
	
	public void logout(String id) {
		System.out.println("로그아웃 되었습니다.");
	}
}
