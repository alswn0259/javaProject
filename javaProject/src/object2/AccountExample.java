package object2;

public class AccountExample {
	public static void main(String[] args) {
		Account1 account = new Account1();
		
		account.setBalance(10000);
		System.out.println("현재 잔고: " + account.getBalance());
		
		account.setBalance(-100);
		System.out.println("현재 잔고: " + account.getBalance());
		
		account.setBalance(2000000);
		System.out.println("현재 잔고: " + account.getBalance());
		
		account.setBalance(30000);
		System.out.println("현재 잔고: " + account.getBalance());
	}
}