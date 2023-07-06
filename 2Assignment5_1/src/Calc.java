import java.util.*;

public abstract class Calc {
	public static void main(String[] args) {
		int a, b;
		char oper;
		int result = 0;

		Scanner sc = new Scanner(System.in);
		System.out.print("�� ������ �����ڸ� �Է��Ͻÿ�>> ");
		a = sc.nextInt();
		b = sc.nextInt();
		oper = sc.next().charAt(0);
		switch (oper) {
		case '+':
			Add add = new Add();
			add.setValue(a, b);
			result = add.calculate();
			break;
		case '-':
			Sub sub = new Sub();
			sub.setValue(a, b);
			result = sub.calculate();
			break;
		case '*':
			Mul mul = new Mul();
			mul.setValue(a, b);
			result = mul.calculate();
			break;
		case '/':
			Div div = new Div();
			div.setValue(a, b);
			result = div.calculate();
			break;
		}
		System.out.println(result);
		sc.close();
	}
}

//https://security-nanglam.tistory.com/213