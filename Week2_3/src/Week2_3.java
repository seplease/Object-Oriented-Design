import java.util.*;
public class Week2_3 {
	public static void main(String[] args) {
		int[] array = new int[100];
		int sum = 0;
		double average = 0;
		
		System.out.println("random() ���� �߻��� �� : ");
		for (int i = 0; i < 100; i++) {
			if (i % 10 == 0 && i != 0)
				System.out.println();
			array[i] = (int)(Math.random() * 100 + 1);
			System.out.printf("%5d", array[i]);
			sum += array[i];
			average = sum / 100;
		}
		System.out.println("\n�հ� : " + sum);
		System.out.println("��� : " + average);
	}
}