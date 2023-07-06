import java.util.*;
public class Week2_1 {
	public static void main(String[] args) {
		int[] arrNum = new int[5];
		double sum = 0;
		String[] arrName = new String[5];
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		for (int i : arrNum) {
			arrNum[i] = sc.nextInt();
			sum += (double)arrNum[i];
		}
		System.out.println("합은 " + sum);
		
		System.out.print("이름을 입력하세요 : ");
		for (int j = 0; j < 5; j++)
			arrName[j] = sc.next();		
		System.out.print("입력된 이름은 ");
		for (String e : arrName)
			System.out.print(e + " ");
	}
}