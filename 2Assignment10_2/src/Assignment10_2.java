import java.util.*;

public class Assignment10_2 {
	public static void main(String[] args) {
		Set<Member> list = new HashSet<Member>();
		String name;

		list.add(new Member("�̱浿", 30));
		list.add(new Member("ȫ�浿", 30));

		System.out.println("�� ��ü�� : " + list.size());
		Iterator e1 = list.iterator();
		while (e1.hasNext()) {
			Member m = (Member) e1.next();
			System.out.println("�̸� : " + m.name + ", ���� : " + m.age);
		}

		Scanner sc = new Scanner(System.in);

		System.out.println("ã�� �̸��� �Է� : ");
		name = sc.next();

		Iterator e2 = list.iterator();
		if (e2.hasNext())
			System.out.println("ã�� �����Ͱ� �ִ�");
		else
			System.out.println("ã�� �����Ͱ� ����");

		System.out.print("�����Ϸ��� �̸� �Է� : ");
		name = sc.next();
		if (list.contains(name)) {
			list.remove(name);
			System.out.println(name + " ȸ���� �����ϴ�");
		} else
			System.out.println(name + " ȸ���� ������");
	}
}