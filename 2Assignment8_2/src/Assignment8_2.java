import java.util.*;
public class Assignment8_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char[] day = { '일', '월', '화', '수', '목', '금', '토' };
		
		while(true) {
			System.out.print("정수를 입력하세요>>");
			try {
				int n = sc.nextInt();
				if (n < 0) {
					System.out.println("프로그램을 종료합니다...");
					break;
				}
				System.out.println(day[n]);
			} catch (InputMismatchException e) {
				System.out.println("경고! 수를 입력하지  않았습니다.");
				sc.nextLine();
			}
		}
	}
}