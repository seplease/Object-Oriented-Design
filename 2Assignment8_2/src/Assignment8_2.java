import java.util.*;
public class Assignment8_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char[] day = { '��', '��', 'ȭ', '��', '��', '��', '��' };
		
		while(true) {
			System.out.print("������ �Է��ϼ���>>");
			try {
				int n = sc.nextInt();
				if (n < 0) {
					System.out.println("���α׷��� �����մϴ�...");
					break;
				}
				System.out.println(day[n]);
			} catch (InputMismatchException e) {
				System.out.println("���! ���� �Է�����  �ʾҽ��ϴ�.");
				sc.nextLine();
			}
		}
	}
}