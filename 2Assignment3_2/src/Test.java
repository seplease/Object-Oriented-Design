import java.util.*;
public class Test {
	public static void main(String[] args) {
		Book obj1 = new Book();
		Magazine obj2 = new Magazine();
		String title;
		int page;
		String author;
		String date;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �̸���? ");
		obj1.setTitle(sc.next());
		System.out.print("����������? ");
		obj1.setPage(sc.nextInt());
		sc.nextLine(); //���� ����
		System.out.print("���� �̸���? ");
		obj1.setAuthor(sc.next());
		System.out.print("�߸�����? ");
		obj2.setDate(sc.next());
		
		System.out.println("å �̸� : " + obj1.getTitle());
		System.out.println("�������� : " + obj1.getPage());
		System.out.println("���� : " + obj1.getAuthor());
		System.out.println("�߸��� : " + obj2.getDate());
	}
}