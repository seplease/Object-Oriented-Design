import java.util.*;
public class Assignment3_3 {
	public static void main(String[] args) {
		Book[] b = new Book[2];
		String title;
		String author;
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < b.length; i++) {
			System.out.print("����>>");
			title = sc.nextLine();
			System.out.print("����>>");
			author = sc.nextLine();
			b[i] = new Book(title, author);
		}
		
		for (int i = 0; i < b.length; i++)
			System.out.println("(" + b[i].title + ", " + b[i].author + ")");
	}
}