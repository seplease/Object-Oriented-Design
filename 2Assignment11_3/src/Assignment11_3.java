import java.util.*;
public class Assignment11_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, String> person = new HashMap<String, String>();
		int n;
		String name;
		
		System.out.print("�Է��Ϸ��� �������� ���� : ");
		n = sc.nextInt();
		
		System.out.println("�̸��� ��ȭ��ȣ�� �Է��ϼ���. (��: ȫ�浿 010-111-1212)");
		for (int i = 0; i < n; i++) {
			System.out.print(i + 1 + ". �̸�, ��ȭ��ȣ>> ");
			person.put(sc.next(), sc.next());
		}
		
		System.out.print("\n��ȭ��ȣ�� ã������ ȸ���� �̸��� : ");
		name = sc.next();
		if (!person.containsKey(name)) // if (person.get(name) == null)
			System.out.println("�ش��ϴ� �̸��� ȸ���� ����Ʈ�� �����ϴ�.");
		else
			System.out.println(name + "�� ��ȭ��ȣ�� : " + person.get(name));
	}
}