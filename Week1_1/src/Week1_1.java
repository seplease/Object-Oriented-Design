import java.util.*;
public class Week1_1 {
	public static void main(String[] args) {
		int count = 0;
		double sum = 0;
		double average = 0;
		int n = -1;
		
		System.out.println("정수를 입력하고 마지막에 0을 입력하세요");
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		while (n != 0) {
			count++;
			sum += n;
			n = sc.nextInt();
		}
		
		average = sum / (double)(count);
		
		System.out.print("입력한 수의 개수: " + count + "\n");
		System.out.print("평균: " + average);
	}
}