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
		
		System.out.print("잡지 이름은? ");
		obj1.setTitle(sc.next());
		System.out.print("페이지수는? ");
		obj1.setPage(sc.nextInt());
		sc.nextLine(); //버퍼 비우기
		System.out.print("저자 이름은? ");
		obj1.setAuthor(sc.next());
		System.out.print("발매일은? ");
		obj2.setDate(sc.next());
		
		System.out.println("책 이름 : " + obj1.getTitle());
		System.out.println("페이지수 : " + obj1.getPage());
		System.out.println("저자 : " + obj1.getAuthor());
		System.out.println("발매일 : " + obj2.getDate());
	}
}