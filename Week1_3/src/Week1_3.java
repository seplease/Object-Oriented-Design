import java.util.*;
public class Week1_3 {
	public static void main(String[] args) {
		int money500;
		int money100;
		int money50;
		int money10;
		int total = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("500�� ���� ���� : ");
		money500 = sc.nextInt();
		System.out.print("100�� ���� ���� : ");
		money100 = sc.nextInt();
		System.out.print("50�� ���� ���� : ");
		money50 = sc.nextInt();
		System.out.print("10�� ���� ���� : ");
		money10 = sc.nextInt();
		
		total = money500 * 500 + money100 * 100 + money50 * 50 + money10 * 10;
		
		System.out.println("�ݾ��� " + total + "�� �Դϴ�.");
	}
}