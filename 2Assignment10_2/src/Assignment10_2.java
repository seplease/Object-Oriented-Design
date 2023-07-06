import java.util.*;

public class Assignment10_2 {
	public static void main(String[] args) {
		Set<Member> list = new HashSet<Member>();
		String name;

		list.add(new Member("이길동", 30));
		list.add(new Member("홍길동", 30));

		System.out.println("총 객체수 : " + list.size());
		Iterator e1 = list.iterator();
		while (e1.hasNext()) {
			Member m = (Member) e1.next();
			System.out.println("이름 : " + m.name + ", 나이 : " + m.age);
		}

		Scanner sc = new Scanner(System.in);

		System.out.println("찾는 이름을 입력 : ");
		name = sc.next();

		Iterator e2 = list.iterator();
		if (e2.hasNext())
			System.out.println("찾는 데이터가 있다");
		else
			System.out.println("찾는 데이터가 없다");

		System.out.print("삭제하려는 이름 입력 : ");
		name = sc.next();
		if (list.contains(name)) {
			list.remove(name);
			System.out.println(name + " 회원은 없습니다");
		} else
			System.out.println(name + " 회원이 삭제됨");
	}
}