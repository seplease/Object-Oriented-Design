import java.util.*;

public class BankAccountTest {
	public static void main(String[] args) {
		BankAccount ba = new BankAccount();
		try {
			ba.deposit(100);
			ba.withdraw(100);
			ba.withdraw(100);
		} catch (NegativeBalanceException e) {
			e.printStackTrace();
		}
	}
}