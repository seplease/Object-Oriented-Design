import java.util.*;

public class Assignment10_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("3���� �̸��� �Է� :");
		TreeSet<String> treeSet = new TreeSet<String>();
		treeSet.add(sc.next());
		treeSet.add(sc.next());
		treeSet.add(sc.next());

		NavigableSet<String> decendingSet = treeSet.descendingSet();

		System.out.print("[");
		for (String s : decendingSet)
			System.out.print(s + " , ");
		System.out.print("]");
		
		/*
		TreeSet<Member> treeSet = new TreeSet<>();
		String name;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("3���� �̸��� �Է� : ");
		for (int i = 0; i < 3; i++) {
			name = sc.next();
			treeSet.add(new Member(name));
		}
		
		Collections.sort(treeSet);
		*/
	}
}