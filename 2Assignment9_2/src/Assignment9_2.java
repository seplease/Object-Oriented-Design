import java.util.*;

public class Assignment9_2 {
	public static void main(String[] args) {
		String text;
		int token;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("한줄로 문장을 입력하세요. (종료는 exit를 입력) >>");
		text = sc.nextLine();
		
		while (true) {
			StringTokenizer str = new StringTokenizer(text, " ");
			System.out.println("어절 개수는 " + str.countTokens());
			
			token = 0;
			while (str.hasMoreTokens()) {
				str.nextToken();
				token++;
			}
			System.out.println("공백의 개수는 " + token);
			
			System.out.print("한줄로 문장을 입력하세요. (종료는 exit를 입력) >>");
			text = sc.nextLine();
			
			if (text.equals("exit"))
				break;
		}
	}
}