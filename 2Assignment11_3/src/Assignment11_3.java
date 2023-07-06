import java.util.*;
public class Assignment11_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, String> person = new HashMap<String, String>();
		int n;
		String name;
		
		System.out.print("입력하려는 데이터의 수는 : ");
		n = sc.nextInt();
		
		System.out.println("이름과 전화번호를 입력하세요. (예: 홍길동 010-111-1212)");
		for (int i = 0; i < n; i++) {
			System.out.print(i + 1 + ". 이름, 전화번호>> ");
			person.put(sc.next(), sc.next());
		}
		
		System.out.print("\n전화번호를 찾으려는 회원의 이름은 : ");
		name = sc.next();
		if (!person.containsKey(name)) // if (person.get(name) == null)
			System.out.println("해당하는 이름의 회원은 리스트에 없습니다.");
		else
			System.out.println(name + "의 전화번호는 : " + person.get(name));
	}
}