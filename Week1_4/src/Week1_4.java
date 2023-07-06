import java.util.*;
public class Week1_4 {
	public static void main(String[] args) {
		String input = "";
		char c = 1;
		
		System.out.print("16진수 한 글자 입력 : ");
		Scanner sc = new Scanner(System.in);
		input = sc.next();
		c = input.charAt(0);
		
		if (c >= 48 && c <= 57)
			System.out.printf("10진수 ==> %d", c - 48);
		else if (c >= 65 && c <= 70)
			   System.out.printf("10진수 ==> %d", c - 55);
		else if (c >= 97 && c <= 102)
			   System.out.printf("10진수 ==> %d", c - 87);
		else
			System.out.printf("16진수가 아님");
	}
}