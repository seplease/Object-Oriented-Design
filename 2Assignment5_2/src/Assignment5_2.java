import java.util.*;

public class Assignment5_2 {
	public static void main(String[] args) {
		int[] arr = new int[6];
		int count = 0;
		Scanner sc = new Scanner(System.in);
		
		while (count <= 5) {
			System.out.println("------------------------------------------------");
			for (int i = 1; i < 6; i++) {
				System.out.print(i + " ");
			}
			System.out.println();
			System.out.println("------------------------------------------------");
			for (int i = 0; i < 5; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();

			System.out.print("원하시는 좌석번호를 입력하세요 : ");
			int choose = sc.nextInt();
			if (arr[choose - 1] == 0) {
				arr[choose - 1] = 1;
				System.out.println("예약되었습니다.");
				count++;
			} else
				System.out.println("이미 예약된 자리입니다.");

			if (count == 5) {
				System.out.println("------------------------------------------------");
				for (int i = 1; i < 6; i++) {
					System.out.print(i + " ");
				}
				System.out.println(" ");
				System.out.println("------------------------------------------------");
				for (int i = 0; i < 5; i++) {
					System.out.print(arr[i] + " ");
				}
				System.out.println(" ");
				System.out.println("만석입니다.");
				break;
			}
		}
	}
}

//https://wogus789789.tistory.com/4