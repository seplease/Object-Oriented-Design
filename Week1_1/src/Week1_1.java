import java.util.*;
public class Week1_1 {
	public static void main(String[] args) {
		int count = 0;
		double sum = 0;
		double average = 0;
		int n = -1;
		
		System.out.println("������ �Է��ϰ� �������� 0�� �Է��ϼ���");
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		while (n != 0) {
			count++;
			sum += n;
			n = sc.nextInt();
		}
		
		average = sum / (double)(count);
		
		System.out.print("�Է��� ���� ����: " + count + "\n");
		System.out.print("���: " + average);
	}
}