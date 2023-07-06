import java.util.*;
public class Week2_4 {
	public static void main(String[] args) {
		int a1, a2;
		int b1, b2, b3;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("두 수를 입력하세요 : ");
		a1 = sc.nextInt();
		a2 = sc.nextInt();
		System.out.print("세 수를 입력하세요 : ");
		b1 = sc.nextInt();
		b2 = sc.nextInt();
		b3 = sc.nextInt();
		
		System.out.print("두 수의 평균 : " + Average.getAverage(a1, a2));
		System.out.println();
		System.out.print("세 수의 평균 : " + Average.getAverage(b1, b2, b3));
	}
}