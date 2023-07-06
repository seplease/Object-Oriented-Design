import java.util.*;

public class Assignment11_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = "";
		Map<String, String> map = new HashMap<String, String>();
		map.put("java", "�ڹ�");
		map.put("school", "�б�");
		map.put("map", "����");

		System.out.println("*** ketSet() ***");
		Set<String> keys = map.keySet();
		Iterator<String> i = keys.iterator();
		while (i.hasNext()) {
			String key = i.next();
			System.out.println("�ܾ� : " + key + ", �ǹ� : " + map.get(key));
		}

		System.out.println("*** entrySet() ***");
		for (Map.Entry<String, String> entry : map.entrySet()) {
			System.out.println("(" + entry.getKey() + ", " + entry.getValue() + ")");
		}

		System.out.print("\n\n");
		while (name != "0") {
			System.out.print("ã�� ���� �ܾ� : ");
			name = sc.next();

			if (name.equals("quit")) {
				System.out.println("���α׷� ����");
				break;
			}

			if (map.containsKey(name))
				System.out.println("�ܾ��� �ǹ̴� " + map.get(name));
			else
				System.out.println("ã�� �ܾ �����ϴ�.");
		}
	}
}