import java.util.*;
public class Week1_2 {
	public static void main(String[] args) {
		String input = "";
		char c = 1;
		
		while (c != '0') {
			System.out.print("���ڸ� �Է��ϼ��� : ");
			Scanner sc = new Scanner(System.in);
			input = sc.next();
			c = input.charAt(0);
			
			if (65 <= c && c <= 90)
				System.out.println(input.valueOf(c).toLowerCase());
			else if (97 <= c && c <= 122)
				System.out.println(input.valueOf(c).toUpperCase());
			else if (c == '0')
				break;
			else
				System.out.println("�����ڰ� �ƴմϴ�");
		}
	}
}