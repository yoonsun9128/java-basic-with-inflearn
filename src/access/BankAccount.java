package access;

public class BankAccount {

	private int balance; //잔고

	//사실 int 초기 값이 0이라서 해당 부분은 없어도 된다.
	public BankAccount() {
		balance = 0;
	}

	public void deposit(int amount) {
		if (isAmountValid(amount)) {
			balance += amount;
		} else {
			System.out.println("유효하지 않은 금액입니다.");
		}
	}

	public void withdraw(int amount) {
		if (isAmountValid(amount) && balance - amount >= 0) {
			balance -= amount;
		} else {
			System.out.println("유효하지 않은 금액 또는 잔액이 부족합니다.");
		}
	}

	public int getBalance() {
		return balance;
	}

	//내부에서 사용할꺼라서 private으로 설정
	private boolean isAmountValid(int amount) {
		return amount > 0;
	}
}
