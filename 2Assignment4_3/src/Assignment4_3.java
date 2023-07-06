import java.util.*;
public class Assignment4_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		int size = 0;
		String name;
		String tel;
		int i, j;
		String[][] members = null;
				
		System.out.println("----------------------------------------------------");
		System.out.println("1. 회원수 | 2. 정보입력 | 3. 회원리스트 | 4. 종료");
		System.out.println("----------------------------------------------------");
		while (choice < 5) {
		System.out.print("선택> ");
		choice = sc.nextInt();
		
		if (choice == 1) {
			System.out.print("회원수> ");
			size = sc.nextInt();
			sc.nextLine(); // 버퍼 비우기
			members = new String[size][2];
		}
		if (choice == 2) {
			for (i = 0; i < size; i++) {
					System.out.print("이름을 입력하세요 : ");
					members[i][0] = sc.next();
					System.out.print("전화번호를 입력하세요 : ");
					members[i][1] = sc.next();
			}
		}
		if (choice == 3) {
			System.out.println("** 회원정보 **");
			for (i = 0; i < size; i++)
					System.out.println(members[i][0] + " " + members[i][1]);
		}
		System.out.println("----------------------------------------------------");
		System.out.println("1. 회원수 | 2. 정보입력 | 3. 회원리스트 | 4. 종료");
		System.out.println("----------------------------------------------------");
		}
	}
}