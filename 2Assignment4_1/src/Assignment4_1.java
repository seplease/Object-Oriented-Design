import java.util.*;
public class Assignment4_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i;
		String id;
		String name;
		
		System.out.print("�迭�� ũ���>>");
		int n = sc.nextInt();
		Student[] students = new Student[n];
		
		for (i = 0; i < students.length; i++) {
			System.out.print("�й�>>");
			id = sc.next();
			System.out.print("�̸�>>");
			name = sc.next();
			students[i] = new Student(id, name);
		}
		Arrays.sort(students);
		for (Student s : students)
			System.out.println("�й� = " + s.id + ", �̸� = " + s.name);
	}
}