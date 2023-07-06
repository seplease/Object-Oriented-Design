import java.util.*;
public class Assignment3_1 {
	public static void main(String[] args) {
		int num;
		String title;
		String author;
		int i;
		int flag = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("책의 권수>>");
		num = sc.nextInt();
		sc.nextLine(); // 버퍼 비우기
		Book[] book = new Book[num];
		
		for (i = 0; i < book.length; i++) {
			System.out.print("제목>>");
			title = sc.nextLine();
			System.out.print("저자>>");
			author = sc.nextLine();
			book[i] = new Book(title, author);
		}
		
		for (i = 0; i < book.length; i++)
			System.out.println(book[i].toString());
		
		System.out.print("찾으려는 책의 제목은>>");
		String find = sc.nextLine();
		
		for (i = 0; i < book.length; i++) {
			if (find.equals(book[i].getTitle())) {
				System.out.println("저자는 : " + book[i].getAuthor());
				flag = 1;
				break;
			}
		}
		
		if (flag == 0)
			System.out.println("찾으려는 책 없습니다.");
	}
}