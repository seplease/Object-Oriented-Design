import java.util.*;

public class Assignment9_2 {
	public static void main(String[] args) {
		String text;
		int token;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���ٷ� ������ �Է��ϼ���. (����� exit�� �Է�) >>");
		text = sc.nextLine();
		
		while (true) {
			StringTokenizer str = new StringTokenizer(text, " ");
			System.out.println("���� ������ " + str.countTokens());
			
			token = 0;
			while (str.hasMoreTokens()) {
				str.nextToken();
				token++;
			}
			System.out.println("������ ������ " + token);
			
			System.out.print("���ٷ� ������ �Է��ϼ���. (����� exit�� �Է�) >>");
			text = sc.nextLine();
			
			if (text.equals("exit"))
				break;
		}
	}
}