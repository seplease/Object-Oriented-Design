import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.*;
import java.util.*;

public class Assignment13_2 {
	public static void main(String[] args) throws Exception {
		String num;
		String name;
		String phone;
		String mail;
		int flag = 1;
		String searchNum;
		String search;
		
		PrintWriter out = null;
		
		Scanner sc = new Scanner(System.in);
		
		while (flag != 0) {
			System.out.print("����� ��ȣ�� �Է��ϼ��� >>");
			num = sc.next();
			System.out.print("����� �̸��� �Է��ϼ��� >>");
			name = sc.next();
			System.out.print("����� ��ȭ��ȣ�� �Է��ϼ��� >>");
			phone = sc.next();
			System.out.print("����� ������ �Է��ϼ��� >>");
			mail = sc.next();
			
			try {
				out = new PrintWriter("result.txt");
				out.print(num + ", " + name + ", " + phone + ", ");
				out.println(mail);
				out.flush();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			System.out.print("�Է��� �������� 0, ����Ϸ��� 1�� �Է��ϼ��� >>");
			flag = sc.nextInt();
		}
		
		System.out.print("�˻��� ����� ��ȣ�� �Է��ϼ��� >>");
		searchNum = sc.next();
		search = searchNum + "";
		sc = new Scanner(new BufferedReader(new FileReader("result.txt")));
		sc.useDelimiter(",");
		while (sc.hasNext()) {
			num = sc.next();
			name = sc.next();
			phone = sc.next();
			mail = sc.next();
			
			if (num.equals(searchNum))
				System.out.println("����� ��ȣ " + searchNum + "�� ��ȭ��ȣ�� " + phone + "�Դϴ�");
		}
	}
}