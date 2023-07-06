import java.util.*;
public class Week2_5 {
	public static void main(String[] args) {
		String str = "";
		String reverse = "";
		
		System.out.println("문자열을 입력하시오:");
		Scanner sc = new Scanner(System.in);
		str = sc.next();
		
		for (int i = str.length() - 1; i >= 0; i--)
			reverse += str.charAt(i);
		
		System.out.println(reverse);
	}
}