import java.util.*;
public class Assignment3_1 {
	public static void main(String[] args) {
		int num;
		String title;
		String author;
		int i;
		int flag = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("å�� �Ǽ�>>");
		num = sc.nextInt();
		sc.nextLine(); // ���� ����
		Book[] book = new Book[num];
		
		for (i = 0; i < book.length; i++) {
			System.out.print("����>>");
			title = sc.nextLine();
			System.out.print("����>>");
			author = sc.nextLine();
			book[i] = new Book(title, author);
		}
		
		for (i = 0; i < book.length; i++)
			System.out.println(book[i].toString());
		
		System.out.print("ã������ å�� ������>>");
		String find = sc.nextLine();
		
		for (i = 0; i < book.length; i++) {
			if (find.equals(book[i].getTitle())) {
				System.out.println("���ڴ� : " + book[i].getAuthor());
				flag = 1;
				break;
			}
		}
		
		if (flag == 0)
			System.out.println("ã������ å �����ϴ�.");
	}
}