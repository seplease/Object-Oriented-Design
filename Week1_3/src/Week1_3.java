import java.util.*;
public class Week1_3 {
	public static void main(String[] args) {
		int money500;
		int money100;
		int money50;
		int money10;
		int total = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("500원 동전 개수 : ");
		money500 = sc.nextInt();
		System.out.print("100원 동전 개수 : ");
		money100 = sc.nextInt();
		System.out.print("50원 동전 개수 : ");
		money50 = sc.nextInt();
		System.out.print("10원 동전 개수 : ");
		money10 = sc.nextInt();
		
		total = money500 * 500 + money100 * 100 + money50 * 50 + money10 * 10;
		
		System.out.println("금액은 " + total + "원 입니다.");
	}
}