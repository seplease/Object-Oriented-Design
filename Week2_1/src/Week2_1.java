import java.util.*;
public class Week2_1 {
	public static void main(String[] args) {
		int[] arrNum = new int[5];
		double sum = 0;
		String[] arrName = new String[5];
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ��� : ");
		for (int i : arrNum) {
			arrNum[i] = sc.nextInt();
			sum += (double)arrNum[i];
		}
		System.out.println("���� " + sum);
		
		System.out.print("�̸��� �Է��ϼ��� : ");
		for (int j = 0; j < 5; j++)
			arrName[j] = sc.next();		
		System.out.print("�Էµ� �̸��� ");
		for (String e : arrName)
			System.out.print(e + " ");
	}
}