import java.util.*;

public class Assignment9_1 {
	public static void main(String[] args) {
		String text;
		String[] list;
		int i = 0;

		Scanner sc = new Scanner(System.in);

		System.out.print("�ܾ� ���ڿ��� �Է��ϼ���>> ");
		text = sc.nextLine();

		StringTokenizer str = new StringTokenizer(text, " ");
		list = new String[str.countTokens()];

		System.out.println("��� " + str.countTokens() + "���� �ܾ �ֽ��ϴ�.");

		System.out.println(" [�и��� ��ū]");
		while (str.hasMoreTokens()) {
			list[i] = str.nextToken();
			System.out.println(list[i++]);
		}
		System.out.println(" ��ū�� : " + i);

		System.out.println("===== sort =====");
		Arrays.sort(list);
		for (int j = 0; j < i; j++)
			System.out.println(list[j]);
	}
}