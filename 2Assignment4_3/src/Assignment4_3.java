import java.util.*;
public class Assignment4_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		int size = 0;
		String name;
		String tel;
		int i, j;
		String[][] members = null;
				
		System.out.println("----------------------------------------------------");
		System.out.println("1. ȸ���� | 2. �����Է� | 3. ȸ������Ʈ | 4. ����");
		System.out.println("----------------------------------------------------");
		while (choice < 5) {
		System.out.print("����> ");
		choice = sc.nextInt();
		
		if (choice == 1) {
			System.out.print("ȸ����> ");
			size = sc.nextInt();
			sc.nextLine(); // ���� ����
			members = new String[size][2];
		}
		if (choice == 2) {
			for (i = 0; i < size; i++) {
					System.out.print("�̸��� �Է��ϼ��� : ");
					members[i][0] = sc.next();
					System.out.print("��ȭ��ȣ�� �Է��ϼ��� : ");
					members[i][1] = sc.next();
			}
		}
		if (choice == 3) {
			System.out.println("** ȸ������ **");
			for (i = 0; i < size; i++)
					System.out.println(members[i][0] + " " + members[i][1]);
		}
		System.out.println("----------------------------------------------------");
		System.out.println("1. ȸ���� | 2. �����Է� | 3. ȸ������Ʈ | 4. ����");
		System.out.println("----------------------------------------------------");
		}
	}
}