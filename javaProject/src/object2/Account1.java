package object2;

public class Account1 {
	private int balance;
	int MIN_BALANCE = 0;
	int MAX_BALANCE = 100000;

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		if (balance >= MIN_BALANCE && balance <= MAX_BALANCE) {
			this.balance = balance;
		}
	}
}
