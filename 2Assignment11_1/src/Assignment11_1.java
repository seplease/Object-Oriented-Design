import java.util.*;

public class Assignment11_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = "";
		Map<String, String> map = new HashMap<String, String>();
		map.put("java", "자바");
		map.put("school", "학교");
		map.put("map", "지도");

		System.out.println("*** ketSet() ***");
		Set<String> keys = map.keySet();
		Iterator<String> i = keys.iterator();
		while (i.hasNext()) {
			String key = i.next();
			System.out.println("단어 : " + key + ", 의미 : " + map.get(key));
		}

		System.out.println("*** entrySet() ***");
		for (Map.Entry<String, String> entry : map.entrySet()) {
			System.out.println("(" + entry.getKey() + ", " + entry.getValue() + ")");
		}

		System.out.print("\n\n");
		while (name != "0") {
			System.out.print("찾고 싶은 단어 : ");
			name = sc.next();

			if (name.equals("quit")) {
				System.out.println("프로그램 종료");
				break;
			}

			if (map.containsKey(name))
				System.out.println("단어의 의미는 " + map.get(name));
			else
				System.out.println("찾는 단어가 없습니다.");
		}
	}
}