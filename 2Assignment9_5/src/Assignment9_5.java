import java.util.*;

public class Assignment9_5 {
	public static void main(String[] args) {
		// ArrayList<Integer> list1 = new ArrayList<Integer>();
		// ArrayList<Float> list2 = new ArrayList<Float>();
		Integer i;
		Float f;

		Scanner sc = new Scanner(System.in);

		System.out.print("정수를 입력하세요>> ");
		i = sc.nextInt();
		System.out.print("정수를 입력하세요>> ");
		f = sc.nextFloat();

		a(i);
		a(f);
	}

	public static <T> void a(T num) {
		System.out.println(num + "의 클래스 이름 : " + num.getClass().getName());
	}
}