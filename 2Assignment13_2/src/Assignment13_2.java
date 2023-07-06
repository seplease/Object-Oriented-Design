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
			System.out.print("사용자 번호를 입력하세요 >>");
			num = sc.next();
			System.out.print("사용자 이름을 입력하세요 >>");
			name = sc.next();
			System.out.print("사용자 전화번호를 입력하세요 >>");
			phone = sc.next();
			System.out.print("사용자 메일을 입력하세요 >>");
			mail = sc.next();
			
			try {
				out = new PrintWriter("result.txt");
				out.print(num + ", " + name + ", " + phone + ", ");
				out.println(mail);
				out.flush();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			System.out.print("입력이 끝났으면 0, 계속하려면 1을 입력하세요 >>");
			flag = sc.nextInt();
		}
		
		System.out.print("검색할 사용자 번호를 입력하세요 >>");
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
				System.out.println("사용자 번호 " + searchNum + "의 전화번호는 " + phone + "입니다");
		}
	}
}