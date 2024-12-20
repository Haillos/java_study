package study.Practice.Practice1219;

public class AccountTest {
	public static void main(String[] args) {
		Account acc2 = new Account(1000);
		acc2.setBalance(1000);
		acc2.withdraw(1100);
		System.out.println("잔액 : " + acc2.getBalance());
	}
}
