import java.util.*;
public class Week2_6 {
	public static void main(String[] args) {
		Phone obj1 = new Phone();
		Phone obj2 = new Phone();
		String name = "";
		String tel = "";
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름, 전화번호를 입력하세요. >> ");
		obj1.setName(sc.next());
		obj1.setTel(sc.next());
		System.out.println(obj1.getName() + "의 번호는 " + obj1.getTel());
		System.out.print("이름, 전화번호를 입력하세요. >> ");
		obj2.setName(sc.next());
		obj2.setTel(sc.next());
		System.out.println(obj2.getName() + "의 번호는 " + obj2.getTel());
	}
}