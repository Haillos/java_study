package study.Practice.Practice1219;

public class Account {
	private String owner;
	private long balance;

	public Account() {
		owner = null;
		balance = 0;
	}

// ------------------------------------------
	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public long getBalance() {
		return balance;
	}

	public void setBalance(long balance) {
		this.balance = balance;
	}

//------------------------------------------
	public Account(String owner) {
		this.owner = owner;
	}

	public Account(long balance) {
		this.balance = balance;
	}

	public Account(String owner, long balance) {
		this.owner = owner;
		this.balance = balance;
	}

// ------------------------------------------
	public long deposit(long amount) {
		balance = balance + amount;
		return amount;
	}

	public long withdraw(long amount) {
//		if (balance >= amount && amount >= 1) {
//			balance = balance - amount;
//			return amount;
//		} else {
//			return 00000000;
//		}
		if (amount > balance) { // 출금 불가
			System.out.println("잔액이 부족합니다.");
			return 0;
//			System.out.println("잔액 부족, 남은 잔액 모두 출금");
//			amount = balance;
//			balance = 0;
//			return amount;
		}

		balance -= amount;

		return amount;
	}
// ------------------------------------------

	public static void main(String[] args) {
		Account acc1 = new Account(1000);
		acc1.deposit(30);
		System.out.println(acc1.deposit(20) + "원 입금");
		acc1.withdraw(60);
		acc1.withdraw(120);
		acc1.deposit(50);
		System.out.println("잔금 : " + acc1.balance);
	}

}
