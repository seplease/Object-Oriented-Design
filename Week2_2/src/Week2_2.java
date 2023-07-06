import java.util.*;

public class Week2_2 {
	public static void main(String[] args) {
		String number = "";
		char gender;
		String choice = "";

		do {
			System.out.print("당신의 주민번호를 입력하세요. (012345-1234567) >> ");
			Scanner sc = new Scanner(System.in);
			number = sc.next();

			gender = number.charAt(7);
			if (gender == '1' || gender == '3')
				System.out.println("당신은 남자입니다.");
			else if (gender == '2' || gender == '4')
				System.out.println("당신은 여자입니다.");
			else
				System.out.println("유효하지 않은 주민번호입니다.");

			System.out.print("입력을 계속하겠습니까? (y/n)");
			choice = sc.next();
		} while (!choice.equals("n"));
	}
}