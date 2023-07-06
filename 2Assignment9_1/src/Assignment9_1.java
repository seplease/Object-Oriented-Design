import java.util.*;

public class Assignment9_1 {
	public static void main(String[] args) {
		String text;
		String[] list;
		int i = 0;

		Scanner sc = new Scanner(System.in);

		System.out.print("단어 문자열을 입력하세요>> ");
		text = sc.nextLine();

		StringTokenizer str = new StringTokenizer(text, " ");
		list = new String[str.countTokens()];

		System.out.println("모두 " + str.countTokens() + "개의 단어가 있습니다.");

		System.out.println(" [분리된 토큰]");
		while (str.hasMoreTokens()) {
			list[i] = str.nextToken();
			System.out.println(list[i++]);
		}
		System.out.println(" 토큰수 : " + i);

		System.out.println("===== sort =====");
		Arrays.sort(list);
		for (int j = 0; j < i; j++)
			System.out.println(list[j]);
	}
}