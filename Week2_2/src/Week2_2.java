import java.util.*;

public class Week2_2 {
	public static void main(String[] args) {
		String number = "";
		char gender;
		String choice = "";

		do {
			System.out.print("����� �ֹι�ȣ�� �Է��ϼ���. (012345-1234567) >> ");
			Scanner sc = new Scanner(System.in);
			number = sc.next();

			gender = number.charAt(7);
			if (gender == '1' || gender == '3')
				System.out.println("����� �����Դϴ�.");
			else if (gender == '2' || gender == '4')
				System.out.println("����� �����Դϴ�.");
			else
				System.out.println("��ȿ���� ���� �ֹι�ȣ�Դϴ�.");

			System.out.print("�Է��� ����ϰڽ��ϱ�? (y/n)");
			choice = sc.next();
		} while (!choice.equals("n"));
	}
}