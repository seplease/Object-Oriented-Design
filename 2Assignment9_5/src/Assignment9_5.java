import java.util.*;

public class Assignment9_5 {
	public static void main(String[] args) {
		// ArrayList<Integer> list1 = new ArrayList<Integer>();
		// ArrayList<Float> list2 = new ArrayList<Float>();
		Integer i;
		Float f;

		Scanner sc = new Scanner(System.in);

		System.out.print("������ �Է��ϼ���>> ");
		i = sc.nextInt();
		System.out.print("������ �Է��ϼ���>> ");
		f = sc.nextFloat();

		a(i);
		a(f);
	}

	public static <T> void a(T num) {
		System.out.println(num + "�� Ŭ���� �̸� : " + num.getClass().getName());
	}
}