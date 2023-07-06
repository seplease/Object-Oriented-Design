import java.util.*;

public class BankAccount {
	private int balance = 0;

	public int getBalance() {
		return balance;
	}
	
	public void setBalance(int balance) {
		this.balance = balance;
	}

	void deposit(int n) throws NegativeBalanceException {
		if (n < 0)
			throw new NegativeBalanceException("���� �Աݾ�");
		else {
			balance += n;
			System.out.println("���� �Ա� ó��=> ����� : " + n + ", �ܾ� : " + balance);
		}
	}

	void withdraw(int n) throws NegativeBalanceException {
		if (n > balance)
			throw new NegativeBalanceException("�ܰ� ����");
		else if (n < 0)
			throw new NegativeBalanceException("�߸��� �ݾ�");
		else {
			balance -= n;
			System.out.println("���� ��� ó��=> ����� : " + n + ", �ܾ� : " + balance);
		}
	}
}